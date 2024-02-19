package N1Ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutOfBoundsExceptionTest {

    @Test
    public void outOfBoundsExceptionTest() {
        //Aquí estamos utilizando lambdas para referirnos al metodo de nuestra clase "ClassThrowingOutOfBoundsException"
        assertThrows(ArrayIndexOutOfBoundsException.class, ClassThrowingOutOfBoundsException::outOfBoundsExceptionMethod);

        }



    }
