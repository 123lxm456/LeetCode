class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1 = 0, sum2 = 0;
        int[] answer = new int[2];
        for(int i = 0; i < aliceSizes.length; i++)
        {
            sum1 += aliceSizes[i];
        }
        for(int i = 0; i < bobSizes.length; i++)
        {
            sum2 += bobSizes[i];
        }
        for(int i = 0; i < aliceSizes.length; i++)
        {
            for(int j = 0; j < bobSizes.length; j++)
            {
                int num1 = aliceSizes[i];
                int num2 = bobSizes[j];
                if(sum1 - num1 + num2 == sum2 - num2 + num1)
                {
                    answer[0] = num1;
                    answer[1] = num2;
                    break;
                }
            }
        }
        return answer;
    }
}
/*
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = Arrays.stream(aliceSizes).sum();
        int sumB = Arrays.stream(bobSizes).sum();
        int delta = (sumA - sumB) / 2;
        Set<Integer> rec = new HashSet<Integer>();
        for (int num : aliceSizes) {
            rec.add(num);
        }
        int[] ans = new int[2];
        for (int y : bobSizes) {
            int x = y + delta;
            if (rec.contains(x)) {
                ans[0] = x;
                ans[1] = y;
                break;
            }
        }
        return ans;
    }
}
*/
