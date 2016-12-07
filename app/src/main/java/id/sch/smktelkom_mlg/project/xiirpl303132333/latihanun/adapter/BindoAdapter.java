package id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.R;
import id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun.model.Bindo;

/**
 * Created by Lenovo G40-70 on 07/12/2016.
 */

public class BindoAdapter extends RecyclerView.Adapter<BindoAdapter.ViewHolder> {
    List<Bindo> BindoList;
    int gambar;
    Context ctx;

    public BindoAdapter(ArrayList BindoList) {
        this.BindoList = BindoList;
    }

    @Override


    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_soal_sd_bindo_2013, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.soal.setImageResource(BindoList.get(position).getGambar());
    }

    @Override
    public int getItemCount() {
        if (BindoList != null)
            return BindoList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView soal;

        public ViewHolder(View itemView) {

            super(itemView);
            ctx = itemView.getContext();
            soal = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}
