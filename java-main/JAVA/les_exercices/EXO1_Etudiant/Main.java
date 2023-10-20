package les_exercices.EXO1_Etudiant;

public class Main {
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant("Jean", 12);
        System.out.println("Nom: " + etudiant1.getNom());
        System.out.println("Note: " + etudiant1.getNote());
        System.out.println("A réussi: " + (etudiant1.aReussi() ? "Oui" : "Non"));

        Etudiant etudiant2 = new Etudiant("Pierre", 2);
        System.out.println("Nom: " + etudiant2.getNom());
        System.out.println("Note: " + etudiant2.getNote());
        System.out.println("A réussi: " + (etudiant2.aReussi() ? "Oui" : "Non"));

        Etudiant etudiant3 = new Etudiant("Jean", 19);
        System.out.println("Nom: " + etudiant3.getNom());
        System.out.println("Note: " + etudiant3.getNote());
        System.out.println("A réussi: " + (etudiant3.aReussi() ? "Oui" : "Non"));

    }

}
