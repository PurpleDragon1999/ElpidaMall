package com.shubham.dell.zero_kata;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.graphics.Color.RED;

public class MainActivity extends Activity {
    private int x=0;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private int[][] a=new int[3][3];
    String us1,us2;

    public void check() {
        System.out.println("Aaya 1");
            if ((a[0][0] == 0 && a[0][1] == 0 && a[0][2] == 0) ||
                    (a[0][0] == 0 && a[1][0] == 0 && a[2][0] == 0) ||
                    (a[0][0] == 0 && a[1][1] == 0 && a[2][2] == 0) ||
                    (a[0][1] == 0 && a[1][1] == 0 && a[2][1] == 0) ||
                    (a[0][2] == 0 && a[1][2] == 0 && a[2][2] == 0) ||
                    (a[0][2] == 0 && a[1][1] == 0 && a[2][0] == 0) ||
                    (a[1][0] == 0 && a[1][1] == 0 && a[1][2] == 0) ||
                    (a[2][0] == 0 && a[2][1] == 0 && a[2][2] == 0)) {
                System.out.println("Aaya 2");
                AlertDialog.Builder ab = new AlertDialog.Builder(this);
                ab.setMessage("Player "+Main2Activity.us1+" WON !!")
                        .setCancelable(false)
                        .setPositiveButton("OKAY!!", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                System.out.println("Andar bhi aaya");
                                x = 0;
                                a[0][0] = 5;
                                a[0][1] = 5;
                                a[0][2] = 5;
                                a[1][0] = 5;
                                a[1][1] = 5;
                                a[1][2] = 5;
                                a[2][0] = 5;
                                a[2][1] = 5;
                                a[2][2] = 5;
                                b1.setClickable(true);
                                b2.setClickable(true);
                                b3.setClickable(true);
                                b4.setClickable(true);
                                b5.setClickable(true);
                                b6.setClickable(true);
                                b7.setClickable(true);
                                b8.setClickable(true);
                                b9.setClickable(true);

                                b1.setBackgroundColor(Color.BLACK);
                                b2.setBackgroundColor(Color.BLACK);
                                b3.setBackgroundColor(Color.BLACK);
                                b4.setBackgroundColor(Color.BLACK);
                                b5.setBackgroundColor(Color.BLACK);
                                b6.setBackgroundColor(Color.BLACK);
                                b7.setBackgroundColor(Color.BLACK);
                                b8.setBackgroundColor(Color.BLACK);
                                b9.setBackgroundColor(Color.BLACK);
                            }
                        }).show();
            }

            else if((a[0][0] == 1 && a[0][1] == 1 && a[0][2] == 1) ||
                    (a[0][0] == 1 && a[1][0] == 1 && a[2][0] == 1) ||
                    (a[0][0] == 1 && a[1][1] == 1 && a[2][2] == 1) ||
                    (a[0][1] == 1 && a[1][1] == 1 && a[2][1] == 1) ||
                    (a[0][2] == 1 && a[1][2] == 1 && a[2][2] == 1) ||
                    (a[0][2] == 1 && a[1][1] == 1 && a[2][0] == 1) ||
                    (a[1][0] == 1 && a[1][1] == 1 && a[1][2] == 1) ||
                    (a[2][0] == 1 && a[2][1] == 1 && a[2][2] == 1)){
                System.out.println("Aaya 3");
                AlertDialog.Builder ab = new AlertDialog.Builder(this);
                ab.setMessage("Player "+Main2Activity.us2+" WON!!")
                        .setCancelable(false)
                        .setPositiveButton("OKAY!!", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                System.out.println("Andar bhi aaya 2");
                                x = 0;
                                a[0][0] = 5;
                                a[0][1] = 5;
                                a[0][2] = 5;
                                a[1][0] = 5;
                                a[1][1] = 5;
                                a[1][2] = 5;
                                a[2][0] = 5;
                                a[2][1] = 5;
                                a[2][2] = 5;
                                b1.setClickable(true);
                                b2.setClickable(true);
                                b3.setClickable(true);
                                b4.setClickable(true);
                                b5.setClickable(true);
                                b6.setClickable(true);
                                b7.setClickable(true);
                                b8.setClickable(true);
                                b9.setClickable(true);

                                b1.setBackgroundColor(Color.BLACK);
                                b2.setBackgroundColor(Color.BLACK);
                                b3.setBackgroundColor(Color.BLACK);
                                b4.setBackgroundColor(Color.BLACK);
                                b5.setBackgroundColor(Color.BLACK);
                                b6.setBackgroundColor(Color.BLACK);
                                b7.setBackgroundColor(Color.BLACK);
                                b8.setBackgroundColor(Color.BLACK);
                                b9.setBackgroundColor(Color.BLACK);
                            }
                        }).show();
            }
            else if(x==9){
                AlertDialog.Builder ab = new AlertDialog.Builder(this);
                ab.setMessage("Laanat H ! Koi Nhi Jeet Paya!!")
                        .setCancelable(false)
                        .setPositiveButton("OKAY!!", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                System.out.println("Andar bhi aaya 2");
                                x = 0;
                                a[0][0] = 5;
                                a[0][1] = 5;
                                a[0][2] = 5;
                                a[1][0] = 5;
                                a[1][1] = 5;
                                a[1][2] = 5;
                                a[2][0] = 5;
                                a[2][1] = 5;
                                a[2][2] = 5;
                                b1.setClickable(true);
                                b2.setClickable(true);
                                b3.setClickable(true);
                                b4.setClickable(true);
                                b5.setClickable(true);
                                b6.setClickable(true);
                                b7.setClickable(true);
                                b8.setClickable(true);
                                b9.setClickable(true);

                                b1.setBackgroundColor(Color.BLACK);
                                b2.setBackgroundColor(Color.BLACK);
                                b3.setBackgroundColor(Color.BLACK);
                                b4.setBackgroundColor(Color.BLACK);
                                b5.setBackgroundColor(Color.BLACK);
                                b6.setBackgroundColor(Color.BLACK);
                                b7.setBackgroundColor(Color.BLACK);
                                b8.setBackgroundColor(Color.BLACK);
                                b9.setBackgroundColor(Color.BLACK);
                            }
                        }).show();
            }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //final int x=0;
        a[0][0]=a[0][1]=a[0][2]=a[1][0]=a[1][1]=a[1][2]=a[2][0]=a[2][1]=a[2][2]=5;


        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 x=x+1;
                 if(x%2!=0) {
                     b1.setBackgroundColor(Color.RED); //For red color
                     a[0][0]=0;
                 }
                 else{
                     b1.setBackgroundColor(Color.YELLOW); //For yellow color
                     a[0][0]=1;
                 }
                 b1.setClickable(false);
                 check();
             }
         });
         b2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 x=x+1;
                 if(x%2!=0) {
                     b2.setBackgroundColor(Color.RED); //For red color
                     a[0][1]=0;
                 }
                 else{
                     b2.setBackgroundColor(Color.YELLOW); //For yellow color
                     a[0][1]=1;
                 }
                 b2.setClickable(false);
                 check();
             }
         });
         b3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 x=x+1;
                 if(x%2!=0) {
                     b3.setBackgroundColor(Color.RED); //For red color
                     a[0][2]=0;
                 }
                 else{
                     b3.setBackgroundColor(Color.YELLOW); //For yellow color
                     a[0][2]=1;
                 }
                 b3.setClickable(false);
                 check();
             }
         });
         b4.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 x=x+1;
                 if(x%2!=0) {
                     b4.setBackgroundColor(Color.RED); //For red color
                     a[1][0]=0;
                 }
                 else{
                     b4.setBackgroundColor(Color.YELLOW); //For yellow color
                     a[1][0]=1;
                 }
                 b4.setClickable(false);
                 check();
             }
         });
         b5.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 x=x+1;
                 if(x%2!=0) {
                     b5.setBackgroundColor(Color.RED); //For red color
                     a[1][1]=0;
                 }
                 else{
                     b5.setBackgroundColor(Color.YELLOW); //For yellow color
                     a[1][1]=1;
                 }
                 b5.setClickable(false);
                 check();
             }
         });
         b6.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 x=x+1;
                 if(x%2!=0) {
                     b6.setBackgroundColor(Color.RED); //For red color
                     a[1][2]=0;
                 }
                 else{
                     b6.setBackgroundColor(Color.YELLOW); //For yellow color
                     a[1][2]=1;
                 }
                 b6.setClickable(false);
                 check();
             }
         });
         b7.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 x=x+1;
                 if(x%2!=0) {
                     b7.setBackgroundColor(Color.RED); //For red color
                     a[2][0]=0;
                 }
                 else{
                     b7.setBackgroundColor(Color.YELLOW); //For yellow color
                     a[2][0]=1;
                 }
                 b7.setClickable(false);
                 check();
             }
         });
         b8.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 x=x+1;
                 if(x%2!=0) {
                     b8.setBackgroundColor(Color.RED); //For red color
                     a[2][1]=0;
                 }
                 else{
                     b8.setBackgroundColor(Color.YELLOW); //For yellow color
                     a[2][1]=1;
                 }
                 b8.setClickable(false);
                 check();
             }
         });
         b9.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 x=x+1;
                 if(x%2!=0) {
                     b9.setBackgroundColor(Color.RED); //For red color
                     a[2][2]=0;
                 }
                 else{
                     b9.setBackgroundColor(Color.YELLOW); //For yellow color
                     a[2][2]=1;
                 }
                 b9.setClickable(false);
                 check();
             }
         });


    }
}
