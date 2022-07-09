package com.leetCodeSolution.solutions150to200.solutions155;

import java.util.ArrayList;
import java.util.List;

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
public class MinStack {

    private List<Integer> vals;

    public MinStack() {
        this.vals = new ArrayList<Integer>();
    }

    public void push(int val) {
        this.vals.add(val);
    }

    public void pop() {
        this.vals.remove(vals.size()-1);
    }

    public int top() {
        return vals.get(vals.size()-1);
    }

    public int getMin() {
        return vals.stream()
                   .mapToInt(x -> x)
                   .min()
                   .orElse(0);
    }
}
