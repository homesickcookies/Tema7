package es.iesmz.ed.algoritmos;

public class Hyperpar {
    public static boolean hyperpar(long number) {
        if (number <= 0 || number % 2 != 0) {
            return false;
        }

        int digitsum = 0;
        String numberStr = String.valueOf(number);

        for (char digitChar : numberStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);

            if (digit % 2 != 0) {
                return false;
            }

            digitsum += digit;
        }

        return digitsum % 2 == 0;
    }
}
