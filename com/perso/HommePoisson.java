// package com.perso;

// public class HommePoisson {
//     public HommePoisson(String name){
//         this.name = name;
//         this.posX = 30;//ils ne sont pas dans les paramètres car ce sont des valeurs par défaut, les perosnnages sont là au début du jeu par défaut
//         this.posY = 30;
//         this.posZ = 42;
//     }
//     public void move(int x, int y, int z)//méthode move, on utilise this dans le pinrtln car on n'a pas mis méthode static void mais juste méthode void
// {
//     this.posX = x;
//     this.posY = y;
//     this.posZ = z;
//     System.out.println("l'homme poisson se déplace en X:" +this.posX+ " et en y: " +this.posY+ " et en z: "+this.posZ);

// }

//     public void swim(int z)
//     {
//     this.posZ = z;
//     System.out.println("lhomme poisson se déplace en z: " +this.posZ);
//     }
//     private String name;
//     private int posX;
//     private int posY;
//     private int posZ;
// }

// AVEC L HERITAGE ON PEUT MODIFIER LE CODE DE CETTE FAçON/
package com.perso;

public class HommePoisson extends Pirate {
    public HommePoisson(String name)
    {
        super(name);// super=supérieur, ce sont les attributs qui sont sur la classe supérieure, aussi pr les méthodes, ça redéfinit les attributs
        this.posZ = 42;
    }

    // public void move(int x, int y)//on en a plus besoin car c'est dans la classe Pirate dont il hérite
    // {
    //     this.posX = x;
    //     this.posY = y;
    //     System.out.println("Le pirate se deplace en X:" + this.posX + " en Y : " + this.posY);
    // }

    // POUR REDEFINIR UNE METHODE D HERITAGE
    // public void move(int x, int y)
    // {
    //     super.move(x,y);
    //     System.out.println("homme poisson se déplace en: ");
    // }

    // public void swim(int z)
    // {
    //     this.posZ = z;
    //     System.out.println("L'homme poisson se deplace en Z:"  + this.posZ);
    //     System.out.println(this.name + " se deplace en Z:"  + this.posZ);
    // }

    // POUR REDEFINIR LA FONCTION MOVE
    public void swim(int x, int y, int z)
    {
        move(x, y);//pas besoin de mettre le mot super, car on appelle juste la fction move
        this.posZ = z;
        System.out.println("L'homme poisson nage en X, Y et Z:" +this.posX+" "+ this.posY + " "+ this.posZ);
    }

    protected int posZ;
}
