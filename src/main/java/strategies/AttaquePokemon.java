package strategies;

import hero.Hero;
import interfaces.ArmeSpecial;
import interfaces.AttaqueStategie;
import pokemon.Attack;
import pokemon.Pokemon;

import java.util.List;

public class AttaquePokemon implements AttaqueStategie {
    @Override
    public int attaque(Hero hero, List<ArmeSpecial> armeSpecials) {
        int counter = hero.getPuissance();
        for (ArmeSpecial armeSpecial : armeSpecials) {
            if (armeSpecial instanceof Pokemon) {
                counter+=((Pokemon) armeSpecial).getPuissance();
            }
        }
        return counter;
    }
}
