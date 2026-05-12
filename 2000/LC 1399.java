
class Solution {
    public int countLargestGroup(int n) {
        int[] arr = new int[37];
        for(int i = 1; i <= n; i++){
            arr[sum(i)]++;
        }
        int count = 0,max = arr[1];
        for(int num:arr){
            if(num > max){
                count = 1;
                max = num;
            }
            else if(num == max){
                count++;
            }
        }
        return count;
    }
    public int sum(int n){
        int result = 0;
        while(n != 0)
        {
            result = result + n % 10;
            n = n / 10;
        }
        return result;
    }
}

/*
class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int maxValue = 0;
        for (int i = 1; i <= n; ++i) {
            int key = 0, i0 = i;
            while (i0 != 0) {
                key += i0 % 10;
                i0 /= 10;
            }
            hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
            maxValue = Math.max(maxValue, hashMap.get(key));
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> kvpair : hashMap.entrySet()) {
            if (kvpair.getValue() == maxValue) {
                ++count;
            }
        }
        return count;
    }
}
*/