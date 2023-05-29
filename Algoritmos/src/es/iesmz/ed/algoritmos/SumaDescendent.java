package es.iesmz.ed.algoritmos;

public class SumaDescendent {
    public static int sumaDescendent(int digit) {
        int digit = 123;

        String digitStr = String.valueOf(digit);
        int sumaDesc = 0;

        for (int i = 0; i < digitStr.length(); i++) {
            sumaDesc += Integer.parseInt(digitStr.substring(i));
        }
        System.out.println(sumaDesc);
}
