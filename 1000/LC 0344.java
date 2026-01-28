class Solution {
    public void reverseString(char[] s) {
        char temp;
        int n = s.length;
        for(int i = 0; i < n / 2; i++)
        {
            temp = s[i];
            s[i] = s[n - i - 1];
            s[n - i - 1] = temp;
        }
    }
}
/**
class Solution {
public:
    void reverseString(vector<char>& s) {
        int n = s.size();
        for (int left = 0, right = n - 1; left < right; ++left, --right) {
            swap(s[left], s[right]);
        }
    }
};
 */