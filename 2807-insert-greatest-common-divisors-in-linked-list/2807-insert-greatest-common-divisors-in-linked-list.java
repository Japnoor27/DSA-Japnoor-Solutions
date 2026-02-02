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
    private int gcd(int a,int b){
            if(b==0) return a;
            return gcd(b,a%b);
        }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        
        ListNode dummy=new ListNode (-1);
        ListNode tail=dummy;
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            tail.next=new ListNode(temp.val);
            tail=tail.next;
            tail.next=new ListNode(gcd(temp.val,temp.next.val));
            tail=tail.next;
            temp=temp.next;
           



        }
tail.next=temp;
return dummy.next;

    }
}