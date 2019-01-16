package com.shubham.dell.oracle;

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

        Button butt;
        butt=findViewById(R.id.ask);

        final ImageView img = findViewById(R.id.main_image);

        final int[] choice={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r1=new Random();
                int x=r1.nextInt(5);
                Log.d("Oracle","Random number is :"+x);
                img.setImageResource(choice[x]);

            }
        });
    }
}
