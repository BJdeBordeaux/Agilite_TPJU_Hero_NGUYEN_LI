package strategies;

import hero.Hero;
import interfaces.SpecialWeapon;
import interfaces.AttackStrategy;
import pokemon.Pokemon;

import java.util.List;

public final class PokemonAttack implements AttackStrategy {
    private static PokemonAttack instance;

    @Override
    public int attack(Hero hero, List<SpecialWeapon> specialWeapons) {
        int counter = hero.getStrength();
        for (SpecialWeapon specialweapon : specialWeapons) {
            if (specialweapon instanceof Pokemon) {
                counter+=((Pokemon) specialweapon).getPower();
            }
        }
        return counter;
    }

    public static PokemonAttack getInstance() {
        if (instance == null) {
            instance = new PokemonAttack();
        }
        return instance;
    }
}
