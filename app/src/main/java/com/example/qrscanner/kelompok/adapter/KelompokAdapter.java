package com.example.qrscanner.kelompok.adapter;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.qrscanner.R;
import com.example.qrscanner.kelompok.model.KelompokModel;

import java.util.ArrayList;

public class KelompokAdapter extends RecyclerView.Adapter<KelompokAdapter.KelompokViewHolder> {


    private ArrayList<KelompokModel> dataList;

    public KelompokAdapter(ArrayList<KelompokModel> dataList) {
            this.dataList = dataList;
            }

    @Override
    public KelompokViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View view = layoutInflater.inflate(R.layout.fragment_kelompok_adapter, parent, false);
            return new KelompokViewHolder(view);
            }

    @Override
    public void onBindViewHolder(KelompokViewHolder holder, int position) {
            holder.txtNama.setText(dataList.get(position).getNama());
            holder.txtNim.setText(dataList.get(position).getNim());

            }

    @Override
    public int getItemCount() {
            return (dataList != null) ? dataList.size() : 0;
            }

    public class KelompokViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtNim, txtNoHp;

        public KelompokViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.tvNama);
            txtNim = (TextView) itemView.findViewById(R.id.tvNim);
        }
    }
}