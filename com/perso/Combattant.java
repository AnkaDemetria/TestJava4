package com.perso;

public class Combattant extends EtreVivant {
    public Combattant()//constructeur pour pouvoir créer une instance (qd une méthode a le meme nom que la classe), il n'y a que les constructeurs qui ont majuscule, méthode: minuscule
    {
        race = "Combattant";
    }
    public void respirer()
    {//on implémente la méthode obligatoirement, cad d'utiliser les accolades même s'il n'y a rien dedans
        System.out.println("combattant respire normalement");
    }
}
