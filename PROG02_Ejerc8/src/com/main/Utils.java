package com.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public final class Utils {
    public static int readIntegerFromStdin(String text) {
        boolean inputError;
        int integerFromStdin = 0;
        String stringFromStdin;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(text);
        do {
            inputError = false;
            try {
                stringFromStdin = br.readLine();
                integerFromStdin = Integer.parseInt(stringFromStdin);
            }
            catch(Exception e) {
                System.out.println("Error: no se ha introducido un número entero válido, vuelva a intentarlo:");
                inputError = true;
            }
        } while (inputError);
        return integerFromStdin;
    }
}
