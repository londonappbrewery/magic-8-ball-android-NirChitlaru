package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button changeBallBtn ;
        changeBallBtn = (Button)findViewById(R.id.changeBallBtn) ;
        final ImageView ballImage ;
        ballImage  = findViewById(R.id.ballImage) ;
        ballImage.setTag(R.drawable.p1) ;
        final ArrayList<Integer> ballStatePics = new ArrayList<Integer>();
        ballStatePics.add(R.drawable.p1);
        ballStatePics.add(R.drawable.p2);
        ballStatePics.add(R.drawable.p3);



        changeBallBtn.setOnClickListener(new View.OnClickListener()
                                         {
            @Override
            public void onClick(View v) {

                int num = ballStatePics.indexOf(ballImage.getTag()) + 1 ;
                if (num > 2) num = 0 ;

                ballImage.setImageResource(ballStatePics.get(num));
                ballImage.setTag(ballStatePics.get(num));

                Log.d("magicball" , "The image is"+ num ) ;

            }
        }
        );

    }
}
