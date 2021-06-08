package StrategyDesignPattern;

import java.sql.SQLOutput;

public class MuteDuck extends Duck{
    public MuteDuck(){

    }

    @Override
    void display() {
        System.out.println("I am a mute Duck");
    }
}
