package com.ekeyfund.jdk5.features;

import com.ekeyfund.javacore.object.HelloDate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * JDK5 自动拆装箱
 * 自动装箱:基本数据类型转换为引用数据类型（包装类）
 * 自动拆箱:引用数据类型转换为基本数据类型
 * @author tony liuguanglei@ekeyfund.com
 * @create 2017-07-25-下午3:22
 * @see
 * @since JDK1.8u141
 */
public class Autoboxing {


    private static final Logger logger = LogManager.getLogger(Autoboxing.class);


    public static void main(String[]args){
        Byte by=1; //自动装箱
        byte bt=by; //自动拆箱
        logger.info("byte = "+bt);


        Short sh =1;
        short st=sh;
        logger.info("short = "+st);

        Integer in =1;
        int  i=in;
        logger.info("int = "+i);

        Long lo =1L;
        long lg=lo;
        logger.info("long = "+lg);

        Boolean bl =true;
        boolean  b=bl;
        logger.info("boolean  = "+b);




        Character ch ='a';
        char c=ch;
        logger.info("char = "+c);

        Float fl =12.0f;
        float f  =fl;
        logger.info("float  = "+f);


        Double db=12.0d;
        double d =db;
        logger.info("double = "+d);

    }
}
