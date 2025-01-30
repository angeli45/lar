package com.example.practic10;

import static java.lang.Math.abs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {
TextView Rezult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Rezult=findViewById(R.id.Rez);
    }
    public void STR1(View v) {
        Intent insets=new Intent(this,MainActivity.class);
        startActivity(insets);
    }
    public void STR2(View v) {
        Intent insets=new Intent(this,MainActivity2.class);
        startActivity(insets);
    }
    public void Sum(View v) {
        int x = Integer.parseInt(String.valueOf(R.id.xTextText));
        int y = Integer.parseInt(String.valueOf(R.id.yTextText));
        int a = Integer.parseInt(String.valueOf(R.id.aTextText));
        int b = Integer.parseInt(String.valueOf(R.id.bTextText));
        int s=a/x;
        int i=b/y;
        Rezult.setText("1 кг конфет= "+s +"\n 1 кг ирисок= "+i+"\n в "+s/i+" раз конфеты дороже");
    }
}