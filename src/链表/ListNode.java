package 链表;
import java.util.*;

public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int x){	//可以定义一个有参构造方法，也可以定义一个无参构造方法
        val = x;
    }
    // 添加新的结点
    public void add(int newval) {
        ListNode newNode = new ListNode(newval);
        if(this.next == null)
            this.next = newNode;
        else
            this.next.add(newval);
    }
    // 打印链表
    public void print() {
        System.out.print(this.val);
        if(this.next != null)
        {
            System.out.print("-->");
            this.next.print();
        }
    }


}
