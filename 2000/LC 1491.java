class Solution {
    public double average(int[] salary) {
        int n = salary.length;
        int max = salary[0], min = salary[0], sum = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(max, salary[i]);
            min = Math.min(min, salary[i]);
            sum += salary[i];
        }
        return (double)(sum - max - min) / (n - 2);
    }
}