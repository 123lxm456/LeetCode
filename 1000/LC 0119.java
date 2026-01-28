class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < (rowIndex+1);i++)
        {
            List<Integer> list1 = new ArrayList<>();
            for(int j = 0; j < (i+1); j++)
            {
                if(j == 0 || j == (i))
                {
                    list1.add(1);
                }
                else
                {
                    list1.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                }
            }
            list.add(list1);
        }
        return list.get(rowIndex);
    }
}
/**
滚动数组的思想:
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> pre = new ArrayList<Integer>();
        for (int i = 0; i <= rowIndex; ++i) {
            List<Integer> cur = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    cur.add(1);
                } else {
                    cur.add(pre.get(j - 1) + pre.get(j));
                }
            }
            pre = cur;
        }
        return pre;
    }
}
 */