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
        ListNode fast = head;
        ListNode slow = head;

        if(head.next == null) return null; // if list contains one node it returns null

        for(int i = 0; i < n; i++){
            fast = fast.next;
        }

        if(fast == null) return head.next; // case to delete 1st node

        while(fast != null && fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next; // if slow.next = 4, and slow.next.next = 5 then by this slow.next becomes 5

        return head;
    }
}