package N1Ex1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MonthsTest {

    static private List<String> monthsList;

    @BeforeAll
    public static void prepareTests(){
        Months months = new Months();
        monthsList = months.getMonths();
    }

    @Test
    public void sizeListTest() {
        assertEquals(12, monthsList.size());
    }

    @Test
    public void listNotNullTest() {
        assertNotNull(monthsList);
    }

    @Test
    public void AugustTest() {
        assertEquals("August", monthsList.get(7));
    }


}