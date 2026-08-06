class Solution {
    public int productOfDigits(int num){
        int product = 1;
        while(num > 0){
            int digit = num % 10;
            product *= digit;
            num /= 10;
        }
        return product;
    }
    public int smallestNumber(int n, int t) {
        int currNum = n;
        while(true){
            int product = productOfDigits(currNum);
            if(product % t == 0){
                return currNum;
            }
            currNum++;
        }       
    }
}