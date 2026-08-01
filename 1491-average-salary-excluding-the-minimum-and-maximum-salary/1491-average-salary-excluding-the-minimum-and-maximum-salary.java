class Solution {
    public double average(int[] salary) {
        int n = salary.length;
        double sum = 0, avg = 0, count = 0;
        Arrays.sort(salary);
        for(int i = 1; i < n - 1; i++) {
            sum += salary[i];
            count++;
        }
        avg = sum / count;
        return avg;
    }
}