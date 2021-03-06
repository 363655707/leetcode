package p232;

import java.util.Stack;

public class V1 {
	
	Stack<Integer> s1 = new Stack<>();  //push 
	Stack<Integer> s2 = new Stack<>();  //pop
	
	public void push(int x) {
		s1.push(x);
	}

	// Removes the element from in front of queue.
	public void pop() {
		if(s2.isEmpty()){
			this.moveData();
		}
		s2.pop();
	}

	// Get the front element.
	public int peek() {
		if(s2.empty()){
			this.moveData();
		}
		return s2.peek();
	}

	// Return whether the queue is empty.
	public boolean empty() {
		return s1.isEmpty() && s2.isEmpty();
	}
	
	private void moveData(){
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
	}
}
