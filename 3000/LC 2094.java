class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int n = digits.length;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            if(digits[i] == 0){
                continue;
            }
            for(int j = 0; j < n; j++){
                if(j == i){
                    continue;
                }
                for(int k = 0; k < n; k++){
                    if(k == i || k == j){
                        continue;
                    }
                    if(digits[k] % 2 != 0){
                        continue;
                    }
                    else{
                        int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                        set.add(num);
                    }
                }
            }
        }
        int[] result = new int[set.size()];
        int m = 0;
        for(int num:set){
            result[m++] = num;
        }
        Arrays.sort(result);
        return result;
    }
}

/**
// 遍历三个数位的下标
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                for (int k = 0; k < n; ++k) {
                    // 判断是否满足目标偶数的条件
                    if (i == j || j == k || i == k) {
                        continue;
                    }
                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if (num >= 100 && num % 2 == 0) {
                        nums.add(num);
                    }
                }
            }
        }
*/