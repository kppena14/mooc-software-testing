package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    @ParameterizedTest(name = "{0}: ({1}) = {2}")
    @CsvSource({"'TwoG', 'xxggxx', true", "'OneG', 'xxgxx', false", "'ThreeGs', 'xxggyygxx', false",
            "'OneG', 'g', false", "'TwoGs', 'gg', true" })
    public void test(String partition, String pattern, boolean expectedResult){
        boolean result = new GHappy().gHappy(pattern);
        Assertions.assertEquals(expectedResult, result);
    }

}
