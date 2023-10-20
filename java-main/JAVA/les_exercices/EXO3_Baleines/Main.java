package les_exercices.EXO3_Baleines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Baleine> baleines = new ArrayList<>();

        // Ajout des informations sur les baleines à l'ArrayList
        baleines.add(new Baleine("Baleine bleue", 30, 100, 15000));
        baleines.add(new Baleine("Rorqual commun", 20, 50, 100000));
        baleines.add(new Baleine("Cachalot", 18, 45, 550000));
        baleines.add(new Baleine("Baleine boréale", 18, 75, 10000));
        baleines.add(new Baleine("Baleine à bosse", 16, 40, 80000));

        // Ajout d'autres espèces de baleines à l'ArrayList
        baleines.add(new Baleine("Béluga", 5.5, 1.5, 150000));
        baleines.add(new Baleine("Baleine de Minke", 10, 10, 800000));
        baleines.add(new Baleine("Bérardie d'Arnoux", 12.5, 14, 50000));

        // Affichage des informations sur le poids au mètre de chaque baleine
        for (Baleine baleine : baleines) {
            System.out.println(
                    "Nom: " + baleine.getNom() + ", Poids au mètre: " + baleine.poidsAuMetre() + " tonnes/mètre");
        }

        // Tri et affichage des cétacés par ordre de poids total estimé pour chaque /
        // espèce sur Terre
        Collections.sort(baleines, Comparator.comparing(Baleine::poidsTotal).reversed());
        System.out.println("\nCétacés par ordre de poids total estimé :");
        for (Baleine baleine : baleines) {
            System.out.println(baleine.getNom() + ": " + baleine.poidsTotal() + " tonnes totales");
        }
    }
}