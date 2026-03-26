class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n/2; j++)
            {
                int temp = image[i][j];
                image[i][j] = image[i][n - j - 1];
                image[i][n - j - 1] = temp;
            }
            for(int j = 0; j < n; j++)
            {
                if(image[i][j] == 0)
                {
                    image[i][j] = 1;
                }
                else
                {
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}
/**
//image[i][left]=image[i][right] 的情况。在进行水平翻转和反转之后，image[i][left] 和 image[i][right] 的元素值都发生了改变，即元素值被反转。
//image[i][left]!=image[i][right] 的情况。在进行水平翻转和反转之后，image[i][left] 和 image[i][right] 的元素值都发生了两次改变，恢复原状。
//如果 n 是奇数，则上述操作结束时，left 和 right 的值相等，都指向第 i 行的中间元素，此时需要对中间元素的值进行反转。
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                if (image[i][left] == image[i][right]) {
                    image[i][left] ^= 1;
                    image[i][right] ^= 1;
                }
                left++;
                right--;
            }
            if (left == right) {
                image[i][left] ^= 1;
            }
        }
        return image;
    }
}
*/
