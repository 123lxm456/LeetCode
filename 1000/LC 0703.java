class KthLargest {
    PriorityQueue <Integer> pq;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>();
        for(int num:nums)
        {
            add(num);
        }

    }
    
    public int add(int val) {
        pq.offer(val);
        // 把pq.offer(val)换成pq.add(val)，结果完全一样
        if(pq.size() > k)
        {
            pq.poll();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
