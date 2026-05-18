/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode a, ListNode b) {
        while(a!=null){
            ListNode temp=b;
            while(temp!=null){
                if(a==temp){
                    return a;
                }
                temp=temp.next;
            }
            a=a.next;
        }
        return null;
    }
}