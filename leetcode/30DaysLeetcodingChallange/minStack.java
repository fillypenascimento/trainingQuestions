import java.util.Stack;

// solution avoiding usage of Stack structure, built MinStackNode class
class MinStack {

    private MinStackNode myStackTop;
    
    /** initialize your data structure here. */
    public void MinStack() {
        myStackTop = null;
    }
    
    public void push(int x) {
        MinStackNode newNode = new MinStackNode(x);
        newNode.next = myStackTop;

        if(myStackTop == null)
            newNode.min = x;
        else {
            if(x < myStackTop.min)
                newNode.min = x;
            else
                newNode.min = myStackTop.min;
        }

        myStackTop = newNode;    
    }
    
    public void pop() {
        if(this.myStackTop == null){
            System.out.println("Empty stack");
            return;
        }
        this.myStackTop = this.myStackTop.next;
    }
    
    public int top() {
        return this.myStackTop.value;
    }
    
    public int getMin() {
        return this.myStackTop.min;
    }
}

public class MinStackNode {
    int value;
    int min;
    MinStackNode next;

    public MinStackNode(int value) {
        this.value = value;
        this.min = Integer.MAX_VALUE;
        this.next = null;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */