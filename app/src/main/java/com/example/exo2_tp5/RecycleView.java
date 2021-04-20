package com.example.exo2_tp5;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecycleView extends RecyclerView.Adapter<RecycleView.ConteneurDeDonnee> {
    private List<Donnee> donnees;



    public RecycleView(List<Donnee> donnees) {
        this.donnees = donnees;
    }

    @Override
    public ConteneurDeDonnee onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycleview, parent, false);
        return new ConteneurDeDonnee(view);
    }


    @Override
    public void onBindViewHolder(ConteneurDeDonnee conteneur, int position) {
        conteneur.tv_nom.setText(donnees.get(position).getNom());
        conteneur.tv_taille.setText(donnees.get(position).getTaille()+"");
        conteneur.image.setImageResource(donnees.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return donnees.size();
    }

    public static class ConteneurDeDonnee extends RecyclerView.ViewHolder {
        ImageView image;
        TextView tv_nom;
        TextView tv_taille;

        public ConteneurDeDonnee(View itemView) {
            super(itemView);
            tv_nom = (TextView) itemView.findViewById(R.id.nom);
            tv_taille = (TextView) itemView.findViewById(R.id.taille);
            image = itemView.findViewById(R.id.image);



        }



    }


}