//困难
class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0, n = word.length();
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        
        for(int i = 0; i <= (n - 5);i++){
            Set<Character> set1 = new HashSet<>();
            for(int j = i; j < n; j++){
                char s = word.charAt(j);
                if(!set.contains(s)){
                    break;
                }
                else{
                    set1.add(s);
                }
                if(set1.size() == 5){
                    count++;
                }
            }
        }
        return count;
    }
}
