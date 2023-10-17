package fr.imts.test;

public class Main {
    public static void main(String[] args) {
        // Instanciation de la classe Cat
        Cat monChat = new Cat();

        // Appel de la méthode miauler
        monChat.miauler(); // Affiche "Meow!"

        // Instanciation de la classe Chien
        Chien monChien = new Chien();

        // Appel de la méthode aboyer
        monChien.aboyer(); // Affiche "Woof!"
    }
}
