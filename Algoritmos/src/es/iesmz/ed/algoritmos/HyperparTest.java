package es.iesmz.ed.algoritmos;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class HyperparTest {
    @ParameterizedTest
    @CsvSource({
            "1234,false",
            "22222,true",
            "0,false"
    })

    void hyperpar(long input, boolean resultadoEsperado) {
        boolean resultadoReal = Hyperpar.hyperpar(input);
        assertEquals(resultadoEsperado, resultadoReal);
    }
}