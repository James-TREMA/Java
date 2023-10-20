package les_exercices.EXO3_Baleines;

public class Baleine {
    private String nom;
    private double taille;
    private double poids;
    private int nombre;

    public Baleine(String nom, double taille, double poids, int nombre) {
        this.nom = nom;
        this.taille = taille;
        this.poids = poids;
        this.nombre = nombre;
    }

    // Méthode pour calculer le poids au mètre de la baleine
    public double poidsAuMetre() {
        return poids / taille;
    }

    // Méthode pour calculer le poids total estimé de la baleine
    public double poidsTotal() {
        return poids * nombre;
    }

    // Méthode pour obtenir le nom de la baleine
    public String getNom() {
        return nom;
    }

    // Méthode pour obtenir la taille de la baleine
    @Override
    public String toString() {
        return "Nom: " + nom + ", Taille: " + taille + " mètres, Poids: " + poids + " tonnes, Nombre: " + nombre;
    }
}
