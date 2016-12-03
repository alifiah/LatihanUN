package id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.bindo13;
import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.bindo_sd_15;
import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.bindosd14;
import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.bing_sd_13;
import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.bing_sd_15;
import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.bingsd14;
import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.mat_sd_15;
import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.matsd13;
import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.matsd14;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        Button ssd = (Button) findViewById(bindo13);
        ssd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_sd_bindo.class);
                startActivity(i);
            }
        });

        Button sssd = (Button) findViewById(bing_sd_13);
        sssd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_sd_ipa.class);
                startActivity(i);
            }
        });

        Button sssd1 = (Button) findViewById(matsd13);
        sssd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_sd_matematika.class);
                startActivity(i);
            }
        });

        Button ssd2 = (Button) findViewById(bindosd14);
        ssd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_sd_bindo.class);
                startActivity(i);
            }
        });

        Button sssd2 = (Button) findViewById(bingsd14);
        sssd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_sd_ipa.class);
                startActivity(i);
            }
        });
        Button sssd3 = (Button) findViewById(matsd14);
        sssd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_sd_matematika.class);
                startActivity(i);
            }
        });

        Button ssd4 = (Button) findViewById(bindo_sd_15);
        ssd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_sd_bindo.class);
                startActivity(i);
            }
        });

        Button sssd4 = (Button) findViewById(bing_sd_15);
        sssd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_sd_ipa.class);
                startActivity(i);
            }
        });

        Button sssd5 = (Button) findViewById(mat_sd_15);
        sssd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), soal_sd_matematika.class);
                startActivity(i);
            }
        });
    }
}
