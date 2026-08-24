class MyCircularDeque {

    int[] dq;
    int front, rear, size, count;

    public MyCircularDeque(int k) {
        dq = new int[k];
        size = k;
        front = 0;
        rear = 0;
        count = 0;
    }
    
    public boolean insertFront(int value) {
        if(isFull()) {
            return false;
        }
        front--;
        if(front == -1) front = size - 1;
        dq[front] = value;
        count++;
        return true;
        
    }
    
    public boolean insertLast(int value) {
        if(isFull()) {
            return false;
        }
        dq[rear] = value;
        rear = (rear + 1) % size;
        count++; 
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()) {
            return false;
        }
        front = (front + 1) % size;
        count--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()) {
            return false;
        }
        rear--;
        if(rear == -1){
            rear = size - 1;
        }
        count--;
        return true;
    }
    
    public int getFront() {
        if(isEmpty()) {
            return -1;
        }
        return dq[front];
    }
    
    public int getRear() {
        if(isEmpty()) {
            return -1;
        }

        int index = rear - 1;

        if(index == -1) {
            index = size - 1;
        }

        return dq[index];
    }
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    public boolean isFull() {
        return count == size;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */