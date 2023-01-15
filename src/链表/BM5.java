/*合并 k 个升序的链表并将结果作为一个升序的链表返回其头节点。
        输入：[{1,2},{1,4,5},{6}]
        输出：{1,1,2,4,5,6}*/
package 链表;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class BM5 {
    public static ListNode mergeKLists(ArrayList<ListNode> lists){
        Queue<ListNode> pq = new PriorityQueue<>((v1,v2)->v1.val- v2.val);
        for (int i=0;i<lists.size();i++){
            if(lists.get(i) != null)
                pq.add(lists.get(i));
        }
        ListNode res = new ListNode(-1);
        ListNode head = res;
        while (!pq.isEmpty()){
            ListNode temp = pq.poll();
            head.next = temp;
            head = head.next;
            if(temp.next != null){
                pq.add(temp.next);
            }
        }
        return res.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.add(3);
        list1.add(5);
        ListNode list2 = new ListNode(2);
        list2.add(4);
        list2.add(6);
        ListNode list3 = new ListNode(5);
        list3.add(7);
        ArrayList<ListNode> lists= new ArrayList<ListNode>();
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        ListNode list4 = mergeKLists(lists);
        list4.print();
    }
}
