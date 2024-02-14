package N1Ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutOfBoundsExceptionTest {

    @Test
    public void outOfBoundsExceptionTest() {

        assertThrows(ArrayIndexOutOfBoundsException.class, OutOfBoundsException::outOfBoundsException);

        }



    }
