package com.ekeyfund.javacore.object;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * iterator args
 *
 * @author tony liuguanglei@ekeyfund.com
 * @create 2017-07-25-下午3:30
 * @see
 * @since JDK1.8u141
 */
public class ShowArgs {

    private static final Logger logger = LogManager.getLogger();


    public static void main(String[]args){

         args=new String[]{"变形金刚","谍影重重","速度与激情"};



         if(args.length<3){

             logger.info("需要三个参数");

             System.exit(1); //异常退出
          }


         //JDK1.5 foreach循环
         for(int i=0;i<args.length;i++){

             logger.info("movie "+args[i]);
         }
    }
}
