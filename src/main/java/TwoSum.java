import java.util.HashMap;

/**
 * 两数之和
 *
 * @author luojie
 * @date 2020/1/14
 */
public class TwoSum {

    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     *
     * @param nums   源数组数据
     * @param target 目标值
     * @return 和位目标值的数组 元素值为满足条件的数组下标
     */
    public int[] twoSum(int[] nums, int target) {

        //解题思路
        //遍历数组，对每个数组元素和目标值求一个差值，利用map储存改差值，遍历的时候先用数组元素值做get操作，如有对应的值直接返回当前元素和对应差值的数据即可

        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.get(nums[i]) != null) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(temp, i);
        }
        return null;
    }

}
