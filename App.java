// // // import monpackage.Test;//toujours mettre ce chemin pour importer un module, le dossier monpackage. le fichier

// // import java.util.Scanner;
// // import java.util.InputMismatchException;
// // // import java.io.BufferedReader;
// // // import java.io.InputStreamReader;

// // /*
// //  * BufferedReader -> méthode synchrone (bloque l'exécution du code avant d exécuter le reste du code dc moins rapide que asynchrone mais plus performant que scanner ici)
// //  *                  thread -safe
// //  *                  lecture de chaines de caractère, 
// //  *                  pas de parsing
// //  * Scanner -> méthode asynchrone 
// //  *          not-thread-safe
// //  *          lecture de données 
// //  *          + possibilité de parsing(possibilité de changer int en String, additionner etc)
// //  */

// // public class App{
// //     // public static String name ="Anka";
// //     // public static String firstname =" Démétria";
// //     // public static String salut = "bonjour, je suis ";
// //     public static void main(String[] args){ //throws Exception{
// //         // Test ts = new Test("voici mon test");
// //         // System.out.println(ts.var);
// //         // System.out.println(salut + name + firstname);
// //         // System.out.println(salut.concat(name).concat(firstname));

// //         // -------------------BufferedReader (2 manières de l'écrire)------------------
// //         // BufferedReader br = new BufferedeReader(new InputStreamReader(System.in));
// //         // System.out.println(br);

// //         // 2eme METHODE
// //         // InputStreamReader isr = new InputStreamReader(System.in);//on lui demande d'écouter ce qui se passe sur le clavier (ressource externe svt en usb)
// //         // BufferedReader br = new BufferedReader(isr);//entrée de l'utilisateur, un peu comme scanner
// //         // String name = br.readLine();//je lis ce qui est par l'utilisateur et je le stocke dans name
// //         // System.out.println(name);//j'affiche ce qui a été stocké dans la variable name
// //         // br.close();//on referme pour gagner de la place
        

// //         // -------------------Scanner---------------------------------
// //         Scanner scanner = new Scanner(System.in);
// //         try {
// //             int reponse = scanner.nextInt();
// //             System.out.println(reponse);
// //         } catch (InputMismatchException e) {
// //             System.out.println("veuillez entrer un chiffre");
// //             e.printStackTrace();
// //         }
// //         scanner.close();

// //     }
// // }



// // // LES COUTS EN JAVA
// // // Avec la méthode concat c est plus performant et moins couteux en opération que avec l'opérateur de concaténation +

// // // LES MODULES
// // // Ce sont les packages qu'on importe dans le fichier app et qu'on appelle dans le fichier de la classe

// // // LA GESTION DES EXCEPTIONS
// // // throws exception àcôté de la méthode main
// // // ou
// // // avec le try catch

// import com.env.Bateau;
// import com.perso.*;
// public class App {
//     public static void main(String[] args) {
//         // loffi pirate
//         // jimbe pirate homme poisson
//         Pirate p = new Pirate("Loffi");
//         p.move(32, 42);
//         HommePoisson hp = new HommePoisson("Jimbe");
//         // hp.move(45, 24);
//         // hp.swim(5);

//         // POUR LA REDEFINITION DE LA METHODE SWIm:
//         // hp.swim(4,43,23);

//         // NOUVELLE INSTANCE CLASSE PHENIX, qui hérite de HommePoisson
//         Phenix ph = new Phenix("Marco");
//         ph.fly(4,80,30);


//         // INSTANCE DE COMBATTANT,CLASSE ABSTRAITE
//         // Combattant c = new Combattant();
//         // System.out.println(c.kezako());

//     }
// }


// POUR FICHIER env
import com.env.*;

public class App{
    public static void main(String[] args)
    {
        Chalet ch = new Chalet();
        System.out.println(ch.getNbrPieces());
        ch.setNbrPieces('4');
        System.out.println(ch.getNbrPieces());
    }
}