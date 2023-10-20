package cours.Balaines.comprendre_les_tableau.exo;

import java.util.ArrayList;

public class ExempleBaleinesPrehistoriques {
    public static void main(String[] args) {
        // Création d'un ArrayList pour stocker les informations sur une espèce
        ArrayList<String> pakicetus = new ArrayList<String>();
        pakicetus.add("Pakicetus");
        pakicetus.add("Pakicetus inachus");
        pakicetus.add("2");

        ArrayList<String> ambulocetus = new ArrayList<String>();
        ambulocetus.add("Ambulocetus");
        ambulocetus.add("Ambulocetus natans");
        ambulocetus.add("3");

        ArrayList<String> basilosaurus = new ArrayList<String>();
        basilosaurus.add("Basilosaurus");
        basilosaurus.add("Basilosaurus cetoides");
        basilosaurus.add("18");

        // Création d'un ArrayList pour stocker les informations sur les espèces
        // préhistoriques
        ArrayList<ArrayList<String>> infosEspeces = new ArrayList<ArrayList<String>>();
        infosEspeces.add(pakicetus);
        infosEspeces.add(ambulocetus);
        infosEspeces.add(basilosaurus);

        // Affichage des informations sur les espèces préhistoriques
        for (ArrayList<String> info : infosEspeces) {
            System.out.println("Nom: " + info.get(0));
            System.out.println("Nom latin: " + info.get(1));
            System.out.println("Taille (en mètres): " + info.get(2));
            System.out.println();
        }
    }
}
