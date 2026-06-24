class Solution {
    public String interpret(String command) {
        int n = command.length(), i = 0;
        StringBuilder str = new StringBuilder();
        while(i < n){
            if(command.substring(i,i + 1).equals("G")){
                str.append("G");
                i++;
            }
            else if(command.substring(i,i + 2).equals("()")){
                str.append("o");
                i += 2;
            }
            else{
                str.append("al");
                i += 4;
            }
        }
        return str.toString();
    }
}

/**
class Solution {
    public String interpret(String command) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                res.append("G");
            } else if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    res.append("o");
                } else {
                    res.append("al");
                }
            }
        }
        return res.toString();
    }
}
*/
