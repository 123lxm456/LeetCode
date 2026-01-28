class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int k = 1,max = nums[n - 1];
        List<Integer> list = new ArrayList<>();
        list.add(max);
        for(int i = n - 1; i >= 0; i--)
        {
            if(nums[i] < max)
            {
                list.add(nums[i]);
                k++;
                max = nums[i];
            }
            if(k == 3)
            {
                break;
            }
        }
        if(k == 3)
        {
            return list.get(2);
        }
        return list.get(0);
    }
}

/**
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        reverse(nums);
        for (int i = 1, diff = 1; i < nums.length; ++i) {
            if (nums[i] != nums[i - 1] && ++diff == 3) { // 此时 nums[i] 就是第三大的数
                return nums[i];
            }
        }
        return nums[0];
    }

    public void reverse(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
 */

 /**
class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> s = new TreeSet<Integer>();
        for (int num : nums) {
            s.add(num);
            if (s.size() > 3) {
                s.remove(s.first());
            }
        }
        return s.size() == 3 ? s.first() : s.last();
    }
}

  */
