package strategies;

import hero.Hero;
import hero.Pistol;
import interfaces.ArmeSpecial;
import interfaces.AttaqueStategie;

import java.util.List;

public class AttaquePistol implements AttaqueStategie {
    @Override
    public int attaque(Hero hero, List<ArmeSpecial> armeSpecials) {
        int counter = hero.getPuissance();
        for (Pistol pistol : hero.getPistols()) {
            counter+= pistol.getPuissance();
        }
        return counter;
    }
}
