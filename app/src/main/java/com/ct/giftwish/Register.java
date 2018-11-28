package com.ct.giftwish;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ct.giftwish.R;

/**
 * Created by claudiaedelman on 22/04/2018.
 */

public class Register extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);

        Button btnNext = (Button)findViewById(R.id.btnnext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register.this, GiftChoose.class);
                startActivity(intent);
            }
        });

    }
}
