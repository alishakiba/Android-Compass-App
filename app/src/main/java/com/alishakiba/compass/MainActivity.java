package com.alishakiba.compass;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(this);
        tv.setText("Hello, Compass!");
        tv.setTextSize(24);
        tv.setPadding(32, 32, 32, 32);

        setContentView(tv);
    }
}
