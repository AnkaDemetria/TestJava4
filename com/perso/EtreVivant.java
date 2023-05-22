package com.perso;
import java.sql.Date;

public abstract class EtreVivant {//elle ne peut pas avoir d'instance
    protected String race;

    public String kezako()
    {
        return race;
    }

    public void naitre(Date date){//on peut faire une classe concrète qui aura elle, une implémentation
        System.out.println("je suis né le "+date);
    }
    abstract public void respirer();//je suis obligé d utiliser cette méthode abstraite respirer qu'on n'a pas implémenté
}
