package N3Ex1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class UserTest {

    @Test
    public void testSameObject(){
        User user1 = new User("Pepito");
        User user2 = new User("Pepito");

        assertThat(user1.getName()).isEqualTo(user2.getName());
    }

    @Test
    public void testNotTheSameObject() {
        User user1 = new User("Pepito");
        User user2 = new User("Grillo");

        assertThat(user1.getName()).isNotEqualTo(user2.getName());
    }


}