package com.company.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

public class SteelWing extends PhysicalMove{
    public SteelWing(){
        super (Type.STEEL, 70, 90);
    }


    @Override
    protected String describe() {
        return "Использует SteelWing";
    }
}
