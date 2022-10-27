package tudelft.sum;

import java.util.ArrayList;
import java.util.Collections;

// Source: https://leetcode.com/problems/add-two-numbers/description/
class TwoNumbersSum
{

    public ArrayList<Integer> addTwoNumbers(ArrayList<Integer> first, ArrayList<Integer> second)
    {
        Collections.reverse(first);
        Collections.reverse(second);

        int complement = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < Math.max(first.size(), second.size()); i++)
        {
            int firstVal = i < first.size() ? first.get(i) : 0;
            int secondVal = i < second.size() ? second.get(i) : 0;
            int total = firstVal + secondVal + complement;
            complement = 0;
            if (total >= 10)
            {
                complement = 1;
                total -= 10;
            }
            if (i == (Math.max(first.size(), second.size()) - 1) && complement == 1)
            {
                result.add(i, complement);
            }
            result.add(i, total);
        }

        //Collections.reverse(result);
        return result;
    }
}
