# PercentageCircle
![这里写图片描述](http://img.blog.csdn.net/20151015205624881)

1.在xml中指定中心园的背景颜色，圆环颜色，文字颜色，以及中心园的半径
``` xml
<com.zhangqi.percentagecircle.PercentageRing
        android:id="@+id/Circle3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:circleBackground="#ffFFF68F"
        app:radius="70"
        app:ringColor="#ffFFEC8B"
        />
```
2.在MainActivity中指定目标百分比
``` java
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
```
