class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = arr[1] - arr[0];
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 1; i < arr.length - 1; i++)
        {
            min = Math.min(min, arr[i + 1] - arr[i]);
        }
        for(int i = 0; i < arr.length - 1; i++)
        {
            if(arr[i + 1] - arr[i] == min)
            {
                List<Integer> list1 = new ArrayList<>();
                list1.add(arr[i]);
                list1.add(arr[i + 1]);
                list.add(list1);
            }
        }
        return list;
    }
}

/**
//最优
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        int best = Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for (int i = 0; i < n - 1; ++i) {
            int delta = arr[i + 1] - arr[i];
            if (delta < best) {
                best = delta;
                ans.clear();
                List<Integer> pair = new ArrayList<Integer>();
                pair.add(arr[i]);
                pair.add(arr[i + 1]);
                ans.add(pair);
            } else if (delta == best) {
                List<Integer> pair = new ArrayList<Integer>();
                pair.add(arr[i]);
                pair.add(arr[i + 1]);
                ans.add(pair);
            }
        }

        return ans;
    }
}

*/