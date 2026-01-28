class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int left1 = 0, left2 = 0;
        while(left1 < g.length && left2 < s.length)
        {
            if(s[left2] >= g[left1])
            {
                left1++;
                left2++;
            }
            else
            {
                left2++;
            }
        }
        return left1;
    }
}
/*
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                i++;
            }
            j++;
        }
        return i;
    }
}
*/
