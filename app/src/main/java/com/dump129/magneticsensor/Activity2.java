package com.dump129.magneticsensor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by F0HZZ52 on 05/02/2016.
 */
public class Activity2 extends AppCompatActivity {
    @Bind(R.id.tvResult)
    TextView tvResult;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        ButterKnife.bind(this);

        Intent intent = getIntent();

        String result = intent.getStringExtra("degree");

        tvResult.setText(result);
    }
}
