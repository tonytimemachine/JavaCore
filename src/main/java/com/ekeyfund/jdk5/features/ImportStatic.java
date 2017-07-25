package com.ekeyfund.jdk5.features;

import static  com.ekeyfund.javacore.util.ArrayUtils.*;//通过JDK5的静态导入导入ArrayUtils类的clone方法

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;


/**
 * 静态导入
 *
 * @author tony liuguanglei@ekeyfund.com
 * @create 2017-07-25-下午3:57
 * @see
 * @since JDK1.8u141
 */
public class ImportStatic {


    private static final Logger logger = LogManager.getLogger(ImportStatic.class);

    public static void main(String[]args){


       final String[]platforms= {"MacOS","Windows","Linux"};

        final  String[]clonePlatforms=cloneElements(platforms);

        logger.info("clone platform is  "+ Arrays.toString(clonePlatforms));
    }
}
