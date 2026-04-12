class Solution {
    public boolean isBoomerang(int[][] points) {
        return ((points[1][1] - points[0][1]) * (points[2][0] - points[1][0])) != 
        ((points[1][0] - points[0][0]) * (points[2][1] - points[1][1]));
    }
}

/*
斜率相等则共线
(x2​−x1)/(​y2​−y1)​​=(x3​−x2)/(​y3​−y2)​​    除法存在精度问题
交叉相乘：(y2​−y1​)(x3​−x2​)=(y3​−y2​)(x2​−x1​)
*/