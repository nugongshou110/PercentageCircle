package com.zhangqi.percentagecircle;

import android.app.Activity;
import android.os.Bundle;




public class MainActivity extends Activity {
	private PercentageRing mPercentageRing1;
	private PercentageRing mPercentageRing2;
	private PercentageRing mPercentageRing3;
    private PercentageRing mPercentageRing4;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPercentageRing1 = (PercentageRing) findViewById(R.id.Circle);
        //设置目标百分比为30
        mPercentageRing1.setTargetPercent(30);

        mPercentageRing2 = (PercentageRing) findViewById(R.id.Circle2);
        //设置目标百分比为50
        mPercentageRing2.setTargetPercent(50);
        
        mPercentageRing3 = (PercentageRing) findViewById(R.id.Circle3);
        //设置目标百分比为70
        mPercentageRing3.setTargetPercent(70);

        mPercentageRing4 = (PercentageRing) findViewById(R.id.Circle4);
        //设置目标百分比为100
        mPercentageRing4.setTargetPercent(100);
    }

}
