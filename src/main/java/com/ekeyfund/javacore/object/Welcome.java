package com.ekeyfund.javacore.object;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This program displays a greeting for the reader.
 *
 * @author tony liuguanglei@ekeyfund.com
 * @create 2017-07-25-上午10:44
 * @see
 * @since JDK1.8u141
 */
public class Welcome {

    private static final Logger logger = LogManager.getLogger(Welcome.class);


    public static void main(String[]args){

        String[]books={"Java编程思想","Java核心技术","Java并发编程实战","Java性能优化指南","图解设计模式"};


        //循环遍历数组中的元素
        for(int i=0;i<books.length;i++){


            logger.info("遍历数组元素 "+books[i]);

        }

    }
}
