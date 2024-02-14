package N3Ex3;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class IntegerArraysTest {

    @Test
    public void testSameArray() {


        int[] array1 = {1, 3, 5};
        int[] array2 = {1, 3, 5};
        assertThat(array1).containsExactly(array2);
    }


}
