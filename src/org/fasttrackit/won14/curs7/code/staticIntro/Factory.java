package org.fasttrackit.won14.curs7.code.staticIntro;

import java.util.Random;

public class Factory {
    public static void main(String[] args) {
        Audi[] cars = new Audi[10];
        Random random = new Random();

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Audi(random.nextInt(500), random.nextInt(10));
        }

        for (Audi car : cars) {
            System.out.println(car);
        }

        Audi extraCar = new Audi(0,0);
        System.out.println(extraCar);
        System.out.println(Audi.getCreatedAudiCars());

        Audi.soldCars(12);
        System.out.println(Audi.getSoldCars());
        System.out.println(Audi.getAvailableAudiCars());

        System.out.println(StringUtils.replaceAndReverse(Audi.getName(), "u", "4"));

    }
}
