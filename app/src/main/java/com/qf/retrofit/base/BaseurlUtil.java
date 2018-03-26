package com.qf.retrofit.base;

/**
 * BaseURL工具类
 */
public class BaseurlUtil {
    private String baseUrl = "http://www.kuaidi100.com/";

    private BaseurlUtil() {
    }

    private static class UrlHolder {
        private static BaseurlUtil baseurl = new BaseurlUtil();
    }

    public static BaseurlUtil getBaseUrl() {
        return UrlHolder.baseurl;
    }

    public String getUrl() {
        return baseUrl;
    }
}
