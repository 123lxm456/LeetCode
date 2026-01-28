class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int pre = 0,cur,sum=0;
        for(int i = n-1; i >= 0;i--)
        {
            cur = f(s.charAt(i));
            if(cur >= pre)
            {
                sum = sum + cur;
            }
            else
            {
                sum = sum - cur;
            }
            pre = cur;
        }
        return sum;
    }
    public int f(char a)
    {
        switch(a)
        {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
/*
class Solution {
    Map<Character, Integer> symbolValues = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public int romanToInt(String s) {
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            int value = symbolValues.get(s.charAt(i));
            if (i < n - 1 && value < symbolValues.get(s.charAt(i + 1))) {
                ans -= value;
            } else {
                ans += value;
            }
        }
        return ans;
    }
}
*/