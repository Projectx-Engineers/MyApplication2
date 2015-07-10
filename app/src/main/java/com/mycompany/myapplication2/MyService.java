package com.mycompany.myapplication2;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

/**
 * Created by yedids on 6/30/2015.
 */
public class MyService extends Service {
    IBinder binder = new MyBinder();
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public String getMe(){
        return "Idiot";
    }
    public class MyBinder extends Binder{
        MyService getService(){
            return MyService.this;
        }
    }
}

