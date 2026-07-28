class MyCircularQueue {

    private int[] q;
    private int size, front, rear, currSize;

    public MyCircularQueue(int k) {
        q = new int[k];
        front = -1;
        rear = -1;
        size = k;
        currSize = 0;
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        if(currSize == 0){
            front = rear = 0;
        }
        else {
            rear = (rear + 1) % size;
        }
        q[rear] = value;
        currSize++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        int ele = q[front];
        if(currSize == 1){
            front = rear = -1;
        }else {
            front = (front+1) % size;
        }
        currSize--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        return q[front];
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        return q[rear];
    }
    
    public boolean isEmpty() {
        return (currSize == 0);
    }
    
    public boolean isFull() {
        return (currSize == size);
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