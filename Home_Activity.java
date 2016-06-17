package com.example.anwarulhaqmohammed.facebooklogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by anwarulhaqmohammed on 6/14/16.
 */
public class Home_Activity extends Activity {
Button logout;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logout_activity);

        logout = (Button) findViewById(R.id.fblogin);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
