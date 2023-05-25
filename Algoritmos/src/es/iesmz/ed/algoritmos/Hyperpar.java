package es.iesmz.ed.algoritmos;

import java.util.ArrayList;

public class Hyperpar {
    public static boolean hyperpar(long number) {
        if (number <= 0 || number % 2 != 0) {
            return false;
        }

        int digit, suma = 0;
        String numberStr = String.valueOf(number);
        for (int i = 0; i < numberStr.length(); i++) {
            digit = Integer.parseInt(numberStr.substring(i, i + 1));

            if (digit % 2 != 0) {
                return false;
            }

            suma += digit;

        }

        if (suma % 2 != 0) {
            return false;
        }

        return true;
    }
}
