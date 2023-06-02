package es.iesmz.ed.algoritmos;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SumaDescendentTest {
    @ParameterizedTest
    @CsvSource({
            "12345, 15085",
            "12, 14",
            "5423, 5872",
            "987654, 1083674",
            "0, -1",
            "1234147234,1506790910",
            "-1234123, -1"
    })

    void SumaDescendent(long input, long resultadoEsperado) {
        long resultadoReal = SumaDescendent.sumaDescendent(input);
        assertEquals(resultadoEsperado, resultadoReal);
    }
}