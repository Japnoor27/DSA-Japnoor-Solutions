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
        ListNode temp=head;
        int length=0;
        int count=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        if(n==length){
            return head.next;
        }
        int pos=length-n;
        temp=head;
        while(temp!=null && count<pos-1){
         
            temp=temp.next;
               count++;
        }
        
        temp.next=temp.next.next;
        
        return head;
    }
}