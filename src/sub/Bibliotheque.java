package sub;

import java.util.ArrayList;
import java.util.Scanner;

public class Bibliotheque {
    ArrayList<Livre> livres = new ArrayList<Livre>(); // liste pour stocker objet livre

    Scanner scanner = new Scanner(System.in); // creer objet scanner pour obtenir output

    // methode pour ajouter le livre a le liste
    public void ajouterLivre() {
        
        System.out.print("Titre : ");
        String titre = scanner.nextLine();
        System.out.print("Auteur : ");
        String auteur = scanner.nextLine();
        Livre nouveauLivre = new Livre();
        nouveauLivre.setAll(titre, auteur, livres.size());
        livres.add(nouveauLivre);
        System.out.println("Livre ajouté avec succès ! ");


    }
    // methode pour afficher les livres disponibles( les livres a le variable statut true)
    public void LivreDisponible(){
        System.out.println("Livers disponibles ");
        for (Livre livre : livres) {
            if (livre.getStatut()) { // verifer si le variable statut est true
                System.out.println("-[ID: " + livre.getID()  + "] " + livre.getTitre() +  " - " + livre.getAuteur());
            }
        }
    }

    // methode pour changer la variable statut de variable de true à false
    public void EmprunterLivre(){
        boolean run = true;
        do { // pour repter l'iteration jusqu'a l'utilisateur entrer une valuer correcte
            try{ // c'est pour verifier que l'utilisateur entrer une valuer correcte
                System.out.print("ID du livre à emprunter : ");
                int ID = scanner.nextInt();
                for (Livre livre : livres) {
                    if (livre.getID() ==  ID ) { // verifer si livre est trouve
        
                        if (livre.getStatut()){ // verifier si livre est diponible
                            livre.empunter();
                            System.out.println("Livre emprunté avec succès !");
                            return ;
                        } else {
                            System.out.println("Ce livre déjà pris");
                            return ;
                        }
        
                    }   
                }
                System.out.println("Ce livre n'est pas dans la bibliotheque"); 
                run = false;

            } catch(Exception e) {
                System.out.println("Enter un nombre");
                scanner.nextLine(); // ajouter pour supprimer l'ancien valeur

            }
        } while(run) ;
        
           
    }


    // methode pour changer la variable statut de variable de false à true 
    public void RetournerLivre(){
        boolean run = true;
        do { // pour repter l'iteration jusqu'a l'utilisateur entrer une valuer correcte
            try{ // c'est pour verifier que l'utilisateur entrer une valuer correcte
        System.out.print("ID du livre à retourner : ");
        int ID = scanner.nextInt();
        for (Livre livre : livres) {
            if (livre.getID() ==  ID ) { // verifer si livre est trouve

                if (!livre.getStatut()){ // verifier si livre est diponible
                    livre.retouner();
                    System.out.println("Livre retourné avec succès ! ");
                    return ;
                } else {
                    System.out.println("Ce livre est deja retourneé");
                    return ;
                }

            }   
        }
        System.out.println("Ce livre n'est pas dans la bibliotheque");
        run = false;

            } catch(Exception e) {
                System.out.println("Enter un nombre");
                scanner.nextLine(); // ajouter pour supprimer l'ancien valeur

            }
        } while(run) ;    
        
    }


  
    
}

