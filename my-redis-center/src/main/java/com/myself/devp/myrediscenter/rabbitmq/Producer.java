package com.myself.devp.myrediscenter.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Producer {
    private static  final  String  QUEUE="myqueue";
    public static void main(String[] args) {
        ConnectionFactory conn = new ConnectionFactory();
        conn.setHost("172.29.196.31");
        conn.setPort(5672);
        conn.setUsername("admin");
        conn.setPassword("admin");
        conn.setVirtualHost("my_vhost");
        Connection connection =null;
        Channel channel=null;
        try {
             connection = conn.newConnection();
             channel = connection.createChannel();
            /**String queue, boolean durable, boolean exclusive, boolean autoDelete, Map<String, Object> arguments
             * queue :队列名称
             * durable： 是否持久化
             * exclusive：是否排他，是否独占连接，附列只允许在该连接中访问，如果connection 关闭则自动删除关闭队列，如果将此参数设置为true，可用于
             * 队列的创建
             * autoDelete： 自动删除，队列不在使用时候是否自动删除队列，如果将此参数和exclusive参数设置为true，就可以设置为临时队列，（队列不用了
             * 就自动删除）。
             * arguments：参数，可以设置为队列的扩展参数，比如可设置存活时间。
             *
             */
            channel.queueDeclare(QUEUE,true,false,false,null);
            /**
             *
             *  String exchange, String routingKey, boolean mandatory, BasicProperties props, byte[] body
             *  exchange:交换机 如果不指定将使用默认的
             *  routingKey：路由key，交换机根据l路由key 将消息转发到指定的队列，如果使用的是默认的交换机，routingkey 设置为队列的名称
             *  mandatory：如果消息没有被正确路由，消息将退回消息的生产者，生产者需要添加监听器：
             *  props：消息的属性
             */
            String msg="我在学习rabbitmq";
            channel.basicPublish(QUEUE,"",true,null,msg.getBytes("UTF-8"));
            channel.addReturnListener(new ProducerReturnListener());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }finally {
        }
    }
}
