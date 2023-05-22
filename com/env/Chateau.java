package com.env;

public class Chateau extends Construction{
    public Chateau ()
    {
        this.nbrPieces = 34;
    }
    public void materiaux(String mat)
    {
        System.out.println("le chateau est construit en " + mat);
    }
}
