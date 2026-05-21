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
        ListNode pehle = new ListNode(0);
        ListNode before = pehle;

        ListNode baad = new ListNode(0);
        ListNode after = baad;

        while(head !=null ){
            if(head.val<x){
                before.next=head;
                before = before.next;
            }else{
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }
        after.next = null;
        before.next = baad.next;

        return pehle.next;
    }
}