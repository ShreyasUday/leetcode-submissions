/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1 = reverse(l1);
        ListNode h2 = reverse(l2);
        ListNode res = new ListNode();
        ListNode dum = res;
        int carry = 0;
        while(h1 != null || h2 != null || carry != 0){
            int num = carry;
            if(h1 != null){
                num += h1.val;
                h1 = h1.next;
            }
            if(h2 != null){
                num += h2.val;
                h2 = h2.next;
            }
            carry = num/10;
            dum.next = new ListNode(num%10);
            dum = dum.next;
        }
        ListNode prev = null;
        ListNode curr = res.next;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}