class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        int n = s1.length();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                list.add(i);
            }
        }
        if(list.size() == 2){
            int a = list.get(0);
            int b = list.get(1);
            return s1.charAt(a) == s2.charAt(b) && s1.charAt(b) == s2.charAt(a);
        }
        return false;
    }
}
