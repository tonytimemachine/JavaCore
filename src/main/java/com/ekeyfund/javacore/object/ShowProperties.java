package com.ekeyfund.javacore.object;

import org.apache.commons.lang3.SystemUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Show Current System Properties
 *
 * @author tony liuguanglei@ekeyfund.com
 * @create 2017-07-25-下午12:02
 * @see
 * @since JDK1.8u141
 */
public class ShowProperties {


    private static final Logger logger = LogManager.getLogger(ShowProperties.class);

    public static void main(String[]args){
        logger.info(SystemUtils.getJavaHome());//获取JAVA_HOME
        logger.info(SystemUtils.getUserHome());//获取User Home Directory
        logger.info(SystemUtils.JAVA_VERSION);//获取Java版本信息
        logger.info(SystemUtils.JAVA_LIBRARY_PATH);
    }
}
