package MesEXO.exo1;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class InteractiveConsole {
    // Classe pour représenter une personne
    static class Person {
        int num;
        String prenom;
        String nom;
        int age;
        String avertissement;

        Person(int num, String prenom, String nom, int age, String avertissement) {
            this.num = num;
            this.prenom = prenom;
            this.nom = nom;
            this.age = age;
            this.avertissement = avertissement;
        }

        @Override
        public String toString() {
            return String.format("\n-Numérro : %d\n-Prénom : %s\n-Nom : %s\n-Age : %d ans\n-Avertissement: %s\n\n",
                    num, prenom, nom, age, avertissement);
        }
    }

    public static void main(String[] args) {
        Console console = System.console();
        List<Person> persons = new ArrayList<>();

        while (true) {
            console.printf("\n\nDépot de plainte\n");
            console.printf("Gestion des commandes (add/get/delete/quit)\n\n");

            String command = console.readLine();
            console.printf("\033[1A\033[2K"); // permet de supprimé l'ancienne commande

            switch (command) {
                case "add":

                    int num = -1; // valeur par défaut
                    while (num == -1) {
                        try {
                            console.printf("Entrez le numéro de plainte de la personne: ");
                            num = Integer.parseInt(console.readLine());
                        } catch (NumberFormatException e) {
                            console.printf("Veuillez entrer un numéro valide.\n");
                        }
                    }
                    console.printf("Entrez votre prénom: ");
                    String prenom = console.readLine();

                    console.printf("Entrez votre nom: ");
                    String nom = console.readLine();

                    console.printf("Entrez votre âge: ");
                    int age = Integer.parseInt(console.readLine());

                    console.printf("Entrez un avertissement: ");
                    String avertissement = console.readLine();

                    persons.add(new Person(num, prenom, nom, age, avertissement));
                    console.printf("Personne ajoutée: %s%n", persons.get(persons.size() - 1).toString());
                    break;

                case "get":
                    // Si il à pas de plainte on affiche un message
                    if (persons.size() == 0) {
                        console.printf("Aucune personne n'a déposé de plainte.\n");
                        break;
                    }
                    for (Person person : persons) {
                        console.printf("\nVoici les personnes qui ont déposé plainte:\n");
                        console.printf("%s%n", person.toString());
                    }
                    break;

                case "delete":
                    console.printf("Entrez le numéro de plainte à supprimer: ");
                    num = Integer.parseInt(console.readLine());
                    Person toRemove = null;
                    for (Person person : persons) {
                        if (person.num == num) {
                            toRemove = person;
                            break;
                        }
                    }
                    if (toRemove != null) {
                        persons.remove(toRemove);
                        console.printf("La plainte avec le numéro %d à été supprimée.\n", num);
                    } else {
                        console.printf("Num invalide. Personne avec le num %d introuvable.\n", num);
                    }
                    break;

                case "quit":
                    return;

                default:
                    console.printf("Commande non reconnue. Veuillez entrer add, get, delete ou quit.%n");
            }
        }
    }
}
