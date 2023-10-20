package cours.Balaines;

public class MesBaleines {

    // Classe de base Artiodactyle
    public class Artiodactyle {
        public void seDeplacer() {
            System.out.println("L'artiodactyle marche...");
        }
    }

    // Sous-classe Indohyus héritant de Artiodactyle
    public class Indohyus extends Artiodactyle {
        @Override
        public void seDeplacer() {
            System.out.println("L'Indohyus marche et nage occasionnellement...");
        }
    }

    // Classe de base Cetace
    public class Cetace {
        public void seDeplacer() {
            System.out.println("Le cétacé nage...");
        }
    }

    // Sous-classe Pakicetus héritant de Cetace
    public class Pakicetus extends Cetace {
        @Override
        public void seDeplacer() {
            System.out.println("Le Pakicetus marche et nage...");
        }
    }

    // Sous-classe Ambulocetus héritant de Pakicetus
    public class Ambulocetus extends Pakicetus {
        @Override
        public void seDeplacer() {
            System.out.println("L'Ambulocetus nage plus efficacement...");
        }
    }

    // Sous-classe Basilosaurus héritant de Ambulocetus
    public class Basilosaurus extends Ambulocetus {
        @Override
        public void seDeplacer() {
            System.out.println("Le Basilosaurus est un excellent nageur...");
        }
    }

    // Sous-classe Dorudon héritant de Basilosaurus
    public class Dorudon extends Basilosaurus {
        @Override
        public void seDeplacer() {
            System.out.println("Le Dorudon nage gracieusement dans l'océan...");
        }
    }

    // Sous-classe Baleine héritant de Dorudon
    public class Baleine extends Dorudon {
        @Override
        public void seDeplacer() {
            System.out.println("La baleine nage majestueusement dans l'océan...");
        }
    }

    // Sous-classe Mysticetes (baleines à fanons) héritant de Baleine
    public class Mysticetes extends Baleine {
        @Override
        public void seDeplacer() {
            System.out.println("Les Mysticètes, ou baleines à fanons, nagent tranquillement en filtrant l'eau de mer pour se nourrir...");
        }
    }

    // Sous-classe Rorqual héritant de Mysticetes
    public class Rorqual extends Mysticetes {
        @Override
        public void seDeplacer() {
            System.out.println("Le rorqual nage rapidement dans l'océan...");
        }
    }
}
