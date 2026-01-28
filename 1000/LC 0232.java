class MyQueue {
    public Stack<Integer> inStack;
    public Stack<Integer> outStack; 
    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }
    
    public void push(int x) {
        inStack.push(x);
    }
    
   public int pop() {
        // 如果出队栈为空，将入队栈的所有元素转移过来
        if (outStack.isEmpty()) {
            transferElements();
        }
        return outStack.pop();
    }
    
    // 返回队列开头的元素
    public int peek() {
        // 如果出队栈为空，将入队栈的所有元素转移过来
        if (outStack.isEmpty()) {
            transferElements();
        }
        return outStack.peek();
    }
    
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }
    public void transferElements() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */