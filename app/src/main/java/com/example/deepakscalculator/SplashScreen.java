package com.example.deepakscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Hide toolbar or action bar
        getSupportActionBar().hide();

        //create object using "Thread" class
        Thread thread = new Thread(){

            //make use of "run" method of "Thread" class
            public void run(){
                try{                              //write that code, which you feel that "it may give error"
                    sleep(4000);
                }
                catch(Exception e){               //Exception Handling Message
                    e.printStackTrace();           //a tool used to handle exceptions and errors, gives message if there is an error
                }
                finally{
                    //link splash screen to main calculation screen
                    Intent intent = new Intent(SplashScreen.this , MainActivity.class);
                    startActivity(intent);          //linking of activity done here
                }
            }
        };

        //Start thread , which is created above
        thread.start();

    }
}