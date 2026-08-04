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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        
        int n = lists.length;
        PriorityQueue<ListNode> q = new PriorityQueue<>((a,b) -> a.val - b.val);

        for(ListNode list : lists){
            if(list != null){
                q.offer(list);
            }
        }

        ListNode res = new ListNode(0);
        ListNode curr = res;

        while(!q.isEmpty()){
            ListNode temp = q.poll();
            curr.next = temp;
            curr = curr.next;

            temp = temp.next;
            if(temp != null){
                q.offer(temp);
            }
        }
        return res.next;
    }
}