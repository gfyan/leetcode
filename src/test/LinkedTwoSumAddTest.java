import org.junit.Test;

/**
 * @author luojie
 * @date 2020/1/14
 */
public class LinkedTwoSumAddTest {

    @Test
    public void test() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(3);


        ListNode l2 = new ListNode(8);
        LinkedTwoSumAdd add = new LinkedTwoSumAdd();
        ListNode listNode = add.addTwoNumbers(l1, l2);
        while (listNode != null) {
            System.out.print(listNode.val+",");
            listNode = listNode.next;
        }
    }

}
