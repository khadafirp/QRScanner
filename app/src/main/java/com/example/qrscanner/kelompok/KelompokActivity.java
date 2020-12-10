package com.example.qrscanner.kelompok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.qrscanner.R;
import com.example.qrscanner.kelompok.adapter.KelompokAdapter;
import com.example.qrscanner.kelompok.model.KelompokModel;

import java.util.ArrayList;
import java.util.Arrays;

public class KelompokActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private KelompokAdapter adapter;
    private KelompokModel kelompokModel;
    private ArrayList<KelompokModel> kelompokArrayList = new ArrayList<>();
    ImageView ivKembali;

    String[] nama = {"Ruben Filemon",
            "Dwi Anggoro",
            "Rizki Muchtar",
            "Khadafi Rohman Prihanda"
        };
    String[] nim = {"2023192005", "2023201001", "2023201002", "2022201017"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelompok);

        ivKembali = findViewById(R.id.ivKembali);

        ivKembali.setOnClickListener(v -> finish());

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        adapter = new KelompokAdapter(kelompokArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(KelompokActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

        for (int i = 0 ; i < nama.length ; i++){
            kelompokModel = new KelompokModel();
            kelompokModel.setNama(nama[i]);
            kelompokModel.setNim(nim[i]);
            kelompokArrayList.add(kelompokModel);
        }
    }
}