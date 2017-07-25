package com.ekeyfund.javacore.object;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Incrementable
 *
 * @author tony liuguanglei@ekeyfund.com
 * @create 2017-07-25-下午2:49
 * @see
 * @since JDK1.8u141
 */
public class Incrementable {
    private static final Logger logger = LogManager.getLogger(Incrementable.class);


    static void increment(){
        StaticTest.i++;

        logger.info(" 执行increment方法后 i  = "+ StaticTest.i);

    }


    public  static void main(String[]args){

        Incrementable.increment(); //100
        Incrementable.increment();//101
        Incrementable.increment();//102

    }
}


/**
 * 自定义一个包含静态整数变量i 初始化值为99
 */
class StaticTest{

    private static final Logger logger = LogManager.getLogger(StaticTest.class);

    static int i=99; //静态成员变量只会占据一份内存空间


    public static void main(String[]args){
        StaticTest st1=new StaticTest();
        logger.info("st1.i = "+st1.i);

        StaticTest st2=new StaticTest();
        logger.info("st2.i = "+st2.i);

        i=100; //修改静态成员变量的值

        //所有对象获取的静态成员变量都是修改后的值
        logger.info("st1.i = "+st1.i);
        logger.info("st2.i = "+st2.i);



    }


}
