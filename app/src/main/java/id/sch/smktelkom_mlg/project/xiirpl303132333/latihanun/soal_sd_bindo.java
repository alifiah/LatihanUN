package id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.adapter.BindoAdapter;
import id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.model.Bindo;

public class soal_sd_bindo extends AppCompatActivity {

    RecyclerView recyclerViewSDBindo;
    ArrayList<Bindo> recycler = new ArrayList<>();
    BindoAdapter bindoAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal_sd_bindo);

        recyclerViewSDBindo = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerViewSDBindo.setLayoutManager(new LinearLayoutManager(this));
        recycler = new ArrayList<>();
        recycler.add(new Bindo(R.drawable.bindo1));
        recycler.add(new Bindo(R.drawable.bindo2));
        recycler.add(new Bindo(R.drawable.bindo3));
        recycler.add(new Bindo(R.drawable.bindo4));
        recycler.add(new Bindo(R.drawable.bindo5));

        BindoAdapter adapter = new BindoAdapter(recycler);
        recyclerViewSDBindo.setAdapter(adapter);

    }
}
