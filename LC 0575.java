/**
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<Integer>();
        for (int candy : candyType) {
            set.add(candy);
        }
        return Math.min(set.size(), candyType.length / 2);
    }
}
*/
class Solution {
    public int distributeCandies(int[] candyType) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < candyType.length; i++)
        {
            int candy = candyType[i];
            if(map.containsKey(candy))
            {
                map.put(candy,map.get(candy) + 1);
            }
            else
            {
                map.put(candy,1);
            }
        }
        if((candyType.length / 2) <= map.size())
        {
            return candyType.length / 2;
        }
        return map.size();
    }
}
