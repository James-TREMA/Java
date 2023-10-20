package cours.Balaines;

public class Main {
    /**
     * Le code new MesBaleines().new Rorqual();
     * est utilisé pour créer une instance de la classe interne Rorqual qui est
     * définie à l'intérieur de la classe externe MesBaleines.
     * Voici une explication détaillée :
     * 
     * new MesBaleines() : Ceci crée une nouvelle instance de la classe externe
     * MesBaleines.
     * 
     * .new Rorqual() : Une fois que nous avons une instance de la classe externe,
     * nous utilisons cette instance pour créer une nouvelle instance de la classe
     * interne Rorqual.
     * 
     * En Java, pour instancier une classe interne non statique,
     * vous devez d'abord avoir une instance de la classe externe.
     * C'est parce que chaque instance de la classe interne est associée à une
     * instance spécifique de la classe externe.
     * Cette association permet à la classe interne d'accéder directement aux
     * membres (même privés) de la classe externe.
     * 
     * Dans l'exemple donné, new MesBaleines().new Rorqual();
     * crée d'abord une instance de MesBaleines, puis utilise cette instance pour
     * créer une instance de la classe interne Rorqual.
     * 
     * C'est une particularité des classes internes non statiques en Java.
     * Si Rorqual avait été déclaré comme une classe interne statique, vous auriez
     * pu simplement l'instancier avec new MesBaleines.Rorqual();.
     * Mais dans le code fourni, Rorqual est une classe interne non statique, d'où
     * la nécessité de la syntaxe spécifique.
     * 
     * 
     * 
     * 
     * 
     * 
     */
    public static void main(String[] args) {
        // Création d'un objet Rorqual
        MesBaleines.Rorqual monRorqual = new MesBaleines().new Rorqual();

        // Appel de la méthode seDeplacer()
        monRorqual.seDeplacer(); // Affiche : Le rorqual nage rapidement dans l'océan...
    }
}
