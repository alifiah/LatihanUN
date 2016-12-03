package id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.bindosma13;
import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.bindosma14;
import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.bindosmp15;
import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.bingsma14;
import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.bingsmp13;
import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.bingsmp15;
import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.matsma13;
import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.matsma14;
import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.matsmp15;

public class Menu2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_2);

        Button smp1 = (Button) findViewById(bindosma13);
        smp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_sd_bindo.class);
                startActivity(i);
            }
        });

        Button smp2 = (Button) findViewById(bingsmp13);
        smp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_sd_ipa.class);
                startActivity(i);
            }
        });

        Button smp3 = (Button) findViewById(matsma13);
        smp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_sd_matematika.class);
                startActivity(i);
            }
        });

        Button smp4 = (Button) findViewById(bindosma14);
        smp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_sd_bindo.class);
                startActivity(i);
            }
        });

        Button smp5 = (Button) findViewById(bingsma14);
        smp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_sd_ipa.class);
                startActivity(i);
            }
        });
        Button smp6 = (Button) findViewById(matsma14);
        smp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_sd_matematika.class);
                startActivity(i);
            }
        });

        Button smp7 = (Button) findViewById(bindosmp15);
        smp7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_sd_bindo.class);
                startActivity(i);
            }
        });

        Button smp8 = (Button) findViewById(bingsmp15);
        smp8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_sd_ipa.class);
                startActivity(i);
            }
        });

        Button smp9 = (Button) findViewById(matsmp15);
        smp9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_sd_matematika.class);
                startActivity(i);
            }
        });
    }
}
