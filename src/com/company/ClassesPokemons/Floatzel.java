package com.company.ClassesPokemons;

import com.company.PhysicalMoves.*;
import ru.ifmo.se.pokemon.*;

public class Floatzel extends Buizel{
    public Floatzel (String name, int level) {
        super(name, level);
        this.setType(Type.WATER);
        this.setStats(15, 80, 80, 60, 70, 65);
        this.addMove(new Slam());
    }
}

