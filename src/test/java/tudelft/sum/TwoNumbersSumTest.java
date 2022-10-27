package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoNumbersSumTest {

    @Test
    public void NumberTest1() {

        ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(2, 4, 3));
        ArrayList<Integer> l2 = new ArrayList<Integer>(Arrays.asList(5, 6, 4));
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(7, 0, 8));

        List<Integer> result = new TwoNumbersSum().addTwoNumbers(l1, l2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void NumberTest2() {

        ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(0));
        ArrayList<Integer> l2 = new ArrayList<Integer>(Arrays.asList(0));
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(0));

        List<Integer> result = new TwoNumbersSum().addTwoNumbers(l1, l2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void NumberTest3() {

        ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(9, 9, 9, 9, 9, 9, 9));
        ArrayList<Integer> l2 = new ArrayList<Integer>(Arrays.asList(9, 9, 9, 9));
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(8, 9, 9, 9, 0, 0, 0, 1));

        List<Integer> result = new TwoNumbersSum().addTwoNumbers(l1, l2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void NumberTest4() {

        ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList());
        ArrayList<Integer> l2 = new ArrayList<Integer>(Arrays.asList());
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList());

        List<Integer> result = new TwoNumbersSum().addTwoNumbers(l1, l2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void NumberTest5() {

        ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(2, 0));
        ArrayList<Integer> l2 = new ArrayList<Integer>(Arrays.asList(4, 5));
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(5, 6));

        List<Integer> result = new TwoNumbersSum().addTwoNumbers(l1, l2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void NumberTest6() {

        ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(8, 0, 0, 0));
        ArrayList<Integer> l2 = new ArrayList<Integer>(Arrays.asList(2, 0, 0));
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(0, 0, 2, 8));

        List<Integer> result = new TwoNumbersSum().addTwoNumbers(l1, l2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void NumberTest7() {

        ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(9, 9, 9, 9, 9, 9, 0));
        ArrayList<Integer> l2 = new ArrayList<Integer>(Arrays.asList(9, 9, 9, 9));
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(9, 8, 9, 9, 0, 0, 0, 1));

        List<Integer> result = new TwoNumbersSum().addTwoNumbers(l1, l2);
        Assertions.assertEquals(expected, result);


    }

}
