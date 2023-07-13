package vip.chen.rabbitmqconsumer.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: TrueNewBee
 * @Date: 2023/7/9 18:12
 * @Github: https://github.com/TrueNewBee
 * @Description: MQ 消费者的 直行交换机的配置类
 */
@Configuration
public class DirectRabbitConfig {

    //队列 起名：TestDirectQueue
    @Bean
    public Queue testDirectQueue() {
        return new Queue("testDirectQueue", true);
    }

    //Direct交换机 起名：TestDirectExchange
    @Bean
    DirectExchange testDirectExchange() {
        return new DirectExchange("testDirectExchange");
    }

    //绑定  将队列和交换机绑定, 并设置用于匹配键：TestDirectRouting
    @Bean
    Binding bindingDirect() {
        return BindingBuilder.bind(testDirectQueue()).to(testDirectExchange()).with("testDirectRouting");
    }
}