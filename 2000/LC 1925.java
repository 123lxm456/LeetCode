class Solution {
    public int countTriples(int n) {
        int count = 0;
        while(n >= 1){
            for(int i = 1; i < n; i++){
                for(int j = 1; j < n; j++){
                    if(i * i + j * j == n * n){
                        count++;
                    }
                }
            }
            n--;
        }
        return count;
    }
}
