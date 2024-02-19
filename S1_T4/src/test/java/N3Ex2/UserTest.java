package N3Ex2;

import N3Ex1.User;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {

    @Test
    public void testSameObject(){
        User user1 = new User("Pepito");
        User user2 = new User("Pepito");

        assertThat(user1).isSameAs(user2);
    }

    @Test
    public void testNotTheSameObject() {
        User user1 = new User("Pepito");
        User user2 = new User("Grillo");

        assertThat(user1).isNotSameAs(user2);
    }



}