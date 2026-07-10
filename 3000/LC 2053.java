
class Solution {
    public String kthDistinct(String[] arr, int k) {
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(String s:arr){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for(String s:arr){
            if(map.get(s) == 1){
                list.add(s);
            }
        }
        if(list.size() < k){
            return "";
        }
        return list.get(k - 1);
    }
}
/*
//最优
class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer>map=new HashMap<>();
        for(String i:arr) {
        	map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(String i:arr) {
        	if(map.get(i)==1) {
        		k--;
        		if(k==0)return i;
        	}
        }
        return "";
    }
}
*/