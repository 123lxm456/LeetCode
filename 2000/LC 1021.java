class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0, k = 0;
        StringBuilder str = new StringBuilder();
        String news = "";
        for(char num:s.toCharArray())
        {
            str.append(num);
            k++;
            if(num == '(')
            {
                count++;
            }
            else
            {
                count--;
                if(count == 0)
                {
                    str.deleteCharAt(0);
                    str.deleteCharAt(k-2);//不能写k-1,因为上一行删除了一个元素，str的长度-1；
                    k = 0;
                    news += str.toString();
                    str.setLength(0);
                }
            }
        }
        return news;
    }
}

/**
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuffer res = new StringBuffer();
        Deque<Character> stack = new ArrayDeque<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')') {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                res.append(c);
            }
            if (c == '(') {
                stack.push(c);
            }
        }
        return res.toString();
    }
}
*/

/**
class Solution {
    public String removeOuterParentheses(String s) {
        int level = 0;
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')') {
                level--;
            }
            if (level > 0) {
                res.append(c);
            }
            if (c == '(') {
                level++;
            }
        }
        return res.toString();
    }
}

*/
