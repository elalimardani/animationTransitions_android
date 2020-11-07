package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    boolean colorSwitch = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void backHomeClicked(View view){
        finish();
    }



    public void customTransition(View view){
        Transition transition = new CustomTransition();
        transition.setDuration(1500);

        ViewGroup root = findViewById(R.id.rootContainer);
        TextView textView = findViewById(R.id.textView);

        TransitionManager.beginDelayedTransition(root, transition);
        if(!colorSwitch){
            textView.setTextColor(Color.argb(255,2,151,155));
            textView.setTextSize(25);
        }else {
            textView.setTextColor(Color.TRANSPARENT);
            textView.setTextSize(10);
        } this.colorSwitch = !this.colorSwitch;

    }

}