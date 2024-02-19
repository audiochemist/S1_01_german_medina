package N3Ex4;
import N3Ex1.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.assertj.core.api.Assertions.assertThat;

class UserTest {

    private Object number;
    private User user1;
    private ArrayList<Object> objectsArray;
    private String introduction;


    @BeforeEach
    public void settingTest() {
    this.objectsArray = new ArrayList<>();
    this.user1 = new User("Joan");
    this.number = 1;
    this.introduction = "Hello, my name is not Pepito";
    objectsArray.add(this.user1);
    objectsArray.add(this.number);
    objectsArray.add(this.introduction);
}

    @Test
    public void testOrderObjects() {
        assertThat(objectsArray).containsSequence(user1,number,introduction);
    }

    @Test
    public void testContentObjects() {
        assertThat(objectsArray).containsExactlyInAnyOrder(user1,number,introduction);

    }

    @Test
    public void testNumberContentObjects(){
        assertThat(objectsArray).containsOnlyOnce(user1, 1);

        objectsArray.remove(2);
        assertThat(objectsArray).doesNotContain(introduction, 2);

    }


}