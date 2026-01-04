/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
       
        while(a!=null){
             ListNode temp=headB;
            while(temp!=null){
                if(temp==a){
                    return a;
                }
                temp=temp.next;
            }
            a=a.next;
        }
return null;  
  }
}