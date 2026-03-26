
class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] answer = new int[n];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            if(s.charAt(i) == c)
            {
                list.add(i);
            }
        }
        for(int i = 0; i < n; i++)
        {
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < list.size(); j++)
            {
                int len = Math.abs(list.get(j) - i);
                min = Math.min(min,len);
            }
            answer[i] = min;
        }
        return answer;
    }
}
/*
//最优：
class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];

        for (int i = 0, idx = -n; i < n; ++i) {
            if (s.charAt(i) == c) {
                idx = i;
            }
            ans[i] = i - idx;
        }

        for (int i = n - 1, idx = 2 * n; i >= 0; --i) {
            if (s.charAt(i) == c) {
                idx = i;
            }
            ans[i] = Math.min(ans[i], idx - i);
        }
        return ans;
    }
}
*/
