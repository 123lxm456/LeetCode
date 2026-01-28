class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] prescore = new int[n];
        Map<Integer,String> map= new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            prescore[i] = score[i];
        }
        Arrays.sort(score);
        for(int i = 0; i < n; i++)
        {
            if(i == n - 1)
            {
                map.put(score[i],"Gold Medal");
            }
            else if(i == n - 2)
            {
                map.put(score[i],"Silver Medal");
            }
            else if(i == n - 3)
            {
                map.put(score[i],"Bronze Medal");
            }
            else
            {
                map.put(score[i], String.valueOf(n - i));
            }
        }
        String[] str = new String[n];
        for(int i = 0; i < n; i++)
        {
            str[i] = map.get(prescore[i]);
        }
        return str;
    }
}
