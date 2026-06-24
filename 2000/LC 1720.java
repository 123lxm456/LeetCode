class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int[] arr = new int[n+1];
        arr[0] = first;
        int num = first;
        for(int i = 1; i < n + 1; i++){
            arr[i] = encoded[i - 1]^num;
            num = arr[i];
        }
        return arr;
    }
}

/**
class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length + 1;
        int[] arr = new int[n];
        arr[0] = first;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] ^ encoded[i - 1];
        }
        return arr;
    }
}

*/
