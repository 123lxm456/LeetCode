class Solution {
    public double trimMean(int[] arr) {
        double total = Arrays.stream(arr).sum();
        int n = arr.length;
        double x = n * 0.05;
        Arrays.sort(arr);
        for(int i = 0; i < x; i++){
            total -= arr[i];
        }
        for(int i = 0; i < x; i++){
            total -= arr[n - i - 1];
        }
        return total / (n - 2 * x);
    }
}

/**
//对区间[n/20,19n/20) 内的元素进行求和,返回均值partialSum/0.9n
​
 
class Solution {
    public double trimMean(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int partialSum = 0;
        for (int i = n / 20; i < 19 * n / 20; i++) {
            partialSum += arr[i];
        }
        return partialSum / (n * 0.9);
    }
}
*/
