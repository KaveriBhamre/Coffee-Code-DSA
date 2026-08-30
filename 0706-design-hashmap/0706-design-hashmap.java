class MyHashMap {

    class Node {
        int key; int value; Node next;
        Node(int key, int value) {
            this.key = key; this.value = value;
        }
    }

    private Node[] bucket;
    private int capacity = 1000001;
    public MyHashMap() {
        bucket = new Node[capacity];
    }

    private int hash(int key) {
        return key % capacity;
    }
    
    public void put(int key, int value) {
        int index = hash(key);
        if(bucket[index] == null) {
            bucket[index] = new Node(key, value);
            return;
        }
        Node curr = bucket[index];

        while(curr != null) {
            if(curr.key == key) {
                curr.value = value;
                return;
            }
            if(curr.next == null) {
                break;
            }
            curr = curr.next;
        }
        curr.next = new Node(key, value);

    }
    
    public int get(int key) {
        int index = hash(key);
        Node curr = bucket[index];
        while(curr != null) {
            if(curr.key == key) {
                return curr.value;
            }
            curr = curr.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        int index = hash(key);
        Node curr = bucket[index];
        Node prev = null;
        while(curr != null) {
            if(curr.key == key) {
                if(prev == null) {
                    bucket[index] = curr.next;
                }else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
        curr = curr.next;
        }

    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */