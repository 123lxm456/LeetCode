class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr = new char[indices.length];
        int i = 0;
        for(char num:s.toCharArray()){
            arr[indices[i++]] = num;
        }
        return new String(arr);
    }
}
