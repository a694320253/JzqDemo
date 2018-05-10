package com.huitu.jzqdemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.huitu.jzqdemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ServiceActivity extends AppCompatActivity {


    @BindView(R.id.btn)
    Button btn;
    @BindView(R.id.stopbtn)
    Button stopbtn;
    @BindView(R.id.activity_service)
    LinearLayout activityService;
    private static final String TAG = "ServiceActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        ButterKnife.bind(this);
        //测试回hehe
    }


    @OnClick({R.id.btn, R.id.stopbtn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn:
                Log.i(TAG, "onViewClicked: btn"+btn.getText().toString());
                break;
            case R.id.stopbtn:
                Log.i(TAG, "onViewClicked: stopbtn"+stopbtn.getText().toString());
                break;
        }
    }
}
