class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int num = candies, k = 0;
        while(num > 0)
        {
            ans[k % num_people] += k+1;
            num = num - k - 1;
            k++;
            if((k + 1) > num)
            {
                ans[k % num_people] += num;
                break;
            }
        }
        return ans;
    }
}

/**
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int i = 0;
        while (candies != 0) {
            ans[i % num_people] += Math.min(candies, i + 1);
            candies -= Math.min(candies, i + 1);
            i += 1;
        }
        return ans;
    }
}

*/