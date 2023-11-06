package org.fasttrackit.won14.curs7.homework;

import org.fasttrackit.won14.curs7.homework.model.Bottle;

public class BottleMain {
    public static void main(String[] args) {
        Bottle bottle = new Bottle(100,50);
        System.out.println(bottle.getAvailableLiquid());
        bottle.drink(20);
        bottle.openTheBottle();
        bottle.drink(20);
        System.out.println(bottle.getAvailableLiquid());
        bottle.closeTheBottle();
    }
}
