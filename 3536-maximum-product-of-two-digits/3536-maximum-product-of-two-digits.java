class Solution {
    public int maxProduct(int n) {
        if(n < 100){
            int d1 = n % 10;
            n /= 10;
            int d2 = n % 10;

            return d1 * d2;
        }

        ArrayList<Integer> list = new ArrayList<>();

        while(n > 0) {
            int digit = n % 10;
            n = n/10;
            list.add(digit);
        }

        list.sort(null);
        int count = 0;
        int product = 1;

        int last = list.get(list.size() - 1);
        int secondLast = list.get(list.size() - 2);

        product = last * secondLast;

        return product;

    }
}