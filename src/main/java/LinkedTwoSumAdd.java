/**
 * 链表两数相加
 *
 * @author luojie
 * @date 2020/1/14
 */
public class LinkedTwoSumAdd {

    /**
     * 给出两个非空的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储一位数字。
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     * 您可以假设除了数字 0 之外，这两个数都不会以0开头。
     *
     * @param l1 数链表1
     * @param l2 数链表2
     * @return 相加后的结果
     */
    ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        //解题思路就是对两个链表进行遍历操作，对应位置进行相加，如果相加结果大于10则进行进位操作
        ListNode result = null;
        ListNode last = null;
        int val1;
        int val2;
        int of = 0;
        boolean fl1;
        boolean fl2;
        do {

            val1 = 0;
            val2 = 0;

            if (l1 != null) {
                val1 = l1.val;
            }
            if (l2 != null) {
                val2 = l2.val;
            }
            //进行相加操作
            int temp = val1 + val2 + of;
            int nodeVal;

            //如果结果大于10进行进位逻辑处理
            if (temp >= 10) {
                //储存当前对应位相加结果
                nodeVal = temp % 10;
                //储存进位数值 （其实这里储存一个标志位即可，不一定要用除法，因为两个）
                of = temp / 10;
            } else {
                nodeVal = temp;
                //清空进位值
                of = 0;
            }
            if (result == null) {
                result = new ListNode(nodeVal);
                last = result.next;
            } else {
                if (last == null) {
                    last = new ListNode(nodeVal);
                    result.next = last;
                } else {
                    last.next = new ListNode(nodeVal);
                    last = last.next;
                }
            }

            //终止条件就是两个链表都已经遍历完毕，且进位值为0
            fl1 = l1 != null && (l1 = l1.next) != null;
            fl2 = l2 != null && (l2 = l2.next) != null;
        } while (fl1 || fl2 || of != 0);

        return result;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}