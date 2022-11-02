package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.chocolate.ChocolateBags;

public class MirrorTest
{
    @ParameterizedTest(name = "({0}) = ({1})")
    @CsvSource({
            // The total is higher than the amount of small and big bars.
            "'AAAA', 'AAAA'", "'abWXYZba', 'ab'", "'abaWXYZaba', 'aba'",
            // No need for small bars.
            "'abca','a'", "'abcda','a'", "'abcdea','a'",
            // Need for big and small bars.
            "'aba','aba'", "'abba','abba'", "'abcba','abcba'"
    })
    public void testmirror(String string, String expectedResult)
    {
        String result = new Mirror().mirrorEnds(string);
        Assertions.assertEquals(expectedResult, result);
    }

}
