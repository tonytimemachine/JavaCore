package com.ekeyfund.javacore.basic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

/**
 * 基本数据类型的使用
 *
 * @author tony liuguanglei@ekeyfund.com
 * @create 2017-07-27-下午3:36
 * @see
 * @since JDK1.8u141
 */
public class PrimitiveType {


    private static final Logger logger = LogManager.getLogger();

    /*boolean类型的使用*/
    @Test
    public void booleanValue(){

        boolean flag =Boolean.TRUE; //自动拆箱
        boolean bl=false;

//      boolean tag="true"; 编译错误,boolean的值只能是true或者false

        String str=true+"";

        logger.info("str = "+str);

    }

    /**
     * char可以用来存储字符、转义字符、unicode字符、中文或者是2个字节的整数(0-65535)
     */
    @Test
    public void charValue(){

        char  letter='A';

        logger.info("letter = "+(int)letter);
        char enterChar='\n';

        logger.info("enterChar = "+enterChar);


        char unicode='\u9999';
        logger.info("unicode = "+unicode);

        char chinese='刘';
        logger.info("chinese = "+chinese);


        int chineseValue=chinese;
        logger.info("chineseValue = "+chineseValue);

        char value=97;
        logger.info("value = "+value);


    }

    /**
     * 浮点数用于存储小数
     */
    @Test
    public void floatValue() {

        float fl =5.234555f; //float精确到小数点后6位

        logger.info("float value = "+fl);

        fl=5.234555555f; //超过精度范围,取值不正确

        logger.info("float value = "+fl);



        double db=3.14159265358979323846;
        logger.info("double value = "+db);//输出结果3.141592653589793 double可以精确到小数点后15位

    }


    /**
     * 整数默认是int类型
     * long类型的数据后面加上L后缀
     * 整数可以使用二进制、八进制、十机制、十六进制表示
     * 二进制由0和1组成,逢2进1
     * 八进制由0开头,0-7八个数字组成,逢8进1
     * 十六进制由0X开头, 0-9,a-f十六个字符组成
     */
    @Test
    public void intValue(){

        Byte btVal =88; //赋值会发生类型转换  这里把int类型的88转换为byte类型

//      long bigValue = 999_999_999_999_999; 编译错误,不会把 999_999_999_9999当成long类型处理

        long bigValue=9999_9999_9999_9999L; // long类型加L后缀

        //整数的四种进制类型

        int binaryValue =0b110_000110;
        logger.info("binaryValue = " +binaryValue);

        //
        int octVal =013;
        logger.info("octVal = "+octVal);


        int hexValue= 0X12F;
        logger.info("hexValue = "+hexValue);











    }


}
