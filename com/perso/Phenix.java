package com.perso;

public final class Phenix extends HommePoisson{
    public Phenix(String name) {
        super(name);//on redéfinit la méthode constructeur DC PAS super.name()
    }
    public void fly(int x, int y, int z)
    {
        super.swim(x, y, z);//héritage de la méthode swim, on récupère x, y, z
        System.out.println("Le phénix "+this.name+ " vole en X, Y et Z:" +this.posX+" "+ this.posY + " "+ this.posZ);
    }
}
