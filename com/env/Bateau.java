package com.env;

public class Bateau extends Vehicule {
    public Bateau(){
        this.speed = "noeud";//on va créer un constructeur, on est dans le contexte du bateau
    }
    public void deplacer(int x, int y){
        System.out.println("le bateau se déplace en x et y "+x+ ", " +y);
    }
}
