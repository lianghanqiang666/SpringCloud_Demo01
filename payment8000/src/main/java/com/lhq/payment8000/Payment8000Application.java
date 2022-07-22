package com.lhq.payment8000;

import com.lhq.payment8000.controller.PaymentController;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
public class Payment8000Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Payment8000Application.class, args);
    }

}
