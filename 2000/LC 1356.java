class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] nums = new Integer[arr.length];
        int i  = 0;
        for(int num:arr)
        {
            nums[i++] = num;
        }
        Arrays.sort(nums,(a,b)->{
            int cnt1 = Integer.bitCount(a);
            int cnt2 = Integer.bitCount(b);
            if(cnt1 != cnt2){
                return cnt1-cnt2;
            }
            else{
                return a-b;
            }
        });
        i = 0;
        for(Integer num:nums)
        {
            arr[i++] = num;
        }
        return arr;
    }
}


/**
class Solution {
    public int[] sortByBits(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        for (int x : arr) {
            list.add(x);
        }
        int[] bit = new int[10001];
        for (int i = 1; i <= 10000; ++i) {
            bit[i] = bit[i >> 1] + (i & 1);
        }
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer x, Integer y) {
                if (bit[x] != bit[y]) {
                    return bit[x] - bit[y];
                } else {
                    return x - y;
                }
            }
        });
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}


*/