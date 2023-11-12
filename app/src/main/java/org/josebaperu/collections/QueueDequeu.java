package org.josebaperu.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDequeu {
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(3);
        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();
    }

}
class MyStack {
    Queue<Integer> deque;

    public MyStack() {
        deque =  new LinkedList<>();
    }

    public void push(int x) {
        deque.add(x);
        for (int i = 0; i < deque.size() - 1; i++) {
            deque.add(deque.poll());
        }
    }

    public int pop() {
        return deque.poll();

    }

    public int top() {
        return deque.peek();
    }

    public boolean empty() {
        return  deque.isEmpty();
    }
}
