package 链表;
/*给一个长度为n链表，若其中包含环，请找出该链表的环的入口结点，否则，返回null。

数据范围： n\le10000n≤10000，1<=结点值<=100001<=结点值<=10000
要求：空间复杂度 O(1)O(1)，时间复杂度 O(n)O(n)*/

import java.util.HashSet;
import java.util.Set;

public class BM7 {
    public static ListNode EntryNodeOfLoop(ListNode pHead) {
        HashSet<ListNode> set = new HashSet<ListNode>();
        while(pHead!=null){
            if(set.contains(pHead)){
                return pHead;
            }
            set.add(pHead);
            pHead = pHead.next;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.add(2);
        list1.add(3);
        ListNode list2 = list1.next.next;
        list1.add(4);
        list1.add(5);
        ListNode list3 = list2.next.next;
        list3.next = list2;
        ListNode result = EntryNodeOfLoop(list1);
        System.out.println(result.val);
    }
}
