package example.abe.com.android_framework.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import example.abe.com.android_framework.R;
import example.abe.com.framework.util.ABLog;

public class LogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        ABLog.v("Abe Log verbose");
        ABLog.d("Abe Log debug");
        ABLog.i("Abe Log info");
        ABLog.w("Abe Log warn");
        ABLog.e("Abe Log error");

        ABLog.v("Abe Log verbose, print stack", true);
        ABLog.d("Abe Log debug, print stack", true);
        ABLog.i("Abe Log info, print stack", true);
        ABLog.w("Abe Log warn, print stack", true);
        ABLog.e("Abe Log error, print stack", true);
    }
}