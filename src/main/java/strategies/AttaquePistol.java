package strategies;

import hero.Hero;
import hero.Pistol;
import interfaces.ArmeSpecial;
import interfaces.AttaqueStategie;

import java.util.List;

public final class AttaquePistol implements AttaqueStategie {
    private static AttaquePistol instance;
    @Override
    public int attaque(Hero hero, List<ArmeSpecial> armeSpecials) {
        return hero.puissanceTotal();
    }
    public static AttaquePistol getInstance() {
        if (instance == null) {
            instance = new AttaquePistol();
        }
        return instance;
    }
}
