package com.example.hoeattest;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MbtiQ9Activity extends AppCompatActivity {
    ImageView mbt9bak,MbtiTrue9, MbtiFalse9;
    Button MbtiNextButton9;
    int yesorno =0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbtiq9);


        mbt9bak=findViewById(R.id.mbt9bak);
        MbtiTrue9=findViewById(R.id.MbtiTrue9);
        MbtiFalse9=findViewById(R.id.MbtiFalse9);
        MbtiNextButton9=findViewById(R.id.MbtiNextButton9);
        MbtiNextButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MbtiQ10Activity.class);
                startActivity(intent);
            }
        });
        mbt9bak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
        MbtiTrue9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(yesorno==0){
                    yesorno=1;

                }else if(yesorno==1){

                }else{
                    yesorno=1;
                }
                if(yesorno==1){
                    MbtiTrue9.setImageResource(R.drawable.mbti_not_select_yes);
                    MbtiFalse9.setImageResource(R.drawable.mbti_select_no);
                }


            }
        });
        MbtiFalse9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(yesorno==0){
                    yesorno=2;

                }else if(yesorno==2){

                }else{
                    yesorno=2;
                }
                if(yesorno==2){

                    MbtiTrue9.setImageResource(R.drawable.mbti_select_yes);
                    MbtiFalse9.setImageResource(R.drawable.mbti_not_select_no);
                }

            }
        });
    }
}
