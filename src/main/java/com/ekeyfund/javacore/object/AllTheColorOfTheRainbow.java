package com.ekeyfund.javacore.object;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author tony liuguanglei@ekeyfund.com
 * @create 2017-07-25-下午3:41
 * @see
 * @since JDK1.8u141
 */
public class AllTheColorOfTheRainbow {


    private static final Logger logger = LogManager.getLogger(AllTheColorOfTheRainbow.class);


    int anIntegerRepersentingColors;

    void changeTheHueOfTheColor(int newHue){
        anIntegerRepersentingColors=newHue;
    }


    public static void main(String[]args){
        AllTheColorOfTheRainbow allTheColorOfTheRainbow=new AllTheColorOfTheRainbow();


        logger.info("anIntegerRepersentingColors  = "+allTheColorOfTheRainbow.anIntegerRepersentingColors);
        allTheColorOfTheRainbow.changeTheHueOfTheColor(27);

        logger.info("anIntegerRepersentingColors  = "+allTheColorOfTheRainbow.anIntegerRepersentingColors);



    }
}
