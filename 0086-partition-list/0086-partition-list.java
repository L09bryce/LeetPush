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
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(0);
        ListNode rest = new ListNode(0);

        ListNode lessH = less;
        ListNode restH = rest;
        ListNode curr = head;

        while(curr != null){
            if(curr.val < x){
                lessH.next = curr;
                lessH = lessH.next;
            }
            else{
                restH.next = curr;
                restH = restH.next;
            }
            curr = curr.next;
        }
        restH.next =null;
        lessH.next= rest.next;
        return less.next;
    }
}