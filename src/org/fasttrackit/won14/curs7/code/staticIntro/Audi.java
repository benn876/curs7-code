package org.fasttrackit.won14.curs7.code.staticIntro;

public class Audi {
    private static String name = "Audi";
    private static Integer createdAudiCars = 0;
    private static Integer availableAudiCars = 0;
    private static Integer soldCars = 0;
    private Integer horsePower;
    private Integer odometer;

    public Audi(Integer horsePower, Integer odometer) {
        this.horsePower = horsePower;
        this.odometer = odometer;
        createdAudiCars++;
        availableAudiCars++;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public Integer getOdometer() {
        return odometer;
    }

    public static Integer getCreatedAudiCars() {
        return createdAudiCars;
    }

    public static void soldCars(Integer carsToSell) {
        if (carsToSell > availableAudiCars) {
            System.out.println("There are not enough cars");
        } else {
            soldCars = soldCars + carsToSell;
            availableAudiCars = availableAudiCars - carsToSell;
        }
    }

    public static Integer getAvailableAudiCars() {
        return availableAudiCars;
    }

    public static Integer getSoldCars() {
        return soldCars;
    }

    public static String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Audi: horsePower:%s, odometer:%s, name:%s".formatted(horsePower, odometer, name);
    }
}
