package 链表;
import java.util.*;

public class BM4 {
    public static ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null || list2 == null){
            return list1 != null ? list1:list2;
        }
        if(list1.val <= list2.val){
            list1.next = Merge(list1.next,list2);
            return list1;
        }else{
            list2.next = Merge(list1,list2.next);
            return list2;
        }
    }

    public static ListNode Merge2(ListNode list1, ListNode list2) {
        //一个已经为空了，直接返回另一个
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        //加一个表头
        ListNode head = new ListNode(0);
        ListNode cur = head;
        //两个链表都要不为空
        while(list1 != null && list2 != null){
            //取较小值的节点
            if(list1.val <= list2.val){
                cur.next = list1;
                //只移动取值的指针
                list1 = list1.next;
            }else{
                cur.next = list2;
                //只移动取值的指针
                list2 = list2.next;
            }
            //指针后移
            cur = cur.next;
        }
        //哪个链表还有剩，直接连在后面
        if(list1 != null)
            cur.next = list1;
        else
            cur.next = list2;
        //返回值去掉表头
        return head.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.add(3);
        list1.add(5);
        ListNode list2 = new ListNode(2);
        list2.add(4);
        list2.add(6);
//        ListNode l3 = Merge(list1,list2);
//        l3.print();
        ListNode l4 = Merge2(list1,list2);
        l4.print();
    }
}
