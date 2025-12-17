class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int[] ans = new int[n1];
        int i = 0, j = 0;
        for(int num1:nums1)
        {
            for(i = 0; i < nums2.length; i++)
            {
                if(nums2[i] != num1)
                {
                    continue;
                }
                else
                {
                    while(i < nums2.length && nums2[i] <= num1)
                    {
                        i++;
                    }
                    ans[j++] = (i < nums2.length) ? nums2[i] : -1;
                }
            }
        }
        return ans;
    }
}
/**
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //map：存储 nums2 中元素值 → 其下一个更大元素值 的映射；
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        //stack：单调栈（核心），用于逆序遍历 nums2 时，快速找到当前元素的下一个更大元素
        Deque<Integer> stack = new ArrayDeque<Integer>();
        for (int i = nums2.length - 1; i >= 0; --i) 
        {
            int num = nums2[i];
            // 步骤1：弹出栈中≤当前元素的元素（这些元素不可能是当前元素的下一个更大元素）
            while (!stack.isEmpty() && num >= stack.peek()) {
                stack.pop();
            }
            // 步骤2：记录当前元素的下一个更大元素（栈空则为-1，否则为栈顶）
            map.put(num, stack.isEmpty() ? -1 : stack.peek());
            // 步骤3：将当前元素压入栈，作为左侧元素的“候选更大元素”
            stack.push(num);
        }
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; ++i) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}
 */
