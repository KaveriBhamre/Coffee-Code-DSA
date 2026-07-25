class Solution {
    public int maxProduct(int n) {
        
        ArrayList<Integer> list = new ArrayList<>();

        while(n > 0) {
            int digit = n % 10;
            n = n/10;
            list.add(digit);
        }

        list.sort(null);
        
        int last = list.get(list.size() - 1);
        int secondLast = list.get(list.size() - 2);

        return last * secondLast;

    }
}