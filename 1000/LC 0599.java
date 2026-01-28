class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < list1.length; i++)
        {
            for(int j = 0; j < list2.length; j++)
            {
                if(list1[i].equals(list2[j]))
                {
                    map.put(list1[i],i+j);
                    if((i+j) < min)
                    {
                        min = i+j;
                    }
                }
            }
        }
        List<String> str = new ArrayList<>();
        for(Map.Entry<String,Integer> entry:map.entrySet())
        {
            if(entry.getValue().equals(min))
            {
                str.add(entry.getKey());
            }
        }
        return str.toArray(new String[0]);
    }
}
/**
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> index = new HashMap<String, Integer>();
        for (int i = 0; i < list1.length; i++) {
            index.put(list1[i], i);
        }

        List<String> ret = new ArrayList<String>();
        int indexSum = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            if (index.containsKey(list2[i])) {
                int j = index.get(list2[i]);
                if (i + j < indexSum) {
                    ret.clear();
                    ret.add(list2[i]);
                    indexSum = i + j;
                } else if (i + j == indexSum) {
                    ret.add(list2[i]);
                }
            }
        }
        return ret.toArray(new String[ret.size()]);
    }
}
*/