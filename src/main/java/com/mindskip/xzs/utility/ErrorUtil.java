package com.mindskip.xzs.utility;


/**
 * @version 3.5.0
 * @description: The type Error util.
 * @author hyx
 */
public class ErrorUtil {
    /**
     * Parameter error format string.
     *
     * @param field the field
     * @param msg   the msg
     * @return the string
     */
    public static String parameterErrorFormat(String field, String msg) {
        return "【" + field + " : " + msg + "】";
    }
}
