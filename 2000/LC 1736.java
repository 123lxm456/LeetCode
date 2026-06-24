class Solution {
    public String maximumTime(String time) {
        char[] str = time.toCharArray();
        if(str[0] == '?'){
            if(str[1] == '?' || str[1] <= '3'){
                str[0] = '2';
            }
            else{
                str[0] = '1';
            }
        }

        if(str[1] == '?'){
            if(str[0] == '?' || str[0] == '2'){  //这里可以不用判断str[0] == '?'，因为上一步已经修改为'2'了
                str[1] = '3';
            }
            else{
                str[1] = '9';
            }
        }

        if(str[3] == '?'){
            str[3] = '5';
        }
        if(str[4] == '?'){
            str[4] = '9';
        }
        return new String(str);
    }
}
