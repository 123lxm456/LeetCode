class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queuestudent = new LinkedList<>();
        Queue<Integer> queuesand = new LinkedList<>();
        int m = students.length, n = sandwiches.length;
        for(int num:students){
            queuestudent.add(num);
        }
        for(int num:sandwiches){
            queuesand.add(num);
        }
        int count = 0;
        while(queuestudent.size() != 0 && count <= queuestudent.size()){
            if(queuestudent.peek() != queuesand.peek()){
                int student = queuestudent.poll();
                queuestudent.add(student);
                count++;
            }
            else{
                queuestudent.poll();
                queuesand.poll();
                count = 0;
            }
        }
        return queuestudent.size();
    }
}

/**
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int s1 = Arrays.stream(students).sum();
        int s0 = students.length - s1;
        for (int i = 0; i < sandwiches.length; i++) {
            if (sandwiches[i] == 0 && s0 > 0) {
                s0--;
            } else if (sandwiches[i] == 1 && s1 > 0) {
                s1--;
            } else {
                break;
            }
        }
        return s0 + s1;
    }
}
*/
