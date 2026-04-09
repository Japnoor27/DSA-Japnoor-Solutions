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
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        if(length==n){
            return head.next;
        }
        if(n>length) return null;
        int search=length-n-1;
        temp=head;
        int count=1;
        while(count<=search){
            count++;
            temp=temp.next;
        }
        if( temp!=null && temp.next!=null){
        temp.next=temp.next.next;}
return head;
    }
}