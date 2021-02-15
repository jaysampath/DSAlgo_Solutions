class MyQueue {
    
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    /** Initialize your data structure here. */
    public MyQueue() {
        
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        s2.clear();
        while(s1.size()!=0)
            s2.push(s1.pop());
        s2.push(x);
        while(s2.size()!=0)
            s1.push(s2.pop());
        
        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        
        if(s1.size() == 0)
            return 0;
        
        int x = s1.pop();
        return x;
    }
    
    /** Get the front element. */
    public int peek() {
     
        return s1.peek();
        
        
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
       return s1.isEmpty(); 
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
