package com.skm.myquizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Play_Activity extends AppCompatActivity
{
   private CardView cardView_phy,cardView_che,cardView_bio,cardView_more;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        initilazation();

    }

    private void initilazation()
    {
        cardView_che=findViewById(R.id.chem_card);
        cardView_bio=findViewById(R.id.bio_card);
        cardView_phy=findViewById(R.id.phy_card);
        cardView_more=findViewById(R.id.more_card);

        cardView_phy.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                startActivity(new Intent(Play_Activity.this,Physics_Activity.class));
            }
        });
        cardView_bio.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Play_Activity.this,Biology_Activity.class));
            }
        });
        cardView_che.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Play_Activity.this,Chemistry_Activity.class));
            }
        });
        cardView_more.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Context context = getApplicationContext();
                CharSequence text = "Patience is the key";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });


    }
}