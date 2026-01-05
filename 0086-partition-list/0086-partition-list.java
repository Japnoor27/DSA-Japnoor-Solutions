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
    public ListNode partition(ListNode head, int x) {
         ListNode less =new ListNode (-1);
        ListNode more= new ListNode(-1);
        ListNode equal=new ListNode(-1);
        ListNode l=less;
        ListNode m=more;
        ListNode e=equal;
        ListNode temp=head;
        while(temp!=null){
               
            if(temp.val<x){
                l.next=temp;
                l=l.next;
            }
    
            else{
                m.next=temp;
                m=m.next;
            }
            temp=temp.next;
        }
        l.next=more.next;
        m.next=null;
        return less.next;
    }
}