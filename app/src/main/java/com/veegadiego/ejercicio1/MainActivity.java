package com.veegadiego.ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView info;
    private Button click;
    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        info=(TextView) findViewById(R.id.info);
        username=(EditText) findViewById(R.id.user);
        password=(EditText) findViewById(R.id.pass);
        click=(Button) findViewById(R.id.boton);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(username.getText());
            }
        });

        click.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                info.setText(password.getText());
                return false;
            }
        });

    }




}
