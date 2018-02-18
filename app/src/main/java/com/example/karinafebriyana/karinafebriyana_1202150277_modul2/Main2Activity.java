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


public class Main2Activity extends AppCompatActivity {

    private RadioGroup a;
    private RadioButton b;
    private Button c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void pesan(View view) {
        Intent intent = new Intent (Main2Activity.this, Main3Activity.class);
        startActivity(intent);


        a = (RadioGroup) findViewById(R.id.group);
        c = (Button) findViewById(R.id.pesan);
        addListenerOnButtonpesan();

    }

    public void addListenerOnButtonpesan() {
        c.setOnClickListener(new OnClickListener() {
                                 @Override
                                 public void onClick(View view) {
                                     int selectedId = a.getCheckedRadioButtonId();

                                     b = (RadioButton) findViewById(selectedId);

                                     Toast.makeText(getBaseContext(), "Anda Memilih: " + b.getText(), Toast.LENGTH_SHORT).show();
                                 }


                             }
        );
    }


}

