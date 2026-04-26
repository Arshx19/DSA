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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        int size=0;
        ListNode temp = head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int []arr = new int[size];
        temp=head;
        int i=0;
        while(temp!=null){
            arr[i++] =temp.val;
            temp = temp.next;
        }
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int t=arr[l];
            arr[l]=arr[r];
            arr[r] = t;
            l++;
            r--;
        }
        ListNode bew = new ListNode(arr[0]);
        ListNode cur = bew;
        for(int j=1;j<size;j++){
            cur.next = new ListNode(arr[j]);
            cur = cur.next;
        }
        return bew;
    }
}