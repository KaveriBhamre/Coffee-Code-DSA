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
import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        BigInteger num1 = BigInteger.ZERO;
        BigInteger place = BigInteger.ONE;

        while(l1 != null) {
            num1 = num1.add(
                BigInteger.valueOf(l1.val).multiply(place)
            );

            place = place.multiply(BigInteger.TEN);
            l1 = l1.next;
        }

        BigInteger num2 = BigInteger.ZERO;
        place = BigInteger.ONE;

        while (l2 != null) {
            num2 = num2.add(
                BigInteger.valueOf(l2.val).multiply(place) 
            );

            place = place.multiply(BigInteger.TEN);
            l2 = l2.next;
        }

        BigInteger sum = num1.add(num2);

        if (sum.equals(BigInteger.ZERO)) {
            return new ListNode(0);
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while(sum.compareTo(BigInteger.ZERO) > 0) {
            int digit = sum.mod(BigInteger.TEN).intValue();

            current.next = new ListNode(digit);
            current = current.next;

            sum = sum.divide(BigInteger.TEN);
        }

        return dummy.next;

    }
}