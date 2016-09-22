package org.iii.tw.mysevers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void test1(View v){
        Intent it = new Intent(this, MyService.class);
        startService(it);
    }
    public void test2(View v){
        Intent it = new Intent(this, MyService.class);
        stopService(it);
    }
    public void test3(View v){

    }
}
