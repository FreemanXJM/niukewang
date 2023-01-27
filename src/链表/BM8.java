package 链表;
/*输入一个长度为 n 的链表，设链表中的元素的值为 ai ，返回该链表中倒数第k个节点。
如果该链表长度小于k，请返回一个长度为 0 的链表。

要求：空间复杂度 O(n)O(n)，时间复杂度 O(n)O(n)
进阶：空间复杂度 O(1)O(1)，时间复杂度 O(n)O(n)

输入：{1,2,3,4,5},2
返回值：{4,5}
说明：返回倒数第2个节点4，系统会打印后面所有的节点来比较
*/

import java.util.HashSet;

public class BM8 {
    public static ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        ListNode fast = pHead;
        ListNode slow = pHead;
        for(int i =0;i<k;i++){
            if(fast == null){
                return null;
            }
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.add(2);
        list1.add(3);
        ListNode list2 = list1.next.next;
        list1.add(4);
        list1.add(5);
        ListNode list3 = list2.next.next;
        ListNode result = FindKthToTail(list1,2);
        System.out.println(result.val);
    }
}
