/*
//我的方法：
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new TreeMap<>();
        int[] arr3 = new int[arr1.length];
        for(int arr:arr1)
        {
            map.put(arr, map.getOrDefault(arr, 0) + 1);
        }
        int k = 0;
        for(int arr:arr2)
        {
            int num = map.get(arr);
            for(int i = 0; i < num; i++)
            {
                arr3[k++] = arr;
            }
            map.remove(arr);
        }
        for(int arr:map.keySet())
        {
            int num = map.get(arr);
            for(int i = 0; i < num; i++)
            {
                arr3[k++] = arr;
            }
        }
        return arr3;
    }
}
*/

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int upper = 0;
        for (int x : arr1) {
            upper = Math.max(upper, x);
        }
        int[] frequency = new int[upper + 1];
        for (int x : arr1) {
            ++frequency[x];
        }
        int[] ans = new int[arr1.length];
        int index = 0;
        for (int x : arr2) {
            for (int i = 0; i < frequency[x]; ++i) {
                ans[index++] = x;
            }
            frequency[x] = 0;
        }
        for (int x = 0; x <= upper; ++x) {
            for (int i = 0; i < frequency[x]; ++i) {
                ans[index++] = x;
            }
        }
        return ans;
    }
}