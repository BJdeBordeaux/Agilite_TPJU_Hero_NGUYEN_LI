package interfaces;

import hero.Hero;

import java.util.List;

public interface AttaqueStategie {
    public int attaque(Hero hero, List<ArmeSpecial> armeSpecials);
}
