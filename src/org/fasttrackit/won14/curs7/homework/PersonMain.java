package org.fasttrackit.won14.curs7.homework;

import org.fasttrackit.won14.curs7.homework.model.Person;

public class PersonMain {
    public static void main(String[] args) {
        Person myPerson = new Person("Mihai",22, false);
        Person myPerson1 = new Person("George",30, true);
        Person myPerson2 = new Person("Ioana",23, false);
        System.out.println(myPerson);
        System.out.println(myPerson1);
        System.out.println(myPerson2);
    }
}
