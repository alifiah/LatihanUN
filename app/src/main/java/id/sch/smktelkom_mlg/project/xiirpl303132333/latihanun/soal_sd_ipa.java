package id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.adapter.IpaAdapter;
import id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.model.Ipa;

public class soal_sd_ipa extends AppCompatActivity {

    RecyclerView recyclerViewSDIpa;
    ArrayList<Ipa> recycler2 = new ArrayList<>();
    IpaAdapter ipaAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal_sd_ipa);

        recyclerViewSDIpa = (RecyclerView) findViewById(R.id.recyclerview2);
        recyclerViewSDIpa.setLayoutManager(new LinearLayoutManager(this));
        recycler2 = new ArrayList<>();
        recycler2.add(new Ipa(R.drawable.ipa1));
        recycler2.add(new Ipa(R.drawable.ipa2));
        recycler2.add(new Ipa(R.drawable.ipa3));
        recycler2.add(new Ipa(R.drawable.ipa4));
        recycler2.add(new Ipa(R.drawable.ipa15));
        recycler2.add(new Ipa(R.drawable.ipa6));
        recycler2.add(new Ipa(R.drawable.ipa7));
        recycler2.add(new Ipa(R.drawable.ipa8));
        recycler2.add(new Ipa(R.drawable.ipa9));
        recycler2.add(new Ipa(R.drawable.ipa10));
        recycler2.add(new Ipa(R.drawable.ipa11));
        recycler2.add(new Ipa(R.drawable.ipa12));
        recycler2.add(new Ipa(R.drawable.ipa13));
        recycler2.add(new Ipa(R.drawable.ipa14));
        recycler2.add(new Ipa(R.drawable.ipa15));
        recycler2.add(new Ipa(R.drawable.ipa16));
        recycler2.add(new Ipa(R.drawable.ipa17));
        recycler2.add(new Ipa(R.drawable.ipa18));
        recycler2.add(new Ipa(R.drawable.ipa19));
        recycler2.add(new Ipa(R.drawable.ipa20));
        recycler2.add(new Ipa(R.drawable.ipa21));
        recycler2.add(new Ipa(R.drawable.ipa22));
        recycler2.add(new Ipa(R.drawable.ipa23));
        recycler2.add(new Ipa(R.drawable.ipa24));
        recycler2.add(new Ipa(R.drawable.ipa25));
        recycler2.add(new Ipa(R.drawable.ipa26));
        recycler2.add(new Ipa(R.drawable.ipa27));
        recycler2.add(new Ipa(R.drawable.ipa28));
        recycler2.add(new Ipa(R.drawable.ipa29));
        recycler2.add(new Ipa(R.drawable.ipa30));
        recycler2.add(new Ipa(R.drawable.ipa31));
        recycler2.add(new Ipa(R.drawable.ipa32));
        recycler2.add(new Ipa(R.drawable.ipa33));
        recycler2.add(new Ipa(R.drawable.ipa34));
        recycler2.add(new Ipa(R.drawable.ipa35));
        recycler2.add(new Ipa(R.drawable.ipa36));
        recycler2.add(new Ipa(R.drawable.ipa37));
        recycler2.add(new Ipa(R.drawable.ipa38));
        recycler2.add(new Ipa(R.drawable.ipa39));
        recycler2.add(new Ipa(R.drawable.ipa40));


        IpaAdapter adapter2 = new IpaAdapter(recycler2);
        recyclerViewSDIpa.setAdapter(adapter2);

    }
}
