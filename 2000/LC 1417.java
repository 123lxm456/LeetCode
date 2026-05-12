class Solution {
    public String reformat(String s) {
        int n = s.length();
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        for(char num:s.toCharArray()){
            if(num >= 'a' && num <= 'z'){
                list1.add(num);
            }
            else
            {
                list2.add(num);
            }
        }
        /*
        //这段代码是错误的
        if(list1.size() != (n/2) && list1.size() != (n/2+1))
        {
            return "";
        }
        */
        if(Math.abs(list1.size() - list2.size()) > 1){
            return "";
        }
        StringBuilder str = new StringBuilder();
        if(n % 2 == 0){
            for(int i = 0; i < n/2; i++){
                str.append(list1.get(i));
                str.append(list2.get(i));
            }
        }
        else if(list1.size() == n / 2){
            str.append(list2.get(0));
            for(int i = 0; i < n/2; i++){
                str.append(list1.get(i));
                str.append(list2.get(i+1));
            }
        }
        else{
            str.append(list1.get(0));
            for(int i = 0; i < n/2; i++){
                str.append(list2.get(i));
                str.append(list1.get(i+1));
            }
        }
        return str.toString();
    }
}
