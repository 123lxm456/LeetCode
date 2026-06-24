class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max = releaseTimes[0];
        for(int i = 1; i < releaseTimes.length; i++){
            max = Math.max(max, releaseTimes[i] - releaseTimes[i - 1]);
        }
        char maxstr = 'a' - 1;
        if(max == releaseTimes[0]){
            maxstr = keysPressed.charAt(0);
        }
        for(int i = 1; i < releaseTimes.length; i++){
            if(releaseTimes[i] - releaseTimes[i - 1] == max){
                char curstr = keysPressed.charAt(i);
                if(curstr > maxstr){
                    maxstr = curstr;
                }
            }
        }
        return maxstr;
    }
}

/**
//最优
class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int n = releaseTimes.length;
        char ans = keysPressed.charAt(0);
        int maxTime = releaseTimes[0];
        for (int i = 1; i < n; i++) {
            char key = keysPressed.charAt(i);
            int time = releaseTimes[i] - releaseTimes[i - 1];
            if (time > maxTime || (time == maxTime && key > ans)) {
                ans = key;
                maxTime = time;
            }
        }
        return ans;
    }
}

*/
