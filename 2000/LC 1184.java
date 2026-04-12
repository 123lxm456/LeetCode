
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum = Arrays.stream(distance).sum();
        int num = 0, a = start, b = destination;
        if(start > destination)
        {
            a = destination;
            b = start;
        }
        for(int i = a;i < b; i++)
        {
            num += distance[i];
        }
        return Math.min(num, sum - num);
    }
}

/*
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < distance.length; i++) {
            if (i >= start && i < destination) {
                sum1 += distance[i];
            } else {
                sum2 += distance[i];
            }
        }
        return Math.min(sum1, sum2);
    }
}
*/
