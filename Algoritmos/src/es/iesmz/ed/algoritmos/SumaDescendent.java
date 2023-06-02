package es.iesmz.ed.algoritmos;

/**
 * @Author: Daniel Pantoja Cedeño
 * @Version: 1.0
 */
public class SumaDescendent {
    /**
     *
     * @param digit El número que va a usarse en el algoritmo
     * @return El resultado del algoritmo
     */
    public static long sumaDescendent(long digit) {
//        devuelve -1 si el numero es 0 o negativo
        if (digit <= 0) {
            return -1;
        }

//        declaración de las variables de uso
        String digitStr = String.valueOf(digit);
        long sumaDesc = 0;

//        el bucle recorre toda la cadena y suma cada carácter convertido en numero en sumaDesc
        for (int i = 0; i < digitStr.length(); i++) {
            sumaDesc += Character.getNumericValue(digitStr.charAt(i));
        }
//        devuelve el sumatorio
        return sumaDesc;
    }
}
