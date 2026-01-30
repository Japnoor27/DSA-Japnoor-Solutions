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
    public void reorderList(ListNode head) {
        if(head==null ||head.next==null) return ;
        ArrayList <ListNode> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp);
            temp=temp.next;
        }
        int i=0,j=list.size()-1;
        while(i<j){
            list.get(i).next=list.get(j);
            i++;
            if(i==j) break;
            list.get(j).next=list.get(i);
            j--;

        }
list.get(i).next=null;
        
    }
}