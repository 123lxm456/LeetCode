class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        int[] arr = new int[101];
        for(int num:nums){
            arr[num]++;
        }
        for(int i = 0; i < 101; i++){
            if(arr[i] == 1){
                sum += i;
            }
        }
        return sum;
    }
}

/**
//最优
class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
        for (int num : nums) {
            cnt.put(num, cnt.getOrDefault(num, 0) + 1);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : cnt.entrySet()) {
            int num = entry.getKey(), c = entry.getValue();
            if (c == 1) {
                ans += num;
            }
        }
        return ans;
    }
}

*/
