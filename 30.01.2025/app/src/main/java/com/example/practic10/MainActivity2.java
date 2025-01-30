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

public class MainActivity2 extends AppCompatActivity {
TextView Rezult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
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
    public void STR3(View v) {
        Intent insets=new Intent(this,MainActivity3.class);
        startActivity(insets);
    }
    public void Sum(View v) {
        int x1 = Integer.parseInt(String.valueOf(R.id.x1TextText));
        int x2 = Integer.parseInt(String.valueOf(R.id.x2TextText));
        int y1 = Integer.parseInt(String.valueOf(R.id.y1TextText));
        int y2 = Integer.parseInt(String.valueOf(R.id.y2TextText));
        int a=abs(x2-x1);
        int b=abs(y2-y1);
        int P=2*(a+b);
        int S=a*b;
        Rezult.setText("S= "+S +"\n P= "+P);
    }
}