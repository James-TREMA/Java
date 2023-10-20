package cours.LES_CLASS;

// Déclaration de la classe "NomDeLaClasse"
public class NomDeLaClasse {

    // Variables d'instance (ou attributs) de la classe
    // Ces variables définissent l'état d'un objet de cette classe

    // Variable de type int (entier)
    private int variableInt;

    // Variable de type double (nombre à virgule flottante)
    private double variableDouble;

    // Variable de type String (chaîne de caractères) initialisée à null
    private String variableString = null;

    // Variable de type boolean (booléen) accessible publiquement et initialisée à
    // true
    public boolean IsBool = true;

    // Constructeur de la classe
    // Il permet d'initialiser un nouvel objet de cette classe avec des valeurs
    // spécifiques
    public NomDeLaClasse(int _variable1, double _variable2, String _variable3) {
        this.variableInt = _variable1;
        this.variableDouble = _variable2;
        this.variableString = _variable3;
    }

    // Méthodes "getter" et "setter" pour les variables d'instance
    // Elles permettent d'accéder et de modifier les valeurs des variables
    // d'instance

    public int getVariableInt() {
        return this.variableInt;
    }

    public void setVariableInt(int variable1) {
        this.variableInt = variable1;
    }

    public double getVariableDouble() {
        return this.variableDouble;
    }

    public void setVariableDouble(double variable2) {
        this.variableDouble = variable2;
    }

    public String getVariableString() {
        return this.variableString;
    }

    public void setVariableString(String variable3) {
        this.variableString = variable3;
    }

    // Méthode publique "MaMethodePublic"
    // Elle appelle trois méthodes privées et renvoie une chaîne de caractères
    public String MaMethodePublic() {
        MaMethodePrivate01(); // Modifie "variableString" en y ajoutant "variableInt" et "IsBool"
        MaMethodePrivate02(); // Ajoute à "variableString" la valeur de "variableDouble" et une chaîne fixe
        return MaMethodePrivate03(); // Renvoie la valeur actuelle de "variableString"
    }

    // Méthode privée "MaMethodePrivate01"
    // Elle modifie la variable "variableString"
    private void MaMethodePrivate01() {
        this.variableString = "" + this.variableInt + " " + IsBool;
    }

    // Méthode privée "MaMethodePrivate02"
    // Elle ajoute des informations à la variable "variableString"
    private void MaMethodePrivate02() {
        this.variableString += " " + this.variableDouble + " Modification de la String";
    }

    // Méthode privée "MaMethodePrivate03"
    // Elle renvoie la valeur actuelle de "variableString"
    private String MaMethodePrivate03() {
        return this.variableString;
    }
}