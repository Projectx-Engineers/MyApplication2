package com.mycompany.myapplication2;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.ExecutionException;

import projectx.bean.UserDetails;
import projectx.exception.BackEndException;
import projectx.factory.BackEndFactory;
import projectx.service.IBackEndService;
import projectx.util.ErrorCode;


public class Registration extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_registration, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
//    public void onClickLogin(View view) {
//        ((TextView) findViewById(R.id.result)).setText("Login Done");
//    }
    public void onClickRegister(View view) {
        RestCaller restCaller = new RestCaller();
        AsyncTask<Void, Void, UserDetails> asyncTask = restCaller.execute();
        try {
            UserDetails userDetails = asyncTask.get();
            if (userDetails != null) {
                ((TextView) findViewById(R.id.lblResult)).setText(R.string.registration_successful);
            } else {
                ((TextView) findViewById(R.id.lblResult)).setText(R.string.registration_failed);
            }
        } catch (InterruptedException e) {
            ((TextView) findViewById(R.id.lblResult)).setText(R.string.registration_successful +
                    " " + ErrorCode.ERR_PRJX_ASYNC_TASK_INTERRUPTED.toString());
            e.printStackTrace();
        } catch (ExecutionException e) {
            ((TextView) findViewById(R.id.lblResult)).setText(R.string.registration_successful +
                    " " + ErrorCode.ERR_PRJX_ASYNC_TASK_EXCEPTION.toString());
            e.printStackTrace();
        }
    }

    private String getValue(EditText editText) {
        return editText.getText().toString();
    }

    public class RestCaller extends AsyncTask<Void, Void, UserDetails> {

        @Override
        protected UserDetails doInBackground(Void... params) {
            UserDetails userDetails = new UserDetails();
            userDetails.setUsername(getValue((EditText) findViewById(R.id.txtEmail)));
            userDetails.setPassword(getValue((EditText) findViewById(R.id.txtPassPhrase)));
            userDetails.setMobileNumber(getValue((EditText) findViewById(R.id.txtMobileNumber)));
            IBackEndService backEndService = null;
            try {
                backEndService = BackEndFactory.getBackEndService();
                return backEndService.registerUser(userDetails);
            } catch (BackEndException be) {
                Toast.makeText(getBaseContext(), be.getErrorCodeString(), Toast.LENGTH_SHORT);
                be.printStackTrace();
            }

            return null;

        }
    }
}
