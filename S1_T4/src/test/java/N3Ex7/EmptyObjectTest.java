package N3Ex7;

import org.junit.jupiter.api.Test;
import java.util.Optional;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class EmptyObjectTest {

    @Test
    public void emptyObjectTest() {
        Optional<Object> optionalObject = Optional.empty();
        assertThat(optionalObject).isEmpty();
    }
}
