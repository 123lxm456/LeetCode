class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0,temp;
        while(k < n)
        {
            nums1[m+k] = nums2[k];
            k++;
        }
        for(int i = 0; i < m+n-1;i++)
        {
            for(int j=0; j<m+n-1-i;j++)
            {
                if(nums1[j] > nums1[j+1])
                {
                    temp = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = temp;
                }
            }
        }
    }
}