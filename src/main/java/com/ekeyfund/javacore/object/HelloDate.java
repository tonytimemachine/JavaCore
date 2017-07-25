package com.ekeyfund.javacore.object;

import com.ekeyfund.javacore.util.DateUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Show Current Date
 *
 * @author tony liuguanglei@ekeyfund.com
 * @create 2017-07-25-上午11:45
 * @see
 * @since JDK1.8u141
 */
public class HelloDate {

    private static final Logger logger = LogManager.getLogger(HelloDate.class);


    public static void main(String[]args){

        logger.info("Hello,It's");
        logger.info(DateUtils.getCurrentDate());
    }
}
