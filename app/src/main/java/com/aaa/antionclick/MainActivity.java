package com.aaa.antionclick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.aaa.antionclick.aop.SingleClick;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv1)
    TextView tv1;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @SingleClick
    @OnClick({R.id.tv1})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv1:
                Toast.makeText(this, i + "------1", Toast.LENGTH_SHORT).show();
                i++;
                break;
        }
    }
}
