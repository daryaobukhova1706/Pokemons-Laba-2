package com.company.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

public class TakeDown extends PhysicalMove{
    public TakeDown(){
        super (Type.NORMAL, 90, 85);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.HP, 9);
    }

    @Override
    protected String describe() {
        return "Использует TakeDown";
    }
}

