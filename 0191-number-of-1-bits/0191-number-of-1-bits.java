class Solution {
    public int hammingWeight(int n) {
        String res = new String();
        while(n > 0) {
            int rem = n % 2;
            res += rem;
            n = n / 2;
        }
        int count = 0;
        for(char ch : res.toCharArray()) {
            if(ch == '1') {
                count++;
            }
        }
        return count;
    }
}