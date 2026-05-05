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
    public ListNode rotateRight(ListNode head, int k) {
        int size = 0;
        ListNode temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (size == 0) return null;

        k = k % size;

        int[] arr = new int[size];
        temp = head;
        int i = 0;

        while (temp != null) {
            arr[i++] = temp.val;
            temp = temp.next;
        }

        int n = size;
        int[] res = new int[n];

        for (int j = 0; j < n; j++) {
            res[(j + k) % n] = arr[j];
        }

        ListNode h = new ListNode(res[0]);
        ListNode curr = h;

        for (int j = 1; j < n; j++) {
            curr.next = new ListNode(res[j]);
            curr = curr.next;
        }

        return h;
    }
}