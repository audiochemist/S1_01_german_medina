package N3Ex6;

import N1Ex3.OutOfBoundsException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
public class OutOfBoundsTest {

    @Test
    public void outOfBoundsExceptionTest() {
        try {
            OutOfBoundsException.outOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            Assertions.assertThat(e).isInstanceOf(ArrayIndexOutOfBoundsException.class);
        }
    }
}
