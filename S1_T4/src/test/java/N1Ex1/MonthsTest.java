package N1Ex1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MonthsTest {

    @Test
    public void sizeListTest() {
        Months months = new Months();
        List<String> monthsList = months.getMonths();
        assertEquals(12, monthsList.size());

    }

@Test
    public void listNotNullTest() {
        Months months = new Months();
        List<String> monthsList = months.getMonths();
        assertNotNull(monthsList);
    }

    @Test
    public void AugustTest() {
        Months months = new Months();
        List<String> monthsList = months.getMonths();
        assertEquals("August", monthsList.get(7));


    }


}