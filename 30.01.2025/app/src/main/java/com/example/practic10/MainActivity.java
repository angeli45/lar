package com.example.practic10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
TextView Rezult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Rezult=findViewById(R.id.Rez);
    }
    public void STR2(View v) {
        Intent insets=new Intent(this,MainActivity2.class);
        startActivity(insets);
    }
    public void STR3(View v) {
        Intent insets=new Intent(this,MainActivity3.class);
        startActivity(insets);
    }

    public void Sum(View v) {
        int a = Integer.parseInt(String.valueOf(R.id.aTextText));
        int b = Integer.parseInt(String.valueOf(R.id.bTextText));
        int c = Integer.parseInt(String.valueOf(R.id.cTextText));
        int V=a*b*c;
        int S=2*(a*b+b*c+a*c);
        Rezult.setText("V= "+V + "S= "+S);
    }
}