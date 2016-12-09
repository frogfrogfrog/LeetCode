package easy;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    class MyQueue {
        private Stack<Integer> stack = new Stack<Integer>();

        // Push element x to the back of queue.
        public void push(int x) {
            stack.push(x);
        }

        // Removes the element from in front of queue.
        public void pop() {
            Stack<Integer> tmp = new Stack<Integer>();
            while (!stack.isEmpty()) {
                tmp.push(stack.pop());
            }
            tmp.pop();
            while (!tmp.isEmpty()) {
                stack.push(tmp.pop());
            }
        }

        // Get the front element.
        public int peek() {
            Stack<Integer> tmp = new Stack<Integer>();
            while (!stack.isEmpty()) {
                tmp.push(stack.pop());
            }
            int res = tmp.peek();
            while (!tmp.isEmpty()) {
                stack.push(tmp.pop());
            }
            return res;
        }

        // Return whether the queue is empty.
        public boolean empty() {
            return stack.isEmpty();
        }
    }
}
