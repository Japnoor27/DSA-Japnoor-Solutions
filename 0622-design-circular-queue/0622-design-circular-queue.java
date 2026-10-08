class MyCircularQueue {
int front;
int rear;
int size;
int[] arr;
int capacity;
    public MyCircularQueue(int k) {
        front=0;
        rear=-1;
        size=0;
        arr=new int[k];
        capacity=k;
    }
    
    public boolean enQueue(int value) {
        if(size==capacity){
            return false;
        }
        rear=(rear+1)%capacity;
        arr[rear]=value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
          if(size==0){
            return false;
        }
        front=(front+1)%capacity;
        
        size--;
        return true;
    }
    
    public int Front() {
        if(size==0) return -1;
        return arr[front];
    }
    
    public int Rear() {
        if(size==0) return -1;
        return arr[rear];
    }
    
    public boolean isEmpty() {
        if(size==0) return true;
        return false;
    }
    
    public boolean isFull() {
        if(size==capacity) return true;
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */