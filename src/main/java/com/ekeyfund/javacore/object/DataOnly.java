package com.ekeyfund.javacore.object;

/**
 * Data Only
 *
 * @author tony liuguanglei@ekeyfund.com
 * @create 2017-07-25-下午2:26
 * @see
 * @since JDK1.8u141
 */
public class DataOnly {

    //声明3个成员变量
    int i;
    double d;
    boolean b;


    public static void main(String[]args){
        //实例化对象
        DataOnly dataOnly=new DataOnly();

        //给成员变量赋值
        dataOnly.i=12;
        dataOnly.d=12.0;
        dataOnly.b=true;


    }

}
