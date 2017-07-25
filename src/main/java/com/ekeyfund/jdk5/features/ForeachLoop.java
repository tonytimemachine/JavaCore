package com.ekeyfund.jdk5.features;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Foreach Loop
 *
 * @author tony liuguanglei@ekeyfund.com
 * @create 2017-07-25-下午3:34
 * @see
 * @since JDK1.8u141
 */
public class ForeachLoop {

    private static final Logger logger = LogManager.getLogger();


    public static void main(String[]args){

       String[]movies =new String[]{"变形金刚","谍影重重","速度与激情"};


        //JDK1.5 foreach循环
        for(String movie:movies){

            logger.info("movie "+movie);
        }
    }
}
