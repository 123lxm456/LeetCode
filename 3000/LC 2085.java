class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        // 统计 words1 频次
        for (String s : words1) {
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }
        // 统计 words2 频次
        for (String s : words2) {
            map2.put(s, map2.getOrDefault(s, 0) + 1);
        }

        int count = 0;
        // 遍历判断两边都恰好一次
        for (String key : map1.keySet()) {
            if (map1.get(key) == 1 && map2.getOrDefault(key, 0) == 1) {
                count++;
            }
        }
        return count;
    }
}
