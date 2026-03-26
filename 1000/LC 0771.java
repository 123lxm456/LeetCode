class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < jewels.length(); i++)
        {
            char x = jewels.charAt(i);
            set.add(x);
        }
        int count = 0;
        for(int i = 0; i < stones.length(); i++)
        {
            char x = stones.charAt(i);
            if(set.contains(x))
            {
                count++;
            }
        }
        return count;
    }
}

/**
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int jewelsCount = 0;
        int jewelsLength = jewels.length(), stonesLength = stones.length();
        for (int i = 0; i < stonesLength; i++) {
            char stone = stones.charAt(i);
            for (int j = 0; j < jewelsLength; j++) {
                char jewel = jewels.charAt(j);
                if (stone == jewel) {
                    jewelsCount++;
                    break;
                }
            }
        }
        return jewelsCount;
    }
}
*/