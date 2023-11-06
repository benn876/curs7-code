package org.fasttrackit.won14.curs7.code.interface1;

public class KFC implements FoodProvider {
    private static final String NAME_OF_PROVIDER = "KFC";
    private int quantityNeeded;

    public KFC(int quantityNeeded) {
        this.quantityNeeded = quantityNeeded;
    }

    @Override
    public String getName() {
        return NAME_OF_PROVIDER;
    }

    @Override
    public Integer numberOfEmployees() {
        return 0;
    }

    @Override
    public Integer quantityNeededForDelivery() {
        return quantityNeeded;
    }

    @Override
    public void addMoreQuantity(Integer extraQuantity) {
        this.quantityNeeded += extraQuantity;
    }
}
