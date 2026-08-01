class Solution {
    public double average(int[] salary) {
        int n = salary.length;
        int max,min;
        min = max = salary[0];
        double avg = 0;

        for(int i = 0; i < n; i++) {
            if(salary[i] > max ){
                max = salary[i];
            }else if(salary[i] < min){
                min = salary[i];
            }
            avg += salary[i];
        }

        avg = (avg - min - max) / (n-2);
        return avg;
    }
}