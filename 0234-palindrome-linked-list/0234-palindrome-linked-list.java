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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
         ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode right = reverse(slow.next);
        slow.next = null;
            ListNode left = head;
            while(right!= null){
                if(left.val != right.val){
                    return false;
                }
                left= left.next;
                right= right.next;
            }
            return true;
    }
            private ListNode reverse(ListNode head){
            ListNode prev = null, next = null;
            ListNode curr = head;
            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev =curr;
                curr = next;

            }
            return prev;
        }
}