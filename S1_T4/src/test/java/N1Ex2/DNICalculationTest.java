package N1Ex2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DNICalculationTest {

@ParameterizedTest
@CsvSource ({"38746445, U", "54061505, M", "32346445, U", "38746123, U", "32146445, U", "38476445, U", "12546445, U",
        "98546445, U", "39876445, U", "11146445, U", "12344556, U"})

    public void DNICalculationLetterTest(int dni, char letter) {
    //Esta es la linea que obtiene el correcto dni numeros + letra, de nuestro metodo, que ha de ser testeado:
    //introducimos solo el numero de nuestro csvSource
    String dniCalculated = DNICalculation.calculateDNILetter(dni);

    //aqui obtenemos la letra solo de la que obtenemos por string del metodo a testear (esta en la posicion 9)
    char letterCalculated = dniCalculated.charAt(9);

    //las comparamos
    assertEquals(letter, letterCalculated);
}


    }



