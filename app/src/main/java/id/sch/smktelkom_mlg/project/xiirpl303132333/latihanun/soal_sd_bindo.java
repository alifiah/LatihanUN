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
        recycler.add(new Bindo(R.drawable.bindo6));
        recycler.add(new Bindo(R.drawable.bindo7));
        recycler.add(new Bindo(R.drawable.bindo8));
        recycler.add(new Bindo(R.drawable.bindo9));
        recycler.add(new Bindo(R.drawable.bindo10));
        recycler.add(new Bindo(R.drawable.bindo11));
        recycler.add(new Bindo(R.drawable.bindo12));
        recycler.add(new Bindo(R.drawable.bindo13));
        recycler.add(new Bindo(R.drawable.bindo14));
        recycler.add(new Bindo(R.drawable.bindo15));
        recycler.add(new Bindo(R.drawable.bindo16));
        recycler.add(new Bindo(R.drawable.bindo17));
        recycler.add(new Bindo(R.drawable.bindo18));
        recycler.add(new Bindo(R.drawable.bindo19));
        recycler.add(new Bindo(R.drawable.bindo20));
        recycler.add(new Bindo(R.drawable.bindo21));
        recycler.add(new Bindo(R.drawable.bindo22));
        recycler.add(new Bindo(R.drawable.bindo23));
        recycler.add(new Bindo(R.drawable.bindo24));
        recycler.add(new Bindo(R.drawable.bindo25));
        recycler.add(new Bindo(R.drawable.bindo26));
        recycler.add(new Bindo(R.drawable.bindo27));
        recycler.add(new Bindo(R.drawable.bindo28));
        recycler.add(new Bindo(R.drawable.bindo29));
        recycler.add(new Bindo(R.drawable.bindo30));
        recycler.add(new Bindo(R.drawable.bindo31));
        recycler.add(new Bindo(R.drawable.bindo32));
        recycler.add(new Bindo(R.drawable.bindo33));
        recycler.add(new Bindo(R.drawable.bindo34));
        recycler.add(new Bindo(R.drawable.bindo35));
        recycler.add(new Bindo(R.drawable.bindo36));
        recycler.add(new Bindo(R.drawable.bindo37));
        recycler.add(new Bindo(R.drawable.bindo38));
        recycler.add(new Bindo(R.drawable.bindo39));
        recycler.add(new Bindo(R.drawable.bindo40));
        recycler.add(new Bindo(R.drawable.bindo41));
        recycler.add(new Bindo(R.drawable.bindo42));
        recycler.add(new Bindo(R.drawable.bindo43));
        recycler.add(new Bindo(R.drawable.bindo44));
        recycler.add(new Bindo(R.drawable.bindo45));
        recycler.add(new Bindo(R.drawable.bindo46));
        recycler.add(new Bindo(R.drawable.bindo47));
        recycler.add(new Bindo(R.drawable.bindo48));
        recycler.add(new Bindo(R.drawable.bindo49));
        recycler.add(new Bindo(R.drawable.bindo50));

        BindoAdapter adapter = new BindoAdapter(recycler);
        recyclerViewSDBindo.setAdapter(adapter);

    }
}
