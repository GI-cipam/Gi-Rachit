package com.example.rachitsinghal.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import me.toptas.fancyshowcase.FancyShowCaseView;

public class home extends AppCompatActivity {

    Button button4;
    public void focusMe(View view){
        new FancyShowCaseView.Builder(this)
                .title("You have pressed button!!!")
                .focusOn(view)
                .build()
                .show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        button4=(Button)findViewById(R.id.button4);
    }
}
