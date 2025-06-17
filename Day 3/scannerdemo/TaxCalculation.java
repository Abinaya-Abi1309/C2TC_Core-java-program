//Program to demonstrate encapsulation
package com.tnsif.daythree.scannerdemo;

public class TaxCalculation {
    // function to calculate tax
    public void calculateTAX(Person person) {
        if (person.getAGE() > 65 || person.getGENDER().equalsIgnoreCase("female")) {
            person.setTAX(0);
            System.out.println("Tax not applicable");
        } else {
            if (person.getINCOME() <= 160000) {
                person.setTAX(0);
            } else if (person.getINCOME() > 160000 && person.getINCOME() <= 500000) {
                person.setTAX((person.getINCOME() - 160000) * 10 / 100);
            } else if (person.getINCOME() >= 500000 && person.getINCOME() <= 800000) {
                person.setTAX((person.getINCOME() - 500000) * 20 / 100 + 34000);
            } else {
                person.setTAX((person.getINCOME() - 800000) * 30 / 100 + 94000);
            }
        }
    }
}