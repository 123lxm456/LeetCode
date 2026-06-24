
class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int i = lowLimit; i <= highLimit; i++){
            int x = SUM(i);
            map.put(x, map.getOrDefault(x,0) + 1);
            max = Math.max(max, map.get(x));
        }
        return max;
    }
    public int SUM(int i){
        int total = 0;
        while(i != 0){
            total += (i % 10);
            i /= 10;
        }
        return total;
    }
}

/*
class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        int res = 0;
        for (int i = lowLimit; i <= highLimit; i++) {
            int box = 0, x = i;
            while (x != 0) {
                box += x % 10;
                x /= 10;
            }
            count.put(box, count.getOrDefault(box, 0) + 1);
            res = Math.max(res, count.get(box));
        }
        return res;
    }
}
*/