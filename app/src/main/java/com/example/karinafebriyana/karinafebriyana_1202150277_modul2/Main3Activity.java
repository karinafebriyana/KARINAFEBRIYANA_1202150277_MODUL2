package com.example.karinafebriyana.karinafebriyana_1202150277_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    private Button pesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void pilihpesanan (View view) {
        Intent intent = new Intent(Main3Activity.this, Main5Activity.class);
        startActivity(intent);

        pesan = (Button) findViewById(R.id.button2);
        addListenerOnButton2();

    }

    public void addListenerOnButton2() {
        pesan.setOnClickListener(new OnClickListener() {
                                 @Override
                                 public void onClick(View view) {


                                 }
                             }
        );
    }

}
