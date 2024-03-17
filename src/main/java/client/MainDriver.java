package client;

import hero.Pistol;
import hero.SpecialHero;
import pokemon.Pokemon;
import strategies.PistolAttack;
import strategies.PokemonAttack;

public class MainDriver {
    public static void main(String[] args) {
        System.out.println("Hello World");
        // Initialize
        SpecialHero hero = new SpecialHero("Superman", 100);
        Pokemon pikachu = new Pokemon();
        Pistol pistol = new Pistol(50);

        // Ajouter des armes
        hero.addWeapons(pikachu);
        hero.addPistol(pistol);

        // Attaque avec Pistol
        hero.setAttackStrategy(PistolAttack.getInstance());
        System.out.println(hero.attack()); // 110

        // Ajouter une arme
        hero.setAttackStrategy(PokemonAttack.getInstance());
        System.out.println(hero.attack()); // 110
    }
}
