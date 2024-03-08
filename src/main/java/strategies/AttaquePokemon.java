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
                List<Attack> listAttack = ((Pokemon) armeSpecial).getAttacks();
                for (Attack attack : listAttack) {
                    counter += attack.getDamage();
                }
            }
        }
        return counter;
    }
}
