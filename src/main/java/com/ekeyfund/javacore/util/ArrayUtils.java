package com.ekeyfund.javacore.util;

/**
 * Array Utils
 *
 * @author tony liuguanglei@ekeyfund.com
 * @create 2017-07-25-下午4:13
 * @see
 * @since JDK1.8u141
 */
public class ArrayUtils {


    public static <T> T[] cloneElements(final T[] array) {
        return org.apache.commons.lang3.ArrayUtils.clone(array);
    }
}
