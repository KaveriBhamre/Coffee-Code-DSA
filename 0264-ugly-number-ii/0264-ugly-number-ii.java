class Solution {
    public int nthUglyNumber(int n) {

        PriorityQueue<Long> pq = new PriorityQueue<>();
        HashSet<Long> set = new HashSet<>();

        pq.add(1L);
        set.add(1L);

        long current = 1;

        for(int i = 0; i < n; i++) {

            current = pq.poll();

            if(set.add(current * 2)) {
                pq.add(current * 2);
            }

            if(set.add(current * 3)) {
                pq.add(current * 3);
            }

            if(set.add(current * 5)) {
                pq.add(current * 5);
            }
        }

        return (int) current;
    }
}