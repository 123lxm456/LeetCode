class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++)
        {
            if(arr[i] == 0)
            {
                for(int j = n-1; j > i; j--)
                {
                    arr[j] = arr[j - 1];
                }
                arr[i + 1] = 0;
                i++;
            }
        }
    }
}

/**
//最优
class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int top = 0;
        int i = -1;
        while (top < n) {
            i++;
            if (arr[i] != 0) {
                top++;
            } else {
                top += 2;
            }
        }
        int j = n - 1;
        if (top == n + 1) {
            arr[j] = 0;
            j--;
            i--;
        } 
        while (j >= 0) {
            arr[j] = arr[i];
            j--;
            if (arr[i] == 0) {
                arr[j] = arr[i];
                j--;
            } 
            i--;
        }
    }
}

*/
