/*
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count = 0;
        for(int i = 1; i < 1000; i++){
            for(int j = 0; j < arr.length; j++){
                if(i < arr[j]){
                    count++;
                    break;
                }
                else if(i == arr[j]){
                    break;
                }
            }
            if(i >= arr[arr.length - 1]){
                return arr[arr.length - 1] + k - count;
            }
            if(count == k){
                return i;
            }
        }
        return arr[arr.length - 1] + k - count;
    }
}
*/

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count = 0;
        int i = 1;
        int j = 0;
        int n = arr.length;
        
        while (true) {
            // 当前数字 i 存在
            if (j < n && arr[j] == i) {
                j++;
            } 
            // 当前数字 i 缺失
            else {
                count++;
                if (count == k) {
                    return i;
                }
            }
            i++;
        }
    }
}
