package com.sapiens.ideasfarmprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        secondState(false);

        Button button= (Button) findViewById(R.id.button_anon);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,tutorial1.class));
            }
        });

    }


    protected void secondState(boolean b) {
        ImageView logo = (ImageView) findViewById(R.id.image_logo);
        EditText nome = (EditText) findViewById(R.id.text_nome);
        EditText senha = (EditText) findViewById(R.id.text_senha);
        Button login = (Button) findViewById(R.id.button_login);
        Button anon = (Button) findViewById(R.id.button_anon);


        if (b == false) {
            RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams)logo.getLayoutParams();
            params.addRule(RelativeLayout.ALIGN_PARENT_TOP);

            nome.setVisibility(View.VISIBLE);
            senha.setVisibility(View.VISIBLE);
            login.setVisibility(View.VISIBLE);
            anon.setVisibility(View.VISIBLE);
            logo.setLayoutParams(params);
        }

    }


}