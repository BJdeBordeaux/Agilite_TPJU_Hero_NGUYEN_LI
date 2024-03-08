package hero;

import java.util.ArrayList;
public class Hero {
    private int puissance;
    private String nom;
    private ArrayList<Pistol> pistols = new ArrayList<Pistol>();

    public Hero() {
        // initialise instance variables
        puissance = 0;
        nom = "hero.Hero";
    }
    public Hero(String nom, int puissance) {
        this.nom = nom;
        this.puissance = puissance;
    }

    public int ajouterPuissance(int y) {
        this.puissance += y;
        return this.puissance;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int newPuissance) {
        this.puissance = newPuissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String newNom) {
        this.nom = newNom;
    }

    public void ajouterPistol(Pistol pistol) {

        // désarmer le propriétaire du pistol
        Hero proprietaire = pistol.getHero();
        if (proprietaire != null) {
            proprietaire.retirerPistol(pistol);
            pistol.setHero(null);
        }

        // armer cet héro
        this.pistols.add(pistol);
        pistol.setHero(this);
    }

    public Pistol retirerPistol(Pistol pistol) {
        // si ce pistol est dans la liste des pistol de cet héro
        // on va le retirer
        if (pistols.contains(pistol)) {
            pistols.remove(pistol);
            return pistol;
        }

        // sinon, on ne fait rien
        return null;
    }

    public ArrayList<Pistol> getPistols() {
        return this.pistols;
    }

    public int puissanceTotal() {
        int puissanceTotal = this.puissance;

        for (Pistol pistol : this.pistols) {
            puissanceTotal += pistol.getPuissance();
        }

        return puissanceTotal;
    }
}
