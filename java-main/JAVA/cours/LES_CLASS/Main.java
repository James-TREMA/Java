package cours.LES_CLASS;

// Déclaration de la classe "Main"
public class Main {

    // Méthode principale "main" qui est le point d'entrée de l'application Java
    public static void main(String[] args) {

        // Création d'une nouvelle instance de la classe "NomDeLaClasse" avec les
        // valeurs 0, 1.5 et "Toto"
        // et assignation de cette instance à la variable "maClassIntancie"
        NomDeLaClasse maClassIntancie = new NomDeLaClasse(0, 1.5d, "Toto");

        // Modification de la variable publique "IsBool" de l'objet "maClassIntancie"
        // pour lui assigner la valeur "false"
        maClassIntancie.IsBool = false;

        // Appel de la méthode "MaMethodePublic" de l'objet "maClassIntancie"
        // et stockage du résultat retourné par cette méthode dans la variable
        // "returnMethode"
        String returnMethode = maClassIntancie.MaMethodePublic();

        // Affichage du contenu de la variable "returnMethode" dans la console
        System.out.println(returnMethode);
    }
}
