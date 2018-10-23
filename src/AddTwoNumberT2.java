public class AddTwoNumberT2 {
    //    *
//     * Definition for singly-linked list.



        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode result = new ListNode(0);
            ListNode p = l1, q = l2 ,  curr = result;
            int add = 0;
            while (p != null || q!=null){
                int x = (p != null) ? p.val : 0;
                int y = (q != null) ? q.val : 0;
                int sum = add + x + y;
                add = sum /10;
                curr.next = new ListNode(sum%10);
                curr = curr.next;
                if (p != null) p = p.next;
                if (q != null) q = q.next;
            }
            if (add > 0) {
                curr.next = new ListNode(add);
            }
            return result.next;
        }

    public static void main(String[] args) {
        ListNode start = new ListNode(5);
        ListNode end = new ListNode(5);
        ListNode res = AddTwoNumberT2.addTwoNumbers(start,end);

    }

}
 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}