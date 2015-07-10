package com.mycompany.myapplication2;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by yedids on 6/24/2015.
 */
public class OnSubmitListener implements View.OnClickListener {
    private EditText editText;
    private TextView textView;
    MainActivity.RestCaller restCaller;
    public OnSubmitListener(EditText editText, TextView textView, MainActivity.RestCaller restCaller){
        this.editText =editText;
        this.textView = textView;
        this.restCaller = restCaller;
    }
    @Override
    public void onClick(View v) {
        restCaller.execute();
        //textView.setText(editText.getText().toString());
    }
}
