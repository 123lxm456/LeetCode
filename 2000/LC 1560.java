class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> list = new ArrayList<>();
        int ori = rounds[0], end = rounds[rounds.length - 1];
        if(ori <= end){
            int num = ori;
            while(num <= end){
                list.add(num);
                num++;
            }
        }
        else
        {
            int num = 1;
            while(num <= end){
                list.add(num);
                num++;
            }
            int arr = ori;
            while(arr <= n){
                list.add(arr);
                arr++;
            }
        }
        return list;
    }
}


/**
class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> ret = new ArrayList<Integer>();
        int length = rounds.length;
        int start = rounds[0], end = rounds[length - 1];
        if (start <= end) {
            for (int i = start; i <= end; i++) {
                ret.add(i);
            }
        } else { // 由于题目要求按扇区大小排序，因此我们要将区间分成两部分
            for (int i = 1; i <= end; i++) {
                ret.add(i);
            }
            for (int i = start; i <= n; i++) {
                ret.add(i);
            }
        }
        return ret;
    }
}
*/