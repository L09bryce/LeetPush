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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> st = new HashSet<>();
        for(int i : nums){
            st.add(i);
        }
        ListNode dummy = new ListNode(0);
        dummy.next =head;
        ListNode prev = dummy;
        ListNode curr = head;
        while(curr != null){
            if(!st.contains(curr.val)){
                prev.next = curr;
                prev = prev.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}