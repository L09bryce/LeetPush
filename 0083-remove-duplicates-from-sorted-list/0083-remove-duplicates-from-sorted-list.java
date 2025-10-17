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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)return null;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        

        while(head != null && head.next != null){
            if(head.val != head.next.val){
                curr.next = head;
                curr = curr.next;
            }
                head = head.next;
        }
        if(curr!= null &&(curr.val != head.val)){
            curr.next = head;
        }
        return dummy.next;
    }
}