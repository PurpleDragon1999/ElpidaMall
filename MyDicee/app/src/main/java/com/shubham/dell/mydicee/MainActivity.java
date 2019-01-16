package com.shubham.dell.mydicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt;
        bt=findViewById(R.id.roll);

        final ImageView left,right;
        right=findViewById(R.id.rimage);
        left=findViewById(R.id.limage);

        final int[] dicearray={R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MyDicee","Button Pressed");
                Random r1=new Random();
                int n=r1.nextInt(6);
                Log.d("MyDicee","Random Number is :"+n);
                left.setImageResource(dicearray[n]);
                n=r1.nextInt(6);
                right.setImageResource(dicearray[n]);
            }
        });
    }
}
