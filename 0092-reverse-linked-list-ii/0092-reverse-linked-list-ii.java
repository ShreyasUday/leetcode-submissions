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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode tempNode = new ListNode(0,head);
        ListNode beforeLeftNode = tempNode;

        for(int i = 0; i<left-1; i++){
            beforeLeftNode = beforeLeftNode.next;
        }
        ListNode leftNode = beforeLeftNode.next;

        ListNode prev = beforeLeftNode;
        ListNode curr = leftNode;
        for(int i = left; i<=right; i++){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        beforeLeftNode.next = prev;
        leftNode.next = curr;

        return tempNode.next;
    }
}