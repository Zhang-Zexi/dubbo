package com.zzx.dubbo.demo;

import java.util.Scanner;
/**
 * @ClassName ScannerDemo
 * @Description 演示ScannerDemo的用法
 * @Author zhangzx
 * @Date 2020/1/4 16:00
 * Version 1.0
 **/
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据

        // next方式接收字符串
        System.out.println("next方式接收：");
        // 判断是否还有输入
        if (scan.hasNext()) {
            String str1 = scan.next();
            System.out.println("输入的数据为：" + str1);
        }
        scan.close();
    }
}
