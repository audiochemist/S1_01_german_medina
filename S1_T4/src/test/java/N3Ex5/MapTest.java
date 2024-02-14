package N3Ex5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

public class MapTest {

    HashMap<Integer, String> userMap;

    @BeforeEach
    public void setTestUp () {
        userMap = new HashMap<Integer, String>();
        userMap.put(1, "Pepito");
        userMap.put(2, "Grillo");
    }

    @Test
    public void arrayListAssertionTest() {

        assertThat(userMap).containsKey(1);

    }




}
