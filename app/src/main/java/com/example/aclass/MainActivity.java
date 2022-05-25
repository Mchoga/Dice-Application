package com.example.aclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.Random;


public class MainActivity extends AppCompatActivity {

    ImageView image;
    Button button;
    TextView textview;
    ImageView imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        image = findViewById(R.id.imageView3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Random random = new Random();
                int score = random.nextInt(6)+1;
                textview = findViewById(R.id.textView);
                textview.setText(String.valueOf(score));

                switch (score){
                    case 1:
                        image.setImageResource(R.drawable.dice_1);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.dice_2);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.dice_3);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.dice_4);
                        break;
                    case 5:
                        image.setImageResource(R.drawable.dice_5);
                        break;
                    case 6:
                        image.setImageResource(R.drawable.dice_6);
                        break;


                }








            }
        });


        //image = (ImageView) findViewById(R.drawable.dice_1);

    }
}