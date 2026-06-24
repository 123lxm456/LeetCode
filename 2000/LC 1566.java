class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        int length = arr.length;
        if(m * k > length){
            return false;
        }
        for(int i = 0; i <= length - m * k; i++){
            boolean found = true;
            for(int j = 1; j < k; j++){
                for(int t = 0; t < m; t++){
                    if(arr[i + t] != arr[i + j * m + t]){
                        found = false;
                        break;
                    }
                }
                if(!found){
                    break;
                }
            }
            if(found){
                return true;
            }
        }
        return false;
    }
}

/**
class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        int n = arr.length;
        for (int l = 0; l <= n - m * k; ++l) {
            int offset;
            for (offset = 0; offset < m * k; ++offset) {
                if (arr[l + offset] != arr[l + offset % m]) {
                    break;
                }
            }
            if (offset == m * k) {
                return true;
            }
        }
        return false;
    }
}
*/