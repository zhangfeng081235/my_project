package com.myself.devp.myrediscenter.rabbitmq;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.ReturnListener;

import java.io.IOException;

public class ProducerReturnListener implements ReturnListener {

    @Override
    public void handleReturn(int i, String s, String s1, String s2, AMQP.BasicProperties basicProperties, byte[] bytes) throws IOException {
        System.out.println("参数1状态码："+i);
        System.out.println("参数2："+s);
        System.out.println("参数3："+s1);
        System.out.println("参数4："+s2);
        System.out.println("消息返回监听："+new String(bytes,"UTF-8"));
    }
}
