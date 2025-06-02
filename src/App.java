
// Project: gestion Bibliotheque
import java.util.Scanner;
import java.util.ArrayList;

import sub.Livre;
import sub.Bibliotheque;









public class App {
    public static void main(String[] args) throws Exception {
        Bibliotheque bib = new Bibliotheque();
        Scanner scanner = new Scanner(System.in);

        boolean running = true; // variable responsable à l'exécution de programme

        System.out.println("1. Ajouter un livre\r\n" + 
                        "2. Lister les livres disponibles\r\n" + 
                        "3. Emprunter un livre\r\n" + 
                        "4. Retourner un livre\r\n" +
                        "5. Quitter \n");
        while (running) {
            boolean run = true;
        do { // pour repter l'iteration jusqu'a l'utilisateur entrer une valuer correcte
            try{ // c'est pour verifier que l'utilisateur entrer une valuer correcte
            System.out.print("Votre choix : ");
            int choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    bib.ajouterLivre();
                    System.out.println("\n");
                    break;
                case 2:
                    bib.LivreDisponible();
                    System.out.println("\n");
                    break;
                case 3:
                    bib.EmprunterLivre();
                    System.out.println("\n");
                    break;

                case 4:
                    bib.RetournerLivre();
                    System.out.println("\n");
                    break;
                case 5:
                    running =  false;
                    System.out.println("Merci pour utliser notre bibliotheque!\n");
                    break;
                default:
                    System.out.println("Ce choix n'est pas disponinble");
                    System.out.println("\n");
                    break;
            }
            run = false;

            } catch(Exception e) {
                System.out.println("Enter un nombre");
                System.out.println("\n");
                scanner.nextLine(); // ajouter pour supprimer l'ancien valeur

            }
        } while(run) ;

        }
    }
}
