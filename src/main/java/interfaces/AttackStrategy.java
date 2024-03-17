package interfaces;

import hero.Hero;

import java.util.List;

public interface AttackStrategy {
    int attack(Hero hero, List<SpecialWeapon> specialWeapons);
}
