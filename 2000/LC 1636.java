class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        Collections.sort(list, (a, b)->{
            return map.get(a) != map.get(b) ? map.get(a) - map.get(b): b - a;
        });
        int i = 0;
        for(int num:list){
            nums[i++] = num;
        }
        return nums;
    }
}
//较难
