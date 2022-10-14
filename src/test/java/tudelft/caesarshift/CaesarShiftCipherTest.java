package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.ghappy.GHappy;

public class CaesarShiftCipherTest {

    @ParameterizedTest(name = "{0}: Message = {1} Shift = {2} ER = {3}")
    @CsvSource({"'ThreeShift', 'abc', 3, 'def'", "'ThreeShift', 'xyz', 3, 'abc'", "'ThreeShift', 'abcdef', 3, 'defghi'",
            "'sixShift', 'abcdef', 6, 'ghijkl'", "'negThreeShift', 'abc', -3, 'xyz'", "'negThreeShift', 'def', -3, 'abc'",
            "'negThreeShift', 'abc', -6, 'uvw'", "'negThreeShift', 'abc', 4, 'efg'", "'Shift', 'ABC', 3, 'invalid'"})
    public void test(String partition, String message, int shift, String expectedResult) {
        String result = new CaesarShiftCipher().CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }

}
