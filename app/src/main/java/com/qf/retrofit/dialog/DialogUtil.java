package com.qf.retrofit.dialog;

import android.app.Activity;
import android.app.Dialog;

/**
 * DialogUtil工具类
 */

public class DialogUtil {

    private Dialog dialog;

    private DialogUtil() {
    }

    private static class DialogHolder{
        private static  DialogUtil dialogUtil=new DialogUtil();
    }

    public static DialogUtil getDialogUtil() {
       return DialogHolder.dialogUtil;
    }

    /**
     *
     * 显示dialog
     * @param activity
     * @param message
     * @param cancelLable，设置是否点击返回键取消dialog，false表示不取消，true表示取消
     */
    public void showDialog(Activity activity, String message,boolean cancelLable) {
        if (dialog == null) {
            dialog = LoadingDialog.getLoadingDialog().createDialog(activity, message);
        }
        dialog.setCancelable(cancelLable);
        dialog.show();
    }

    /**
     * 隐藏dialog
     */
    public void hideDialog() {
        dialog.dismiss();
    }

    public void getActivity(Activity activity){

    }

}
