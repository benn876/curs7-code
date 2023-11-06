package org.fasttrackit.won14.curs7.code.interface2;

public class Main {
    public static void main(String[] args) {
        SomeAlgorithm someAlgorithm = new SomeAlgorithm(new HardCodedProvider());
        someAlgorithm.getStringsBiggerThan(2);

        SomeAlgorithm anotherAlgorithm = new SomeAlgorithm(new ScannerProvider(5));
        anotherAlgorithm.getStringsBiggerThan(5);
    }
}
