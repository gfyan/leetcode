import org.junit.Test;

import java.util.Arrays;

/**
 * @author luojie
 * @date 2020/1/14
 */

public class TwoSumTest {

    @Test
    public void test() {
        int[] ints = {1, 5, 7, 9, 3};
        int target = 10;
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(ints, target)));
    }

}
