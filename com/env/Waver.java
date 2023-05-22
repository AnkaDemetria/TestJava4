package com.env;

public class Waver extends Vehicule{
    public Waver()
    {
        this.speed = "noeud";
    }
    public void deplacer(int x, int y)
    {
        System.out.println("le waver se déplace en x et y " + x + ", " + y);
    }
}
