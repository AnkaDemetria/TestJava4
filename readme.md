##LES COUTS EN JAVA
Avec la méthode concat c est plus performant et moins couteux en opération que avec l'opérateur de concaténation +

##LES MODULES
Ce sont les packages qu'on importe dans le fichier app et qu'on appelle dans le fichier de la classe

##Les METHODES BUFFEREDREADER ET SCANNER (METHODE SYNCHRONE VS ASYNCHRONE)
 * BufferedReader -> méthode synchrone (bloque l'exécution du code avant d exécuter le reste du code dc moins rapide que asynchrone mais plus performant que scanner ici)
 *                  thread -safe
 *                  lecture de chaines de caractère, 
 *                  pas de parsing
 * Scanner -> méthode asynchrone 
 *          not-thread-safe
 *          lecture de données 
 *          + possibilité de parsing(possibilité de changer int en String, additionner etc)
 
##LA GESTION DES ERREURS
throws exception à côté de la méthode main
ou
avec le try catch

Les exceptions représentent le mécanisme de gestion des erreurs intégré au langage Java. Il se compose d'objets représentant les erreurs et d'un ensemble de trois mots clés qui permettent de détecter et de traiter ces erreurs (try, catch et finally ) mais aussi de les lever ou les propager (throw et throws).

Lors de la détection d'une erreur, un objet qui hérite de la classe Exception est créé (on dit qu'une exception est levée) et propagé à travers la pile d'exécution jusqu'à ce qu'il soit traité.
Ces mécanismes permettent de renforcer la sécurité du code Java.

Si dans un bloc de code on fait appel à une méthode qui peut potentiellement générer une exception, on doit soit essayer de la récupérer avec try/catch, soit ajouter le mot clé throws dans la déclaration du bloc. Si on ne le fait pas, il y a une erreur à la compilation. Les erreurs et exceptions du paquetage java.lang échappent à cette contrainte. Throws permet de déléguer la responsabilité des erreurs à la méthode appelante

Ce procédé présente un inconvénient : de nombreuses méthodes des packages java indiquent dans leur déclaration qu'elles peuvent lever une exception. Cependant ceci garantit que certaines exceptions critiques seront prises explicitement en compte par le programmeur.

finally: sera toujours exécuté qu'on ait une exception ou pas

![Les exceptions et l'héritage java](/Capture.PNG)
A chaque fois qu'on gère une exception, toutes les méthodes en dessous en héritent, et ainsi de suite.
On peut avoir autant de catch que l'on souhaite mais un seul try et un seul finally.
On lui dit quelle exception on souhaite gérer.

Les deux méthodes les plus utilisées:
printStackTrace() est une méthoide qui retourne la pile de problème
getMessage() est une méthode(getter) qui retourne un message de type string


##L HERITAGE EN JAVA
avec le mot clé super
et protected pour la portée de la classe étendue (classe mère)
![L'héritage](/heritage.PNG)

Deux objets ne peuvent pas hériter de la même classe.
Donc la classe phénix étend la classe hommepoisson et pas de pirate.
![L'héritage multiple](/heritage2.PNG)

Pour ne plus rendre possible l'étendue de la classe phénix on utilise le mot clé "final".

##LES CLASSES ABSTRAITES

L'intérêt principal de définir une classe comme abstraite va être justement de fournir un cadre plus strict lorsqu'ils vont utiliser notre code en les forçant à définir certaines méthodes et etc. 

Une classe abstraite est une classe qui ne peut pas être directement instanciée. Une classe abstraite encapsule des attributs et méthodes qui peuvent être utilisés par les instances des classes qui en héritent.
elle ne peut pas être instanciée, mais ses sous-classes non abstraites le peuvent. une classe abstraite est déclarée avec le modificateur abstract.

Une classe abstraite est généralement utilisée pour construire des classes similaires. Elles auront toutes une implémentation en commun, celle de la classe abstraite. Une interface est généralement utilisée pour définir des capacités (le « contrat »), même si les classes n'ont pas grand chose en commun.
C'est la bonne manière de faire pour qu'une classe mère ait plusieurs classes enfants.
La classe abstraite va nous permettre de définir plusieurs choses
On est obligé d'utiliser cette méthode, ça maintient la solidité du code pour les développeurs.
La méthode abstraite n'est pas implémentée.as de constructeur pour les classes abstraites CAR elle ne peut pas être isntanciée dc il serait inutile

Les 3 règles des classes abstraites:
- doit avoir minimum une méthode abstraite
-n'a pas de getter ni de setter: puisque c'est abstrait, il n'y a rien à renvoyer
-oblige ses enfants à utiliser/implémenter les méthodes abstraites (n'a pas le choix)

![Les classes abstraites](/abstract.PNG)