/*
class Solution {
    public int maximumPopulation(int[][] logs) {
        int n = logs.length;
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(logs, (a, b)->{
            return a[1] - b[1];   
        });
        int log = logs[0][0];
        while(log <= logs[n - 1][1]){
            for(int j = 0; j < n; j++){
                if(log <= logs[j][1] - 1 && log >= logs[j][0]){
                    map.put(log, map.getOrDefault(log, 0) + 1);
                }
            }
            log++;
        }
        int minyear = 2050, maxcount = 0;
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            int year = entry.getKey();
            int count = entry.getValue();
            if(count > maxcount){
                minyear = year;
                maxcount = count;
            }
            else if(count == maxcount){
                minyear = Math.min(minyear, year);
            }
        }
        return minyear;
    }
}
*/

//上面代码有bug
class Solution {
    public int maximumPopulation(int[][] logs) {
        // 年份范围：1950 ~ 2050 共101年
        int[] diff = new int[101];
        for (int[] p : logs) {
            int birth = p[0] - 1950;
            int death = p[1] - 1950;
            diff[birth]++;
            diff[death]--;
        }
        int maxPop = diff[0];
        int cur = diff[0];
        int ans = 1950;
        for (int i = 1; i < 101; i++) {
            cur += diff[i];
            // 只有人口更大才更新，同人口保留更早年份
            if (cur > maxPop) {
                maxPop = cur;
                ans = 1950 + i;
            }
        }
        return ans;
    }
}

