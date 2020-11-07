package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Scene;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


   public void goToSecondActivity(View view){
        Bundle animationBundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent, animationBundle);
    }


    public void explode(View view){
        ViewGroup sceneRoot = findViewById(R.id.rootView);
        Scene scene1 = Scene.getSceneForLayout(sceneRoot, R.layout.scene1, this);
        Transition explode = new Explode();
        TransitionManager.go(scene1, explode);
    }

    public void slide(View view){
        ViewGroup sceneRoot = findViewById(R.id.rootView);
        Scene scene2 = Scene.getSceneForLayout(sceneRoot, R.layout.scene2, this);
        Transition slide = new Slide(Gravity.TOP);
        TransitionManager.go(scene2, slide);
    }


    public void fade(View view){
        ViewGroup sceneRoot = findViewById(R.id.rootView);
        Scene scene3 = Scene.getSceneForLayout(sceneRoot, R.layout.scene3, this);
        Transition fade = new Fade();
        fade.setDuration(2000);
        TransitionManager.go(scene3, fade);
    }

    public void explodeHome(View view){
        ViewGroup sceneRoot = findViewById(R.id.rootView);
        Scene sceneMain = Scene.getSceneForLayout(sceneRoot, R.layout.activity_main, this);
        Transition explode = new Explode();
        TransitionManager.go(sceneMain, explode);
    }

    public void changeBounds(View view){
        ViewGroup sceneRoot = findViewById(R.id.rootView);
        Scene scene4 = Scene.getSceneForLayout(sceneRoot, R.layout.scene4, this);
        Transition changeBounds = new ChangeBounds();
        TransitionManager.go(scene4, changeBounds);
    }



}