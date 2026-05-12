
class Solution {
    public int findSpecialInteger(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for(int num:arr)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num) > n/4 )
            {
                return num;
            }
        }
        return -1;
    }
}

/*
//最优
class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int cur = arr[0], cnt = 0;
        for (int i = 0; i < n; ++i) {
            if (arr[i] == cur) {
                ++cnt;
                if (cnt * 4 > n) {
                    return cur;
                }
            } else {
                cur = arr[i];
                cnt = 1;
            }
        }
        return -1;
    }
}
*/
