package hero;

import interfaces.ArmeSpecial;
import interfaces.AttaqueStategie;

import java.util.ArrayList;
import java.util.List;

public class SpecialHero extends Hero {
    private AttaqueStategie attaqueStategie;
    private List<ArmeSpecial> listArmeSpecials =  new ArrayList();
    public SpecialHero(String nom, int puissance) {
        super(nom, puissance);
    }
    public int attaque() {
        return attaqueStategie.attaque(this, listArmeSpecials);
    }
    public void setAttaqueStategie(AttaqueStategie attaqueStategie) {
        this.attaqueStategie = attaqueStategie;
    }
    public void ajouterArmes(ArmeSpecial armeSpecial) {
        if (armeSpecial instanceof Pistol) {
            this.ajouterPistol((Pistol) armeSpecial);
        }
        else{
            listArmeSpecials.add(armeSpecial);
        }
    }
}
