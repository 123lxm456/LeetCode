class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int i = num.length - 1, carry = 0;
        List<Integer> list = new ArrayList<>();
        while(i >= 0 || k > 0 || carry > 0)
        {
            int digitA = i>=0?num[i]:0;
            int digitB = k % 10;
            int sum = digitA + digitB + carry;
            list.add(sum % 10);
            i--;
            k /= 10;
            carry = sum / 10;
        }
        Collections.reverse(list);
        return list;
    }
}
/**
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<Integer>();
        int n = num.length;
        for (int i = n - 1; i >= 0 || k > 0; --i, k /= 10) {
            if (i >= 0) {
                k += num[i];
            }
            res.add(k % 10);
        }
        Collections.reverse(res);
        return res;
    }
}


*/
