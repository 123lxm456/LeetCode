class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < logs.length; i++){
            String cur = logs[i];
            if(cur.equals("../")){
                if(stack.size() >= 1){
                    stack.pop();
                }
            }
            else if(cur.equals("./")){
                continue;
            }
            else{
                stack.push(cur);
            }
        }
        return stack.size();
    }
}

/**
//上面的虽然交上去是对的，但是应该存在bug
class Solution {
    public int minOperations(String[] logs) {
        int depth = 0;
        for (String log : logs) {
            if ("./".equals(log)) {
                continue;
            } else if ("../".equals(log)) {
                if (depth > 0) {
                    depth--;
                }
            } else {
                depth++;
            }
        }
        return depth;
    }
}

*/
