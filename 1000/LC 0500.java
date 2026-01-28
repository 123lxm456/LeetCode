class Solution {
    public String[] findWords(String[] words) {
        // 1. 建立字母到行号的映射（小写字母）
        int[] rowMap = new int[26]; // 下标对应a-z，值对应行号（1/2/3）
        // 第一行：qwertyuiop
        String row1 = "qwertyuiop";
        for (char c : row1.toCharArray()) {
            rowMap[c - 'a'] = 1;
        }
        // 第二行：asdfghjkl
        String row2 = "asdfghjkl";
        for (char c : row2.toCharArray()) {
            rowMap[c - 'a'] = 2;
        }
        // 第三行：zxcvbnm
        String row3 = "zxcvbnm";
        for (char c : row3.toCharArray()) {
            rowMap[c - 'a'] = 3;
        }

        // 2. 遍历单词，筛选符合条件的
        List<String> resultList = new ArrayList<>();
        for (String word : words) {
            if (word.isEmpty()) { // 空字符串直接跳过
                continue;
            }
            // 取第一个字母的行号（转小写）
            char firstChar = Character.toLowerCase(word.charAt(0));
            int targetRow = rowMap[firstChar - 'a'];
            boolean isSameRow = true;
            
            // 检查所有字母是否和第一个字母同行了
            for (char c : word.toCharArray()) {
                char lowerC = Character.toLowerCase(c);
                if (rowMap[lowerC - 'a'] != targetRow) {
                    isSameRow = false;
                    break;
                }
            }
            
            if (isSameRow) {
                resultList.add(word);
            }
        }

        // 3. 转换为数组返回
        return resultList.toArray(new String[0]);
    }
}