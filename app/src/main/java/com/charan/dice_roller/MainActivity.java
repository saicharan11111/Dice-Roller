package com.charan.dice_roller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity<button> extends AppCompatActivity {
    private ImageView imageViewDicy;
    private ImageView imageViewDicy2;
    private Random myRandomNumber = new Random();
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollOurDice();
            }
        });
        imageViewDicy2= findViewById(R.id.imageView2);
        imageViewDicy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                rollOurDice();
            }
        });
        imageViewDicy = findViewById(R.id.imageView1);
        imageViewDicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//               rollOurDice();
            }
        });
    }



    private void rollOurDice() {

        int myRanNumber=myRandomNumber.nextInt(6) + 1;
        switch(myRanNumber){
            case 1:
                imageViewDicy.setImageResource(R.drawable.dice_1);

                break;
                case 2:
                imageViewDicy.setImageResource(R.drawable.dice_2);

                break;
                case 3:
                imageViewDicy.setImageResource(R.drawable.dice_3);

                break;
                case 4:
                imageViewDicy.setImageResource(R.drawable.dice__4);

                break;
                case 5:
                imageViewDicy.setImageResource(R.drawable.dice_5);

                break;
                case 6:
                imageViewDicy.setImageResource(R.drawable.dice__6);


        }


        int myRanNumber2=myRandomNumber.nextInt(6) + 1;
        switch(myRanNumber2){
            case 1:
                imageViewDicy2.setImageResource(R.drawable.dice_1);

                break;
                case 2:
                imageViewDicy2.setImageResource(R.drawable.dice_2);

                break;
                case 3:
                imageViewDicy2.setImageResource(R.drawable.dice_3);

                break;
                case 4:
                imageViewDicy2.setImageResource(R.drawable.dice__4);

                break;
                case 5:
                imageViewDicy2.setImageResource(R.drawable.dice_5);

                break;
                case 6:
                imageViewDicy2.setImageResource(R.drawable.dice__6);


        }

    }
}