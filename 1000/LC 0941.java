class Solution {
    public boolean validMountainArray(int[] arr) {
        int temp = arr[0];
        boolean ismid = false;
        if(arr.length == 1)
        {
            return false;
        }
        if(arr[1] <= arr[0])
        {
            return false;
        }
        for(int i = 1; i < arr.length; i++)
        {
            int num = arr[i];
            if(!ismid && num > temp)
            {
                temp = num;
            }
            else if(!ismid && num == temp)
            {
                return false;
            }
            else if(!ismid && num < temp)
            {
                ismid = true;
                temp = num;
            }
            else
            {
                if(num >= temp)
                {
                    return false;
                }
                else
                {
                    temp = num;
                }
            }
        }
        if(ismid == false)
        {
            return false;
        }
        return true;
    }
}
/**
class Solution {
    public boolean validMountainArray(int[] arr) {
        int N = arr.length;
        int i = 0;

        // 递增扫描
        while (i + 1 < N && arr[i] < arr[i + 1]) {
            i++;
        }

        // 最高点不能是数组的第一个位置或最后一个位置
        if (i == 0 || i == N - 1) {
            return false;
        }

        // 递减扫描
        while (i + 1 < N && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == N - 1;
    }
}

*/
