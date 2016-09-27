package com.conan.rxjavaretrofitdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.conan.rxjavaretrofitdemo.MovieEntity.DataBean;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.click_me_BN)
    Button clickMeBN;
    @Bind(R.id.result_TV)
    TextView resultTV;

    private SubscriberOnNextListener<List<DataBean>> getFaqOnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        getFaqOnNext = new SubscriberOnNextListener<List<DataBean>>() {
            @Override
            public void onNext(List<DataBean> dataBeen) {

                resultTV.setText(dataBeen.toString());
            }
        };
    }

    @OnClick(R.id.click_me_BN)
    public void onClick() {
        getMovie();
    }

    //进行网络请求
    private void getMovie() {
        HttpMethods.getInstance().getTopMovie(new ProgressSubscriber<>(getFaqOnNext,MainActivity.this),2);
    }
}
