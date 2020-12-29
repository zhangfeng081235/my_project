package com.myself.devp.myrediscenter.rabbitmq;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Consumer {
    private final static  String    QUEUE="myqueue";
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
            connection= conn.newConnection();
            channel = connection.createChannel();
            channel.queueDeclare(QUEUE,true,false,false,null);
            channel.basicConsume(QUEUE,true,new DefaultConsumer(channel){
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                    String exchange = envelope.getExchange();
                    long deliveryTag = envelope.getDeliveryTag();
                    System.out.println(deliveryTag+"收到的消息："+new String(body,"UTF-8"));
                    super.handleDelivery(consumerTag, envelope, properties, body);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }finally {
            try {
                channel.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
