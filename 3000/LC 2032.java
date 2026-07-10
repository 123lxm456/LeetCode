class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        for(int num:nums2){
            set2.add(num);
            if(set1.contains(num)){
                set.add(num);
            }
        }
        for(int num:nums3){
            if(set1.contains(num) || set2.contains(num)){
                set.add(num);
            }
        }
        List<Integer> list = new ArrayList();
        list.addAll(set);
        return list;
    }
}