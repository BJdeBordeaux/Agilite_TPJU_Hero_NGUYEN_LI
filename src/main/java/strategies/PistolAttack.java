package strategies;

import hero.Hero;
import interfaces.SpecialWeapon;
import interfaces.AttackStrategy;

import java.util.List;

public final class PistolAttack implements AttackStrategy {
    private static PistolAttack instance;
    @Override
    public int attack(Hero hero, List<SpecialWeapon> specialWeapons) {
        return hero.totalStrength();
    }
    public static PistolAttack getInstance() {
        if (instance == null) {
            instance = new PistolAttack();
        }
        return instance;
    }
}
