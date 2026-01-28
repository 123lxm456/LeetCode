
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int length = nums.length;
        int[] num = new int[length + 1];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < length; i++)
        {
            num[nums[i]]++;
        }
        for(int i = 1; i < length + 1; i++)
        {
            if(num[i] == 0)
            {
                list.add(i);
            }
        }
        return list;
    }
}

/*
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int length = nums.length;
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < length; i++)
        {
            set.add(nums[i]);
        }
        for(int i = 1; i <= length; i++)
        {
            if(!set.contains(i))
            {
                list.add(i);
            }
        }
        return list;
    }
}
*/
/**
//原地修改
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            int x = (num - 1) % n;
            if (nums[x] <= n) {
                nums[x] += n;
            }
        }
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (nums[i] <= n) {
                ret.add(i + 1);
            }
        }
        return ret;
    }
}
 */
