package org.fasttrackit.won14.curs7.homework.model;

public class Bottle {
    private Integer totalCapacity;
    private Integer availableLiquid;
    private Boolean open = false;

    public Bottle(Integer totalCapacity, Integer availableLiquid) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
    }

    public Boolean spills() {
        return availableLiquid > totalCapacity;
    }

    public Integer getAvailableLiquid() {
        return availableLiquid;
    }

    public Integer getEmptyCapacity() {
        return totalCapacity - availableLiquid;
    }

    public void openTheBottle() {
        if (this.open) {
            System.out.println("Bottle is already opened");
        } else {
            this.open = true;
            System.out.println("Bottle is opened");
        }
    }

    public void closeTheBottle() {
        if (this.open) {
            this.open = false;
            System.out.println("Bottle is closed");
        } else {
            System.out.println("Bottle is already closed");
        }
    }

    public void drink(Integer amountToDrink) {
        if (this.open) {
            if (this.availableLiquid < amountToDrink) {
                System.out.println("Not enough liquid to drink");
            } else {
                this.availableLiquid = this.availableLiquid - amountToDrink;
            }
        } else {
            System.out.println("Bottle is closed. Please open it and then drink");
        }
    }
}
