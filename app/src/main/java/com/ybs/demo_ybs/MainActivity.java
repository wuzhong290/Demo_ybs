package com.ybs.demo_ybs;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.KeyEvent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getAppData();
    }

    @SuppressLint("WrongConstant")
    private void getAppData() {
        Intent intent=getIntent();
        if(intent.getFlags()==101){
            String data_str = intent.getStringExtra("data");
            Log.i("tag", data_str);
            //tag: 调用者传递过来的数据
        }
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("return_data", "return_data");
        intent.putExtras(bundle);
        setResult(10,intent);
        return super.onKeyDown(keyCode, event);
    }

}
