package com.example.administrator.pinview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.pinview.PINView.Pinview;

public class MainActivity extends AppCompatActivity {

    private Pinview pinview1;
    private RelativeLayout activity_main;
    private TextView tv_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        //输入完成监听
        pinview1.setPinViewEventListener(new Pinview.PinViewEventListener() {
            @Override
            public void onDataEntered(Pinview pinview, boolean fromUser) {
                Toast.makeText(MainActivity.this, pinview.getValue(), Toast.LENGTH_SHORT).show();
                tv_1.setText(pinview.getValue());            }
        });
    }
    private void initView() {
        pinview1 = (Pinview) findViewById(R.id.pinview1);
        activity_main = (RelativeLayout) findViewById(R.id.activity_main);
        tv_1 = (TextView) findViewById(R.id.tv_1);
    }
}
