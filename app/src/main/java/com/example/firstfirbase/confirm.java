package com.example.firstfirbase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class confirm extends AppCompatActivity {
private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        txt=findViewById(R.id.txt);
        txt.setText("Congratulations you are signed in");
    }
}
