/*
//本人
class RecentCounter {

    List<Integer> list;
    public RecentCounter() {
        list = new ArrayList<>();
    }
    
    public int ping(int t) {
        int left = t - 3000, right = t,count = 0;
        list.add(t);
        for(int i = 0; i < list.size(); i++)
        {
            int num = list.get(i);
            if(left <= num && num <= right)
            {
                count++;
            }
        }
        return count;
    }
}
*/

class RecentCounter {
    Queue<Integer> queue;

    public RecentCounter() {
        queue = new ArrayDeque<Integer>();
    }

    public int ping(int t) {
        queue.offer(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
