package com.fx.utilscollection.utils;


import android.util.Log;

/**
 * @author yingsu
 */
public class LogUtil {

    /**
     * 是否输出
     */
    public static boolean isDebug = false;

    /**
     * LogTag
     */
    public static final String LOGTAG = "LOGUTIL";


    /**
     * 设置debug模式(true:打印日志  false：不打印)
     */
    public static void isEnableDebug(boolean isDebug) {
        LogUtil.isDebug = isDebug;
    }

    public static void i(String tag, String msg) {
        if (isDebug) {
            Log.i(tag, msg != null ? msg : "");
        }
    }

    public static void d(String tag, String msg) {
        if (isDebug) {
            Log.d(tag, msg != null ? msg : "");
        }
    }

    public static void w(String tag, String msg) {
        if (isDebug) {
            Log.w(tag, msg != null ? msg : "");
        }
    }

    public static void e(String tag, String msg) {
        if (isDebug) {
            Log.e(tag, msg != null ? msg : "");
        }
    }

    public static void v(String tag, String msg) {
        if (isDebug) {
            Log.v(tag, msg != null ? msg : "");
        }
    }


}
