package N2Ex1;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CompareStringTest {

        @Test
        public void lengthOfString() {
            assertThat("mordor", lengthOfString(is(8)));
        }

        public static Matcher<String> lengthOfString(Matcher<? super Integer> matcher) {
            return new FeatureMatcher<String, Integer>(matcher, "A string of length that", "length") {

                @Override
                protected Integer featureValueOf(String stringToBeTested) {

                    return stringToBeTested.length();
                }
            };
        }

}