class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {

        int MAX = 100000;   // value range
        int[] freq = new int[MAX + 1];

        // nums wale mark kar do
        for (int x : nums) {
            freq[x] = 1;
        }

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        ListNode temp = head;

        while (temp != null) {
            // agar nums mein nahi hai → rakh lo
            if (freq[temp.val] == 0) {
                tail.next = new ListNode(temp.val);
                tail = tail.next;
            }
            // agar nums mein hai → skip (delete)
            temp = temp.next;
        }

        return dummy.next;
    }
}
