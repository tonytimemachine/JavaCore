package com.ekeyfund.javacore.object;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/**
 * 读取键盘的输入,计算后并输出
 *
 * @author tony liuguanglei@ekeyfund.com
 * @create 2017-07-27-下午2:37
 * @see
 * @since JDK1.8u141
 */
public class InputOutput {
    private static final Logger logger = LogManager.getLogger(InputOutput.class);


    public static void main(String[]args){

        //创建一个键盘
        Scanner input =new Scanner(System.in);

        logger.info("请输入你的名字");

        String name =input.next();

        logger.info("请输入你的年龄");
        int age =input.nextInt();


        logger.info("你的名字是"+name+"你明年是"+ ++age +"岁");
    }
}
