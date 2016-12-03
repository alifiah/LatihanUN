package id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.bindosma13;
import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.bindosma14;
import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.bindosma15;
import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.bingsma13;
import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.bingsma14;
import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.bingsma15;
import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.matsma13;
import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.matsma14;
import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.matsma15;

public class Menu3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_3);

        Button sma1 = (Button) findViewById(bindosma13);
        sma1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_sd_bindo.class);
                startActivity(i);
            }
        });

        Button sma2 = (Button) findViewById(bingsma13);
        sma2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_sd_ipa.class);
                startActivity(i);
            }
        });

        Button sma3 = (Button) findViewById(matsma13);
        sma3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_sd_matematika.class);
                startActivity(i);
            }
        });

        Button sma4 = (Button) findViewById(bindosma14);
        sma4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_sd_bindo.class);
                startActivity(i);
            }
        });

        Button sma5 = (Button) findViewById(bingsma14);
        sma5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_sd_ipa.class);
                startActivity(i);
            }
        });
        Button sma6 = (Button) findViewById(matsma14);
        sma6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_sd_matematika.class);
                startActivity(i);
            }
        });

        Button sma7 = (Button) findViewById(bindosma15);
        sma7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_sd_bindo.class);
                startActivity(i);
            }
        });


        Button sma8 = (Button) findViewById(bingsma15);
        sma8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_sd_ipa.class);
                startActivity(i);
            }
        });

        Button sma9 = (Button) findViewById(matsma15);
        sma9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_sd_matematika.class);
                startActivity(i);
            }
        });
    }
}
