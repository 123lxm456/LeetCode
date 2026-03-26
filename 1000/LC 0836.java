class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if(rec1[2] <= rec2[0] || rec1[0] >= rec2[2] || rec1[1] >= rec2[3]  || rec1[3] <= rec2[1])
        {
            return false;
        }
        return true;
    }
}

/**
//矩形 rec1 和 rec2 的水平边投影到 x 轴上的线段分别为 (rec1[0], rec1[2]) 和 (rec2[0], rec2[2])。
//根据数学知识我们可以知道，当 min(rec1[2], rec2[2]) > max(rec1[0], rec2[0]) 时，这两条线段有交集。
//对于矩形 rec1 和 rec2 的竖直边投影到 y 轴上的线段，同理可以得到，当 min(rec1[3], rec2[3]) > max(rec1[1], rec2[1]) 时，这两条线段有交集。

class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return (Math.min(rec1[2], rec2[2]) > Math.max(rec1[0], rec2[0]) &&
                Math.min(rec1[3], rec2[3]) > Math.max(rec1[1], rec2[1]));
    }
}

*/
