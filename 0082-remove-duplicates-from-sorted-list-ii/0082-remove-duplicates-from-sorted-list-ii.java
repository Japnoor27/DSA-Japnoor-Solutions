class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        int[] freq=new int[201];
        ListNode temp=head;
        while(temp!=null){
            freq[temp.val+100]++;
            temp=temp.next;
        }
        ListNode dummy=new ListNode(-1);
        ListNode tail=dummy;
         temp = head;
        while (temp != null) {
            if (freq[temp.val+100] == 1) {
                tail.next = new ListNode(temp.val);
                tail = tail.next;
            }
            temp = temp.next;
        }

        return dummy.next;
    }
}