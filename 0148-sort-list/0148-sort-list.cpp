/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* sortList(ListNode* head) {
        vector<int>arr;
        if(head==NULL){
           return NULL;
        }
        ListNode* temp=head;
        while(temp!=NULL){
            arr.push_back(temp->val);
            temp=temp->next;
        }
        sort(arr.begin(),arr.end());
        // ListNode* newhead=new ListNode(arr[0]);
        // ListNode* mover=newhead;
        // for(int i=1;i<arr.size();i++){
        //     ListNode* t=new ListNode(arr[i]);
        //     mover->next=t;
        //     mover=t;
        // }
        // return newhead;
          temp = head;
        int i = 0;
        while (temp != NULL) {
            temp->val = arr[i++];
            temp = temp->next;
        }
        return head;
    }
};