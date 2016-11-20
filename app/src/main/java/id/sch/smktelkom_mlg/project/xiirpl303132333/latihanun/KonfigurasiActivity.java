package id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.imageButtonSD;
import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.imageButtonSMA;
import static id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R.id.imageButtonSMP;

public class KonfigurasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfigurasi);

        ImageButton sd = (ImageButton) findViewById(imageButtonSD);
        sd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), menu.class);
                startActivity(i);
            }
        });
        ImageButton smp = (ImageButton) findViewById(imageButtonSMP);
        smp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Menu2Activity.class);
                startActivity(i);
            }
        });

        ImageButton sma = (ImageButton) findViewById(imageButtonSMA);
        sma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Menu3Activity.class);
                startActivity(i);
            }
        });
    }
}
