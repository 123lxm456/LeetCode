class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] arr = new int[n];
        if(k > 0){
            for(int i = 0; i < n; i++){
                int sum = 0;
                for(int j = i + 1; j <= i + k; j++){
                    int index = (j + n) % n;
                    sum += code[index];
                }
                arr[i] = sum;
            }
        }
        if(k < 0){
            for(int i = 0; i < n; i++){
                int sum = 0;
                for(int j = i - 1; j >= i + k; j--){
                    int index = (j + n) % n;
                    sum += code[index];
                }
                arr[i] = sum;
            }
        }
        return arr;
    }
}
