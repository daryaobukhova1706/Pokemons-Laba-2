package com.company.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove{
    public AerialAce(){
        super(Type.FLYING, 60, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        Status enemy = pokemon.getCondition();
        if (enemy.equals(Status.BURN) || enemy.equals(Status.PARALYZE) || enemy.equals(Status.POISON) ){
            pokemon.setMod(Stat.HP,(int) v*2);
        }
        else{
            pokemon.setMod(Stat.HP,(int) v);
        }
    }
    @Override
    protected String describe() {
        return "Использует Aerial Ace";
    }
}
