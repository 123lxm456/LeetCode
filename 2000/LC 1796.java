class Solution {
    public int secondHighest(String s) {
        int[] nums = new int[10];
        for(char str:s.toCharArray()){
            if(str >= '0' && str <= '9'){
                nums[str -'0']++;
            }
        }
        boolean find = false;
        for(int i = 9; i >= 0; i--){
            if(!find && nums[i] > 0){
                find = true;
            }
            else if(find && nums[i] > 0){
                return i;
            }
        }
        return -1;
    }
}

/**
class Solution {
    public int secondHighest(String s) {
        int first = -1, second = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int num = c - '0';
                if (num > first) {
                    second = first;
                    first = num;
                } else if (num < first && num > second) {
                    second = num;
                }
            }
        }
        return second;
    }
}

*/