class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        int n = s.length();
        int start = 0, end = 0;
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 1; i < n; i++)
        {
            if(s.charAt(i) != s.charAt(i - 1))
            {
                if((end - start + 1) >= 3)
                {
                    List<Integer> list1 = new ArrayList<>();
                    list1.add(start);
                    list1.add(end);
                    list.add(list1);
                }
                start = end = i;
            }
            else
            {
                end++;
            }
        }
        if((end - start + 1) >= 3)
        {
            List<Integer> list1 = new ArrayList<>();
            list1.add(start);
            list1.add(end);
            list.add(list1);
        }
        return list;
    }
}
/**
//最优
class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        int n = s.length();
        int num = 1;
        for (int i = 0; i < n; i++) {
            if (i == n - 1 || s.charAt(i) != s.charAt(i + 1)) {
                if (num >= 3) {
                    ret.add(Arrays.asList(i - num + 1, i));
                }
                num = 1;
            } else {
                num++;
            }
        }
        return ret;
    }
}
*/
