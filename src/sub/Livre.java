package sub;

public class Livre {
    private String titre;
    private String auteur;
    private int ID;
    private boolean statut;

    public String getTitre() { // pour obtenir titre
        return titre;
    }

    public String getAuteur() { // pour obtenir nom d'auteur
        return auteur;
    }

    public int getID() { // pour obtenir id de livre
        return ID;

    }

    public boolean getStatut() { // pour obtenir le disponibilte de livre
        return statut;
    }

    public void setAll(String titre, String auteur,int ID) { // pour definir le variable à la place d'utlise le constructor
        this.titre = titre;
        this.auteur = auteur;
        this.ID= ID;
        this.statut = true; // Livre disponible par defaut
    }

    public void empunter() { // pour changer statut a false
        this.statut = false;
    }

    public void retouner() { // pour changer statut a true
        this.statut =  true;
    }


}
