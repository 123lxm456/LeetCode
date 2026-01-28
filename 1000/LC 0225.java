class MyStack {

    private Queue<Integer> mainQueue;
    private Queue<Integer> helpQueue;

    public MyStack() {
        mainQueue = new LinkedList<>();
        helpQueue = new LinkedList<>();
    }
    
    public void push(int x) {
        mainQueue.offer(x);
    }
    
    public int pop() {
        while(mainQueue.size() > 1)
        {
            helpQueue.offer(mainQueue.poll());
        }
        int top = mainQueue.poll();

        //核心目的是让mainQueue始终指向存储元素的队列，helperQueue作为空队列等待下一次操作。
        Queue<Integer> temp = mainQueue;
        mainQueue = helpQueue;
        helpQueue = temp;
        return top;
    }
    
    public int top() {
        while(mainQueue.size() > 1)
        {
            helpQueue.offer(mainQueue.poll());
        }
        int top = mainQueue.poll();
        helpQueue.offer(top);
        Queue<Integer> temp = mainQueue;
        mainQueue = helpQueue;
        helpQueue = temp;
        return top;
    }
    
    public boolean empty() {
        return mainQueue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */