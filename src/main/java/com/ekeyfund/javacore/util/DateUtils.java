package com.ekeyfund.javacore.util;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.FastDateFormat;

import java.util.Date;

/**
 * Date Util
 *
 * @author tony liuguanglei@ekeyfund.com
 * @create 2017-07-25-上午11:45
 * @see
 * @since JDK1.8u141
 */
public class DateUtils {


    private static final String DEFAULT_DATE_FORMAT="yyyy-MM-dd HH:mm:ss";


    /**
     * 获取当前的日期,按照年-月-日 时:分:秒的格式
     * @return
     */
    public static String getCurrentDate(){

       return DateFormatUtils.format(new Date(),DEFAULT_DATE_FORMAT);
    }
}
