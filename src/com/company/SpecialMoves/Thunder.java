package com.company.SpecialMoves;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
    public Thunder(){
        super (Type.ELECTRIC, 120, 70);
    }





    @Override
    protected String describe() {
        return "Использует Thunder";
    }
}
