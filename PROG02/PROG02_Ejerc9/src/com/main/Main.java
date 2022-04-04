package com.main;

public class Main {
    public static void main(String[] args) {
        final int MIN_YEAR = 1582;
        int year = 0;
        do {
            year = Utils.readIntegerFromStdin("Introduzca el año (debe ser mayor o igual que " + MIN_YEAR + "):");
        } while (year < MIN_YEAR);

        boolean isDivisibleByFour = (year % 4 == 0) ? true : false;
        boolean isDivisibleByOneHundred = (year % 100 == 0) ? true : false;
        boolean isDivisibleByFourHundred = (year % 400 == 0) ? true : false;

        if (!isDivisibleByFour) {
            System.out.printf("Año %d: no es bisiesto.\n", year);
        } else if (!isDivisibleByOneHundred) {
            System.out.printf("Año %d: sí es bisiesto.\n", year);
        } else if (!isDivisibleByFourHundred) {
            System.out.printf("Año %d: no es bisiesto.\n", year);
        } else {
            System.out.printf("Año %d: sí es bisiesto.\n", year);
        }
    }
}
