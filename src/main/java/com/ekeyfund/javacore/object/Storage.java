package com.ekeyfund.javacore.object;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 方法调用机制
 *
 * @author tony liuguanglei@ekeyfund.com
 * @create 2017-07-25-下午2:45
 * @see
 * @since JDK1.8u141
 */
public class Storage {
    private static final Logger logger = LogManager.getLogger(Storage.class);


    //初始化字符串
    String s ="Hello World"; //每个空格占据一个长度

    /**
     * 返回传递字符串参数2倍长度
     * @param s
     * @return
     */
    int storage(String s){
        return s.length()*2;
    }


    void println(){

        logger.info("execute method storage的结果为"+storage(s));
    }


    public static void main(String[]args){
        Storage ref=new Storage();
        ref.println();
    }
}
