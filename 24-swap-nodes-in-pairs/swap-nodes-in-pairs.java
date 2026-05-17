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
    public ListNode swapPairs(ListNode head) {
        ListNode ll = new ListNode(0);
        ll.next = head;
        ListNode pre = ll;
        while(head!=null && head.next!=null){
            ListNode f = head;
            ListNode s = head.next;
            pre.next = s;
            f.next = s.next;
            s.next = f;
            pre=f;
            head = f.next;
        }
        return ll.next;
    }
}