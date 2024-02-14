package N2Ex1;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CompareStringTest {

        @Test
        public void lengthOfString() {
            MatcherAssert.assertThat("mordor", lengthOfString(is(10)));         }

        // Crear el Matcher personalizado
        public static Matcher<String> lengthOfString(Matcher<? super Integer> matcher) {
            return new FeatureMatcher<String, Integer>(matcher, "The length of this String: ", "length") {

                @Override
                protected Integer featureValueOf(String stringtoBeTested) {

                    return stringtoBeTested.length();
                }
            };
        }

}