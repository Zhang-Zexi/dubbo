package com.zzx.dubbo;

import java.util.Scanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName ConsumerClinet
 * @Description 客户端启动类
 * @Author zhangzx
 * @Date 2020/1/4 15:53
 * Version 1.0
 **/
public class ConsumerClinet {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-hello-consumer.xml");

        context.start();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String message = scanner.next();

            // 获取接口
            ServiceAPI serviceAPI = (ServiceAPI) context.getBean("consumerService");

            System.out.println(serviceAPI.sendMessage(message));
        }
    }

}
