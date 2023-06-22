package org.example;
import Package1.Adress;
import Package2.Person;
/**
 * Test class for demonstrating the usage of Person and Address classes.
 */

public class Test {
    public static void main(String[] args) {
        Person A = new Person("Johny Smith", 26, "m");
        System.out.println(A);
        Adress B = new Adress("Warsaw","Rose" , 15);
        System.out.println(B);

        Person.Info();
        Adress.Info();
    }
}