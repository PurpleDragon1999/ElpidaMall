package com.shubham.dell.zero_kata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    static String us1,us2;

    public void openact(){
        Intent in=new Intent(this,MainActivity.class);
        startActivity(in);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Button b10=findViewById(R.id.button2);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ed=findViewById(R.id.editText);
                EditText ed2=findViewById(R.id.editText2);
                us1=ed.getText().toString();
                us2=ed2.getText().toString();
                openact();
            }
        });
    }
}
