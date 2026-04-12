
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        if(sum % 3 != 0)
        {
            return false;
        }
        int target = sum / 3;
        int cur = 0, count = 0;
        for(int i = 0; i < arr.length-1; i++)
        {
            int num = arr[i];
            cur += num;
            if(cur == target)
            {
                cur = 0;
                count++;
            }
            if(count == 2)
            {
                return true;
            }
        }
        return false;
    }
}
/*
//最优
class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int s = 0;
        for (int num : A) {
            s += num;
        }
        if (s % 3 != 0) {
            return false;
        }
        int target = s / 3;
        int n = A.length, i = 0, cur = 0;
        while (i < n) {
            cur += A[i];
            if (cur == target) {
                break;
            }
            ++i;
        }
        if (cur != target) {
            return false;
        }
        int j = i + 1;
        while (j + 1 < n) {  // 需要满足最后一个数组非空
            cur += A[j];
            if (cur == target * 2) {
                return true;
            }
            ++j;
        }
        return false;
    }
}
*/