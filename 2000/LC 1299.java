class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length, cur = 0;
        while(cur < n-1)
        {
            int maxi = MAXI(cur + 1, n - 1, arr);
            for(int i= cur; i < maxi; i++)
            {
                arr[i] = arr[maxi];
            }
            cur = maxi;
        }
        arr[n - 1] = -1;
        return arr;
    }
    public int MAXI(int a, int b, int[] arr)
    {
        int max = arr[a], maxi = a;
        for(int i = a; i <= b; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
                maxi = i;
            }
        }
        return maxi;
    }
}


/**
//最优
class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        ans[n - 1] = -1;
        for (int i = n - 2; i >= 0; --i) {
            ans[i] = Math.max(ans[i + 1], arr[i + 1]);
        }
        return ans;
    }
}

*/
