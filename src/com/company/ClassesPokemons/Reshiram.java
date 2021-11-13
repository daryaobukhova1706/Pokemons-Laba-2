package com.company.ClassesPokemons;

import com.company.PhysicalMoves.*;
import com.company.StatusMoves.*;
import ru.ifmo.se.pokemon.*;

public class Reshiram extends Pokemon {
    public Reshiram (String name, int level){
        super (name, level);
        this.setType(Type.FIRE);
        this.setStats(25,25,90,40,85,20);
        this.setMove(new AerialAce(), new TakeDown(), new Rest(), new SteelWing());
    }
}
