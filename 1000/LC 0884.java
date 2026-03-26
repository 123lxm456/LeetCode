//将set改为map
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        List<String> list = new ArrayList<>();
        fun(map1,s1);
        fun(map2,s2);
        for(Map.Entry<String,Integer> entry:map1.entrySet())
        {
            if(entry.getValue() < 2 && !map2.containsKey(entry.getKey()))
            {
                list.add(entry.getKey());
            }
        }
        for(Map.Entry<String,Integer> entry:map2.entrySet())
        {
            if(entry.getValue() < 2 && !map1.containsKey(entry.getKey()))
            {
                list.add(entry.getKey());
            }
        }
        return list.toArray(new String[0]);
    }
    public void fun(Map<String, Integer> map, String s)
    {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        {
            char x = s.charAt(i);
            if(x != ' ')
            {
                str.append(x);
            }
            else
            {
                String newstr = str.toString();
                str.setLength(0);
                if(map.containsKey(newstr))
                {
                    map.put(newstr,map.get(newstr) + 1);
                }
                else
                {
                    map.put(newstr,1);
                }
            }
        }
        String newstr = str.toString();
        if(map.containsKey(newstr))
        {
            map.put(newstr,map.get(newstr) + 1);
        }
        else
        {
            map.put(newstr,1);
        }
    }
}
/**
//等价于找出：在两个句子中一共只出现一次的单词。
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> freq = new HashMap<String, Integer>();
        insert(s1, freq);
        insert(s2, freq);

        List<String> ans = new ArrayList<String>();
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                ans.add(entry.getKey());
            }
        }
        return ans.toArray(new String[0]);
    }

    public void insert(String s, Map<String, Integer> freq) {
        String[] arr = s.split(" ");
        for (String word : arr) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
    }
}
*/
