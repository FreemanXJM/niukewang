package 链表;
import java.util.*;

public class BM3 {
    public static ListNode reverseKGroup (ListNode head, int k) {
        // write code here
        ListNode tail = head;
        for(int i=0;i<k;i++){
            if(tail == null)
                return head;
            tail = tail.next;
        }
        ListNode pre = null;
        ListNode cur = head;
        while(cur != tail){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        head.next = reverseKGroup(tail,k);
        return pre;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);    //创建链表对象 l1 （对应有参 和 无参 构造方法）
        l1.add(2);                //插入结点，打印
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.print();
        ListNode l2 = reverseKGroup(l1,3);
        System.out.println();
        l2.print();
    }
}
