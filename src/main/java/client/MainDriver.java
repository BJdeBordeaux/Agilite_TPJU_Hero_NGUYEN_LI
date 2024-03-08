package client;

import hero.Pistol;
import hero.SpecialHero;
import interfaces.AttaqueStategie;
import pokemon.Pokemon;
import strategies.AttaquePistol;
import strategies.AttaquePokemon;

public class MainDriver {
    public static void main(String[] args) {
        System.out.println("Hello World");
        // Initialize
        SpecialHero hero = new SpecialHero("Superman", 100);
        Pokemon pikachu = new Pokemon();
        Pistol pistol = new Pistol(50);

        // Ajouter des armes
        hero.ajouterArmes(pikachu);
        hero.ajouterPistol(pistol);

        // Attaque avec Pistol
        hero.setAttaqueStategie(AttaquePistol.getInstance());
        System.out.println(hero.attaque()); // 110

        // Ajouter une arme
        hero.setAttaqueStategie(AttaquePokemon.getInstance());
        System.out.println(hero.attaque()); // 110
    }
}
