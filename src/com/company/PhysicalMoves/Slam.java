package com.company.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

public class Slam extends PhysicalMove{
    public Slam(){
        super (Type.NORMAL, 80,75);
    }

    @Override
    protected String describe() {
        return "Использует Slam";
    }

}
