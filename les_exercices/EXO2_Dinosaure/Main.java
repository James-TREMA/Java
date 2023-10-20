package les_exercices.EXO2_Dinosaure;

public class Main {
    public static void main(String[] args) {
        // Instanciation de la classe Dinosaure
        Dinosaure monDinosaure = new Dinosaure("Tyrannosaurus", "Crétacé", "12m");
        Dinosaure monDinosaure2 = new Dinosaure("T. Rex", "Crétacé", "19m");

        // Affiche des information du dinosaure
        System.out.println("Nom du dinosaure: " + monDinosaure.getNom());
        System.out.println("Période: " + monDinosaure.getPeriode());
        System.out.println("Taille: " + monDinosaure.getTaille());

        // Affiche des information du dinosaure
        System.out.println("Nom du dinosaure: " + monDinosaure2.getNom());
        System.out.println("Période: " + monDinosaure2.getPeriode());
        System.out.println("Taille: " + monDinosaure2.getTaille());

    }
}
