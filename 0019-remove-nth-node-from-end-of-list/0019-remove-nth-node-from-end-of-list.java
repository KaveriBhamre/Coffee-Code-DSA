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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;

        if(head.next == null) return null;
        
        int len = 0;
        ListNode temp = head;
        while(temp != null) {
            len++;
            temp = temp.next;
        }

        ListNode prev = null;
        temp = head;

        int x = len - n + 1;
        if(x == 1) {
            return head.next;
        }

        

        while(x > 1 && temp != null){
            prev = temp;
            temp = temp.next;
            x--;
        }

        prev.next = temp.next;

        
        return head;

    }
}