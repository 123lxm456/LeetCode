class Solution {
    public String reformatNumber(String number) {
        List<Character> list = new ArrayList<>();
        for(char num:number.toCharArray()){
            if(num >= '0' && num <= '9'){
                list.add(num);
            }
        }
        int n = list.size();
        StringBuilder str = new StringBuilder();
        if(n % 3 != 1){
            for(int i = 0; i < n; i++){
                str.append(list.get(i));
                if((i + 1) % 3 == 0 && i != (n - 1)){
                    str.append("-");
                }
            }
        }
        else{
            for(int i = 0; i < n - 4; i++){
                str.append(list.get(i));
                if((i + 1) % 3 == 0 && i != (n - 1)){
                    str.append("-");
                }
            }
            str.append(list.get(n - 4));
            str.append(list.get(n - 3));
            str.append("-");
            str.append(list.get(n - 2));
            str.append(list.get(n - 1));
        }
        return str.toString();
    }
}


/**
class Solution {
    public String reformatNumber(String number) {
        StringBuilder digits = new StringBuilder();
        for (int i = 0; i < number.length(); ++i) {
            char ch = number.charAt(i);
            if (Character.isDigit(ch)) {
                digits.append(ch);
            }
        }

        int n = digits.length();
        int pt = 0;
        StringBuilder ans = new StringBuilder();
        while (n > 0) {
            if (n > 4) {
                ans.append(digits.substring(pt, pt + 3) + "-");
                pt += 3;
                n -= 3;
            } else {
                if (n == 4) {
                    ans.append(digits.substring(pt, pt + 2) + "-" + digits.substring(pt + 2, pt + 4));
                } else {
                    ans.append(digits.substring(pt, pt + n));
                }
                break;
            }
        }
        return ans.toString();
    }
}

*/
