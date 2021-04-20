package com.example.exo2_tp5;

public class Donnee {
    private int image;

    public void setImage(int image) {
        this.image = image;
    }

    public Donnee(int image, String nom, int taille) {
        this.image = image;
        this.nom = nom;
        this.taille = taille;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getImage() {
        return image;
    }

    public String getNom() {
        return nom;
    }

    public int getTaille() {
        return taille;
    }

    private  String nom;
    private int taille;

}
