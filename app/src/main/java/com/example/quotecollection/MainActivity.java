package com.example.quotecollection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    GridLayout gridLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridLayout = findViewById(R.id.main_grid_layout);
        setSingleEvent(gridLayout);
    }

    private void setSingleEvent(GridLayout gridLayout) {

        for(int i=0;i<gridLayout.getChildCount();i++){
            CardView cardView = (CardView) gridLayout.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(finalI==0){
                        Intent intent = new Intent(MainActivity.this, friendship_quotes.class);
                        startActivity(intent);
                    }
                    else if(finalI==1){
                        Intent intent = new Intent(MainActivity.this, funny_quotes.class);
                        startActivity(intent);
                    }
                    else if(finalI==2){
                        Intent intent = new Intent(MainActivity.this, happiness_quotes.class);
                        startActivity(intent);

                    }
                    else if(finalI==3){
                        Intent intent = new Intent(MainActivity.this, inspirational_quotes.class);
                        startActivity(intent);

                    }
                    else if(finalI==4){
                        Intent intent = new Intent(MainActivity.this, life_quotes.class);
                        startActivity(intent);
                    }

                    else if(finalI==5){
                        Intent intent = new Intent(MainActivity.this, love_quotes.class);
                        startActivity(intent);
                    }
                    else if(finalI==6){
                        Intent intent = new Intent(MainActivity.this, motivational_quotes.class);
                        startActivity(intent);
                    }
                    else if(finalI==7){
                        Intent intent = new Intent(MainActivity.this, success_quotes.class);
                        startActivity(intent);
                    }
                    else if(finalI==8){
                        Intent intent = new Intent(MainActivity.this, thoughtful_quotes.class);
                        startActivity(intent);
                    }
                    else if(finalI==9){
                        Intent intent = new Intent(MainActivity.this, wisdom_quotes.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }


    public void friendship_button(View view){
        Intent intent = new Intent(getApplicationContext(),friendship_quotes.class);
        startActivity(intent);
    }
    public void funny_button(View view){
        Intent intent = new Intent(getApplicationContext(),funny_quotes.class);
        startActivity(intent);
    }

    public void happiness_button(View view){
        Intent intent = new Intent(getApplicationContext(),happiness_quotes.class);
        startActivity(intent);
    }
    public void inspiartional_button(View view){
        Intent intent = new Intent(getApplicationContext(),inspirational_quotes.class);
        startActivity(intent);
    }

    public void life_button(View view){
        Intent intent = new Intent(getApplicationContext(),life_quotes.class);
        startActivity(intent);
    }
    public void love_button(View view){
        Intent intent = new Intent(getApplicationContext(),love_quotes.class);
        startActivity(intent);
    }

    public void motivational_button(View view){
        Intent intent = new Intent(getApplicationContext(),motivational_quotes.class);
        startActivity(intent);
    }
    public void success_button(View view){
        Intent intent = new Intent(getApplicationContext(),success_quotes.class);
        startActivity(intent);
    }

    public void thoughtful_button(View view){
        Intent intent = new Intent(getApplicationContext(),thoughtful_quotes.class);
        startActivity(intent);
    }
    public void wisdom_button(View view){
        Intent intent = new Intent(getApplicationContext(),wisdom_quotes.class);
        startActivity(intent);
    }
}