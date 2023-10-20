package les_exercices.EXO1_Etudiant;

public class Etudiant {

    private String nom;
    private double note;

    public Etudiant(String nom, double note) {
        this.nom = nom;
        this.note = note;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getNote() {
        return this.note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    // Méthode pour déterminer si l'étudiant a réussi ou non
    public boolean aReussi() {
        if (note >= 10) {
            return true;
        } else {
            return false;
        }
    }

}
