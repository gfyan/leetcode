import java.util.HashMap;

/**
 * 求无重复字符的最长子串
 *
 * @author luojie
 * @date 2020/1/14
 */
public class LengthOfLongest {

    /**
     * 给定一个字符串，请你找出其中不含有重复字符的最长子串的长度。
     *
     * @param s 源字符串
     * @return 返回无重复最长字符串数值
     */
    public int lengthOfLongestSubstring(String s) {

        //解题思路
        //循环遍历字符串的字符数值，并同时记录一个游标，该游标从0开始，一旦遇到重复的字符重置该游标。
        //游标重置规则：当前游标值和被重复的字符下标取最大值。
        //无重读字符串长度：每遍历一次计算一次当前遍历的下标和游标的len长度，然后和max值做对比取最大值便是当前无重复字符串长度。

        if (s == null || s.isEmpty()) {
            return 0;
        }
        HashMap<Character, Integer> temp = new HashMap<>(10);
        int max = 0;
        int begin = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            //遇到重复字符串进行游标重置
            if (temp.get(c) != null) {
                //与被重复字符下标作对比，取max值
                begin = Math.max(temp.get(c) + 1, begin);
            }

            //计算当前所遍历的字符串中，无重读字符串最大长度
            max = Math.max(i - begin + 1, max);
            temp.put(c, i);
        }

        return max;
    }

}
