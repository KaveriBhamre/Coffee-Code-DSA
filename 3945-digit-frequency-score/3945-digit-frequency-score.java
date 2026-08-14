class Solution {
    public int digitFrequencyScore(int n) {
        return String.valueOf(Math.abs(n))
                        .chars()
                        .map(Character :: getNumericValue)
                        .sum();

        
    }
}