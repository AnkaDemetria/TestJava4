// package com.perso;

// public class Pirate {
//     public Pirate(String name){
//         this.name = name;
//         this.posX = 30;//ils ne sont pas dans les paramètres car ce sont des valeurs par défaut, les personnages sont là au début du jeu par défaut
//         this.posY = 30;
//     }
//     public void move(int x, int y)//méthode move, on utilise this dans le pinrtln car on n'a pas mis méthode static void mais juste méthode void
// {
//     this.posX = x;
//     this.posY = y;
//     System.out.println("le pirate se déplace en X:" +this.posX+ " et en y: " +this.posY);

// }

//     protected String name;
//     protected int posX;
//     protected int posY;
// }

// Avec HERITAGE ON PEUT SIMPLIFIER LE CODE :
package com.perso;

public class Pirate {
    public Pirate(String name) 
    {
        this.name = name;
        this.posX = 42;//valeur par défaut dc pas en paramètres de Pirate
        this.posY = 42;//valeur par défaut
    }

    public void move(int x, int y)
    {
        this.posX = x;
        this.posY = y;
        // System.out.println("Le pirate se deplace en X:" + this.posX + " et en Y : " + this.posY);
        System.out.println(this.name + " se deplace en X:" + this.posX + " et en Y : " + this.posY);
    }

    protected String name;//private sauf pour els classes qui héritent
    protected int posX;
    protected int posY;
}
