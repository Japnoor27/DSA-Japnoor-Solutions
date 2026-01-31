class MyLinkedList {
    ListNode head;
    int size;


    public MyLinkedList() {
        head=null;
        size=0;
    }
    
    public int get(int index) {
        if(index<0 || index>=size) return -1;
        int pos=0;
        ListNode temp=head;
        while(pos<index){
            temp=temp.next;
            pos++;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
         ListNode newNode=new ListNode(val);
        if(head==null){
           
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;

        }
        size++;
    }
    
    public void addAtTail(int val) {
        ListNode newNode=new ListNode(val);
        if(head==null){
head=newNode;
size++;
return;
        }
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        size++;
        return;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size) return;
        int pos=0;
        ListNode newNode=new ListNode(val);
        if(index==0){
            if(head==null){
           
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;

        }
        size++;
        return;
        }
        ListNode temp=head;
        while( pos<index-1){
            temp=temp.next;
            pos++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
        return;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size) return;
        ListNode temp=head;
        if(index==0){
            if(head==null){
                return;
            }
            else{
                head=head.next;
            }
            size--;
        }
        else{
            int pos=0;
            while(pos<index-1){
                temp=temp.next;
                pos++;
            }
            temp.next=temp.next.next;
            size--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */