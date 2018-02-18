package com.example.karinafebriyana.karinafebriyana_1202150277_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static int splashInterval = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent pindah = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(pindah);
                Toast.makeText(MainActivity.this, "KARINAFEBRIYANA_1202150277", Toast.LENGTH_SHORT).show();
                this.finish();
            }

            private void finish() {

            }
        }, splashInterval);
    }
}
