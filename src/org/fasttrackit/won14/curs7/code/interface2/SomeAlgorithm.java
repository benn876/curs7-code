package org.fasttrackit.won14.curs7.code.interface2;

public class SomeAlgorithm {
    private DataProvider dataProvider;

    public SomeAlgorithm(DataProvider dataProvider){
        this.dataProvider = dataProvider;
    }
    public void getStringsBiggerThan(Integer biggerThen){
        for(String string : dataProvider.provideData()){
            if(string.length() > biggerThen){
                System.out.println(string);
            }
        }
    }
}
