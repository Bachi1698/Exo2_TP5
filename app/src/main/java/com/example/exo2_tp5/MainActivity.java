package com.example.exo2_tp5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecycleView mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    public List<Donnee> donnee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager=new GridLayoutManager(this,1,GridLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);
        donnee = new ArrayList<>();
        donnee.add(new Donnee(R.drawable.mercure,"Mercure",12));
        donnee.add(new Donnee(R.drawable.venus,"Venus",13));
        donnee.add(new Donnee(R.drawable.terre,"Terre",14));
        donnee.add(new Donnee(R.drawable.mars,"Mars",12));
        donnee.add(new Donnee(R.drawable.jupiter,"Jupiter",13));
        donnee.add(new Donnee(R.drawable.saturne,"Saturne",14));
        donnee.add(new Donnee(R.drawable.uranus,"Uranus",12));
        donnee.add(new Donnee(R.drawable.neptune,"Neptune",13));
        donnee.add(new Donnee(R.drawable.pluton,"Pluton",14));
        mAdapter = new RecycleView(donnee);
        mRecyclerView.setAdapter(mAdapter);
    }
}