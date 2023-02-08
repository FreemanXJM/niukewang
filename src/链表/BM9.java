package 链表;

public class BM9 {
    public static ListNode removeNthFromEnd (ListNode head, int n) {
        //添加表头
        ListNode res = new ListNode(-1);
        res.next = head;
        //当前节点
        ListNode cur = head;
        //前序节点
        ListNode pre = res;
        ListNode fast = head;
        //快指针先行n步
        while(n != 0){
            fast = fast.next;
            n--;
        }
        //快慢指针同步，快指针到达末尾，慢指针就到了倒数第n个位置
        while(fast != null){
            fast = fast.next;
            pre = cur;
            cur = cur.next;
        }
        //删除该位置的节点
        pre.next = cur.next;
        //返回去掉头
        return res.next;
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
        ListNode l2 = removeNthFromEnd(l1,3);
        System.out.println();
        l2.print();
    }
}
