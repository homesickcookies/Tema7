package es.iesmz.ed.algoritmos;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class HyperparTest {
    @ParameterizedTest
    @CsvSource({
            "1234,false",
            "22222,true",
            "0,false",
            "2,true",
            "444,true",
            "200,true",
            "888888,true",
            "24680,true",
            "13579,false",
            "111111,false",
            "987654,false",
            "100000,false",
            "7777777,false",
            "123456789,false",
            "666666,true",
            "222,true",
            "800,true",
            "555,false",
            "2222,true",
            "44444,true",
            "123,false",
            "9999,false",
            "246,true",
            "111,false",
            "202020,true",
            "56789,false",
            "33333,false",
            "400,true",
            "666,true",
            "1001,false",
            "7777,false",
            "26664440,true",
            "888,true",
            "333,false",
            "1111,false",
            "24681357,false",
            "2222222,true",
            "777777,false",
            "101,false",
            "8888888,true",
            "121,false",
            "4444,true",
            "500,false",
            "999999,false",
            "11111,false",
            "222222,true",
            "999,false",
            "135,false",
            "86420,true",
            "4444444,true",
            "369,false",
            "1010101,false",
            "12345678,false"
    })

    void hyperpar(long input, boolean resultadoEsperado) {
        boolean resultadoReal = Hyperpar.hyperpar(input);
        assertEquals(resultadoEsperado, resultadoReal);
    }
}