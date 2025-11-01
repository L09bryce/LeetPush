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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode dummy1 = new ListNode(0);

        ListNode right = dummy1;
        ListNode left = dummy;
        int count = 1;
        ListNode curr = head;
        int i = 1;
        while(curr != null){
            if(i % 2 ==1){
                left.next = curr;
                left = left.next;
            }else{
                right.next = curr;
                right = right.next;
            }
            curr = curr.next;
            i++;
        }
        right.next = null;
        left.next = dummy1.next;
        return dummy.next;
    }
}