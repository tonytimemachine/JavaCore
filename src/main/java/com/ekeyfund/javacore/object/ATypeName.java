package com.ekeyfund.javacore.object;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * a type name
 *
 * @author tony liuguanglei@ekeyfund.com
 * @create 2017-07-25-下午2:24
 * @see
 * @since JDK1.8u141
 */
public class ATypeName {

    private static final Logger logger = LogManager.getLogger(ATypeName.class);


    public static void main(String[]args){
        ATypeName aTypeName=new ATypeName();

        logger.info("aTypeName :" +aTypeName);//full name@hashcode
    }
}
