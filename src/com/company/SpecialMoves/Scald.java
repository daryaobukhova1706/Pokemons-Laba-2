package com.company.SpecialMoves;

import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove {
    public Scald(){
        super (Type.WATER, 80,100);
    }


    @Override
    protected String describe() {
        return "Использует Scald";
    }
}
