class Solution {
    public int[] constructRectangle(int area) {
        int W = 1, L = area / W;
        int min = L - W;
        int w = W, l = L;
        if(area == 1)
        {
            return new int[]{1,1};
        }
        while(w <= l)
        {
            int sub = l - w;
            if (sub < min)
            {
                L = l;
                W = w;
            }
            w++;
            while(area % w != 0)
            {
                w++;
            }
            l = area / w;
        }
        return new int[]{L,W};
    }
}
/**
class Solution {
    public int[] constructRectangle(int area) {
        int w = (int) Math.sqrt(area);
        while (area % w != 0) {
            --w;
        }
        return new int[]{area / w, w};
    }
}

 */