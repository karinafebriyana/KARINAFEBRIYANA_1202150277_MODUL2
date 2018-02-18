package com.example.karinafebriyana.karinafebriyana_1202150277_modul2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main5Activity extends AppCompatActivity {
    private ImageButton genki1;
    private ImageButton genki2;
    private ImageButton genki3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    public void genki1(View view) {
        Intent intent = new Intent(Main5Activity.this, Main6Activity.class);
        startActivity(intent);

        genki1 = (ImageButton) findViewById(R.id.imageButton2);
        addListenerOnButton2();

    }

    public void addListenerOnButton2() {
        genki1.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {


                                     }
                                 }
        );
    }

    public void genki2(View view) {
        Intent intent = new Intent(Main5Activity.this, Main7Activity.class);
        startActivity(intent);

        genki2 = (ImageButton) findViewById(R.id.imageButton4);
        addListenerOnButton2();

    }

    public void genki3(View view) {
        Intent intent = new Intent(Main5Activity.this, Main7Activity.class);
        startActivity(intent);

        genki3 = (ImageButton) findViewById(R.id.imageButton5);
        addListenerOnButton2();
    }
}
