package com.company.ClassesPokemons;

import com.company.StatusMoves.*;
import ru.ifmo.se.pokemon.*;

public class Buizel extends Pokemon{
    public Buizel (String name, int level){
        super (name,level);
        this.setType(Type.WATER);
        this.setStats(10,90,100,30,40,50);
        this.setMove(new Swagger(), new Agility(), new DoubleTeam());
    }
}



