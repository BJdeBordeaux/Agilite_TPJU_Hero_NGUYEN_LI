package hero;

import interfaces.SpecialWeapon;
import interfaces.AttackStrategy;

import java.util.ArrayList;
import java.util.List;

public class SpecialHero extends Hero {
    private AttackStrategy attackStrategy;

    private List<SpecialWeapon> specialWeapons;

    public SpecialHero(String nom, int strength) {
        super(nom, strength);
        specialWeapons = new ArrayList<>();
    }

    public AttackStrategy getAttackStrategy() {
        return attackStrategy;
    }

    public List<SpecialWeapon> getSpecialWeapons() {
        return specialWeapons;
    }

    public void setSpecialWeapons(List<SpecialWeapon> specialWeapons) {
        this.specialWeapons = specialWeapons;
    }


    public int attack() {
        return attackStrategy.attack(this, specialWeapons);
    }
    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }
    public void addWeapons(SpecialWeapon specialweapon) {
        if (specialweapon instanceof Pistol) {
            this.addPistol((Pistol) specialweapon);
        }
        else{
            specialWeapons.add(specialweapon);
        }
    }
}
