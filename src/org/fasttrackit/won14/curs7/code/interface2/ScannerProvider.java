package org.fasttrackit.won14.curs7.code.interface2;

import java.util.Scanner;

public class ScannerProvider implements DataProvider {
    private Integer length;

    public ScannerProvider(Integer length) {
        this.length = length;
    }

    @Override
    public String[] provideData() {
        Scanner scanner = new Scanner(System.in);
        String[] result = new String[length];
        for(int i =0; i < length; i++){
            String input = scanner.next();
            result[i] = input;
        }
        return result;
    }
}
