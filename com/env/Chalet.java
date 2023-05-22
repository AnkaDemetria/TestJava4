package com.env;

public class Chalet extends Construction{
    public Chalet()
    {
        this.nbrPieces = 3;
    }
    public void setNbrPieces(int nbr)
    {
        this.nbrPieces += nbr;
    }
    public int getNbrPieces()
    {
        return nbrPieces;
    }
    public void materiaux(String mat)
    {
        System.out.println("le chalet est construit en " + mat);
    }
}
