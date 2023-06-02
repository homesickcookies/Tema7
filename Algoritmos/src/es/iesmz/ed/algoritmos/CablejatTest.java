package es.iesmz.ed.algoritmos;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CablejatTest {
    @ParameterizedTest
    @CsvSource({
            "'HH', false",
            "'MM', false",
            "'MH', true",
            "'HM', true",

            "'HH HH', false",
            "'HH MM', true",
            "'MH MM MH MH', false",
            "'HM HM HM HM HM', true",

            "'HH MM HH HM MH MH MH HH', false"
    })

    void cablejatTest(boolean expectedOutput, String input) {
        String[] inputArray = input.split(" ");
        Cablejat Cables = new Cablejat(inputArray);

        boolean realOutput = Cables.esPotConnectar();

        assertEquals(expectedOutput, realOutput);
    }
}