package com.company;

import com.company.ClassesPokemons.*;
import ru.ifmo.se.pokemon.*;

public class Pokemons {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Reshiram("Freddie", 1);
        Pokemon p2 = new Buizel("PikaJulu", 1);
        Pokemon p3 = new Floatzel("PikaJune", 1);
        Pokemon p4 = new Poliwag("Sheldon", 1);
        Pokemon p5 = new Poliwhirl("Radge", 1);
        Pokemon p6 = new Politoed("Clon", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();

    }
}

