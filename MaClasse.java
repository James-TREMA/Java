// Ceci est une classe Java
public class MaClasse {

    // Ceci est une variable de classe (aussi appelée variable statique)
    static int maVariableStatique = 10;

    // Ceci est une variable d'instance
    int maVariableInstance = 20;

    public void maMethode() {
        // Ceci est une variable locale
        int maVariableLocale = 30;

        System.out.println("Variable statique : " + maVariableStatique);
        System.out.println("Variable d'instance : " + maVariableInstance);
        System.out.println("Variable locale : " + maVariableLocale);
    }

    public static void main(String[] args) {
        // Création d'un objet de la classe MaClasse
        MaClasse obj = new MaClasse();

        // Appel de la méthode maMethode sur l'objet obj
        obj.maMethode();
    }
}
