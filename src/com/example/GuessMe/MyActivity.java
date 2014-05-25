package com.example.GuessMe;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void onClick (View view) {
        Toast.makeText(this, "Button 1 pressed",
                Toast.LENGTH_LONG).show();
    }
    public void help (View view){
        setContentView(R.layout.help);
    }


}
