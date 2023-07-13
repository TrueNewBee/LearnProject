package vip.chen.rabbitmqconsumer.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Author: TrueNewBee
 * @Date: 2023/7/9 18:43
 * @Github: https://github.com/TrueNewBee
 * @Description: MQ的监听类
 */
@Component
@RabbitListener(queues = "testDirectQueue")//监听的队列名称 testDirectQueue
public class DirectReceiver {

    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("DirectReceiver消费者收到消息  : " + testMessage.toString());
    }

}