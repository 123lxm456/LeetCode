//题目要求 “分组大小≥2，且所有组大小相同”，等价于 “所有数字的出现次数的最大公约数 (GCD)≥2”
//deck = [1,1,2,2,2,2] → 1 出现 2 次，2 出现 4 次，GCD (2,4)=2 → 应返回 true；
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:deck)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int gcd = 0;
        for(int num:map.values())
        {
            gcd = gcd(gcd, num);
            if(gcd < 2)
            {
                return false;
            }
        }
        return gcd >= 2;
    }
    public int gcd(int a, int b)
    {
        if(b == 0)
        {
            return a;
        }
        return gcd(b, a%b);
    }
}


/*
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] count = new int[10000];
        for (int c: deck) {
            count[c]++;
        }

        int g = -1;
        for (int i = 0; i < 10000; ++i) {
            if (count[i] > 0) {
                if (g == -1) {
                    g = count[i];
                } else {
                    g = gcd(g, count[i]);
                }
            }
        }
        return g >= 2;
    }

    public int gcd(int x, int y) {
        return x == 0 ? y : gcd(y % x, x);
    }
}
*/
