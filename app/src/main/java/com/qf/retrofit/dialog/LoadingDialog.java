package com.qf.retrofit.dialog;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.qf.retrofit.R;


/**
 * 加载进度框
 */

public class LoadingDialog {

    private LoadingDialog(){}

    private static class LoadingDialogHolder{
        private static LoadingDialog loadingDialog=new LoadingDialog();
    }

    public static LoadingDialog getLoadingDialog(){
        return LoadingDialogHolder.loadingDialog;
    }
    /**
     * 自定义的progressDialog
     *
     * @param context
     * @param msg
     * @return
     */
    public Dialog createDialog(Context context, String msg) {

        View view = LayoutInflater.from(context).inflate(
                R.layout.dialog_loading, null);
        LinearLayout layout = (LinearLayout) view
                .findViewById(R.id.dialog_view);
        TextView tipText = (TextView) view.findViewById(R.id.tipTextView);

        tipText.setText(msg);

        // 创建自定义样式的Dialog
        Dialog loadingDialog = new Dialog(context, R.style.MyDialogStyle);

        //设置点击dialog外面无效
        loadingDialog.setCanceledOnTouchOutside(false);
        loadingDialog.setContentView(layout, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));

        return loadingDialog;
    }
}

