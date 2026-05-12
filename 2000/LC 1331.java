class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length, i = 0;
        int[] result = new int[n];
        int[] cur = new int[n];
        for(int num:arr)
        {
            cur[i++] = num;
        }
        Arrays.sort(cur);
        Map<Integer, Integer> map = new HashMap<>();
        int index = 1;
        for(int num:cur)
        {
            if(!map.containsKey(num))
            {
                map.put(num, index);
                index++;
            }
        }
        i = 0;
        for(int num:arr)
        {
            result[i++] = map.get(num);
        }
        return result;
    }
}

/**
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sortedArr = new int[arr.length];
        System.arraycopy(arr, 0, sortedArr, 0, arr.length);
        Arrays.sort(sortedArr);
        Map<Integer, Integer> ranks = new HashMap<Integer, Integer>();
        int[] ans = new int[arr.length];
        for (int a : sortedArr) {
            if (!ranks.containsKey(a)) {
                ranks.put(a, ranks.size() + 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            ans[i] = ranks.get(arr[i]);
        }
        return ans;
    }
}

*/
