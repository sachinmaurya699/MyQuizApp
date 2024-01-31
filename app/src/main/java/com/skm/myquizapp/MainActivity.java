package com.skm.myquizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private CardView cardView_play,cardView_how;
    private long pressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initilazation();

    }

    private void initilazation()
    {
        cardView_how=findViewById(R.id.cardview2);
        cardView_play=findViewById(R.id.cardview1);
        cardView_play.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               startActivity(new Intent(MainActivity.this,Play_Activity.class));
            }
        });
        cardView_how.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               startActivity(new Intent(MainActivity.this,How_to_page_Activity.class));
            }
        });
    }

    @Override
    public void onBackPressed()
    {
        if (pressedTime + 2000 > System.currentTimeMillis())
        {
            super.onBackPressed();
            finish();
        } else
        {
            Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT).show();
        }
        pressedTime = System.currentTimeMillis();
    }
}