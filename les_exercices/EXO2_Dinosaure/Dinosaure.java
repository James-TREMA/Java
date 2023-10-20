package les_exercices.EXO2_Dinosaure;

public class Dinosaure {

    private String nom;
    private String periode;
    private String taille;

    // Constructeur
    public Dinosaure(String nom, String periode, String taille) {
        this.nom = nom;
        this.periode = periode;
        this.taille = taille;
    }

    public Dinosaure() {
    }

    // Méthode pour obtenir le nom
    public String getNom() {
        return nom;
    }

    // Méthode pour mettre à jour le nom
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Méthode pour obtenir la période
    public String getPeriode() {
        return periode;
    }

    // Méthode pour mettre à jour la période
    public void setPeriode(String periode) {
        this.periode = periode;
    }

    // Méthode pour obtenir la taille
    public String getTaille() {
        return taille;
    }

    // Méthode pour mettre à jour la taille
    public void setTaille(String taille) {
        this.taille = taille;
    }
}
