package edu.hzuapps.androidlabs.Soft1714080902111;

import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

class Soft1714080902111TestActivity extends AppCompatActivity {

    private TextView mtv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soft1714080902111textactivity);//引用alayout的ctivity_main
        mtv1 = findViewById(R.id.ttv1);
        mtv1.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        mtv1.getPaint().setAntiAlias(true);
    }

}