class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set = new HashSet<>();
        int x = 0, y = 0;
        String pre = x + "," + y;
        set.add(pre);
        for(char arr:path.toCharArray()){
            if(arr == 'N'){
                y++;
            }
            else if(arr == 'S'){
                y--;
            }
            else if(arr == 'E'){
                x++;
            }
            else{
                x--;
            }
            pre = x + "," + y;
            if(set.contains(pre)){
                return true;
            }
            else{
                set.add(pre);
            }
        }
        return false;
    }
}
