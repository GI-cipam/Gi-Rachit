package com.example.rachitsinghal.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import me.toptas.fancyshowcase.FancyShowCaseView;

public class home extends AppCompatActivity {

    Button button4,button,button2,button7;
    public void focusMe(View view){
        new FancyShowCaseView.Builder(this)
                .title("You have pressed button 1!!!")
                .focusOn(view)
                .build()
                .show();
    }
    public void focusMee(View view){
        new FancyShowCaseView.Builder(this)
                .title("You have pressed button 2!!!")
                .focusOn(view)
                .build()
                .show();
    }
    public void focusMeee(View view){
        new FancyShowCaseView.Builder(this)
                .title("You have pressed button 3!!!")
                .focusOn(view)
                .build()
                .show();
    }
    public void focusMeeee(View view){
        new FancyShowCaseView.Builder(this)
                .title("You have pressed button 4!!!")
                .focusOn(view)
                .build()
                .show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        button4=(Button)findViewById(R.id.button4);
        button=(Button)findViewById(R.id.button);
        button2=(Button)findViewById(R.id.button2);
        button7=(Button)findViewById(R.id.button7);
    }
}
