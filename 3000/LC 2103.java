class Solution {
    public int countPoints(String rings) {
        char[] arr = rings.toCharArray();
        int n = arr.length;
        int[] nums = new int[10];

        for(int i = 0; i < (n - 1); i = i + 2){
            char s = arr[i];
            int m = arr[i + 1] - '0';
            if(s == 'R'){
                nums[m] = nums[m] | 1;
            }
            else if(s == 'G'){
                nums[m] = nums[m] | 2;
            }
            else{
                nums[m] = nums[m] | 4;
            }
        }
        int count = 0;
        for(int i = 0; i < 10; i++){
            if(nums[i] == 7){
                count++;
            }
        }
        return count;
    }
}

/**
//困难
方法：位运算（高效）
用一个长度 10 的数组 int[] rod = new int[10]
R → 1(001)
G → 2(010)
B → 4 (100)
每遇到一个颜色，对应杆的数字按位或上对应值；
集齐三色则值等于 1 | 2 | 4 = 7。
*/
