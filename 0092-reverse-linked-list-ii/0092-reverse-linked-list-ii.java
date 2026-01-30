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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode tail=dummy;
        for(int i=1;i<left;i++){
            tail=tail.next;
        }
        ListNode temp=tail.next;
        for(int i=0;i<right-left;i++){
            ListNode neww=temp.next;
            temp.next=neww.next;
            neww.next=tail.next;
            tail.next=neww;
        }
        return dummy.next;
    }
}