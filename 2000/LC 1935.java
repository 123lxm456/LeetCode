class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] nums = text.split(" ");
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(char s:brokenLetters.toCharArray()){
            set.add(s);
        }
        for(String num:nums){
            boolean find = true;
            for(int i = 0; i < num.length(); i++){
                if(set.contains(num.charAt(i))){
                    find = false;
                    break;
                }
            }
            if(find){
                count++;
            }
        }
        return count;
    }
}
