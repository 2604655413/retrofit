package com.qf.retrofit.util;

import android.database.Cursor;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOUtil {
    private IOUtil() {
    }

    public static void closeQuietly(Closeable... closeables) {
        if (null == closeables || closeables.length <= 0) {
            return;
        }
        for (Closeable cb : closeables) {
            try {
                if (null == cb) {
                    continue;
                }
                cb.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void closeQuietly(Cursor... cursors) {
        if (null == cursors || cursors.length <= 0) {
            return;
        }
        for (Closeable cr : cursors) {
            try {
                if (null == cr) {
                    continue;
                }
                cr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * 使用charset指定的字符集编码将inputStream转换成String
     *
     * @param is inputStream
     * @param charset 字符集名
     * @throws IOException
     */
    public static String inputStreamToString(InputStream is, String charset) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is, charset));
        String line = null;
        boolean isFirstLine = true;
        while ((line = reader.readLine()) != null) {
            if (!isFirstLine) {
                sb.append("\n");
            }
            isFirstLine = false;
            sb.append(line);
        }
        return sb.toString();
    }

}
