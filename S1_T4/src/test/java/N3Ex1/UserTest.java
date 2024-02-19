package N3Ex1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class UserTest {

    @Test
    public void testSameObject(){
        User user1 = new User("Pepito");
        User user2 = new User("Pepito");
        User user3 = new User("Juan");


        assertThat(user1).usingRecursiveComparison().isEqualTo(user2);
        assertThat(user1).usingRecursiveComparison().isNotEqualTo(user3);

    }



}