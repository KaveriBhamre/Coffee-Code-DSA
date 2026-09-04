class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = Arrays.stream(gas).sum();
        int totalCost = Arrays.stream(cost).sum();
        if(totalCost > totalGas) return -1;

        int n = gas.length;

        int currGas = 0; int start = 0;

        for(int i  = 0; i < n; i++) {
            currGas += gas[i] - cost[i];

            if(currGas < 0) {
                start = i + 1;
                currGas = 0;
            }
        }

        
        return start;



    }
}