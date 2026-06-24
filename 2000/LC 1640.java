class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, int[]> map = new HashMap<>();
        for(int i = 0; i < pieces.length; i++){
            map.put(pieces[i][0], pieces[i]);
        }
        for(int i = 0; i < arr.length;i++){
            int num = arr[i];
            if(!map.containsKey(num)){
                return false;
            }
            int[] seg = map.get(num);
            for(int j = 0; j < seg.length; j++){
                if(seg[j] != arr[i + j]){
                    return false;
                }
            }
            i = i + seg.length - 1;
        }
        return true;
    }
}
