package N3Ex6;

import N1Ex3.ClassThrowingOutOfBoundsException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OutOfBoundsTest {

    @Test
    public void outOfBoundsExceptionTest() {
        Assertions.assertThatThrownBy(ClassThrowingOutOfBoundsException::outOfBoundsExceptionMethod)
                .isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }
}
