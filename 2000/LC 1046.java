class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = Arrays.stream(stones).boxed().collect(Collectors.toList());
        return fun(list);
    }
    public int fun(List<Integer> list)
    {
        int n = list.size();
        if(n == 1)
        {
            return list.get(0);
        }
        if(n == 0)
        {
            return 0;
        }
        list.sort(null);
        int max = list.get(n - 1);
        int max2 = list.get(n - 2);
        list.remove(n - 1);
        list.remove(n - 2);
        int sub = Math.abs(max - max2);
        if(sub != 0)
        {
            list.add(sub);
        }
        return fun(list);
    }
}

/**
//最优
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);
        for (int stone : stones) {
            pq.offer(stone);
        }

        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            if (a > b) {
                pq.offer(a - b);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}

*/
