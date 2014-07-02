package Questions;

import java.util.*;

public class Three5_MyQueue_2Stacks {
	// implement MyQueue class which implements a queue using 2 stacks
	static class MyQueue {
		Stack<Object> s1;
		Stack<Object> s2;

		public MyQueue() {
			s1 = new Stack<Object>();
			s2 = new Stack<Object>();
		}
		void enQueue(Object item) {
			s1.push(item);
		}

		Object deQueue() {
			if (s1.isEmpty() && s2.isEmpty()) return null;

			if (s2.isEmpty()) {
				copyToS2();
			}
			return s2.pop();
		}

		void copyToS2() {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
	}

	public static void main(String[] args) {
		MyQueue my = new MyQueue();
		my.enQueue(1);
		my.enQueue(2);
		my.enQueue(3);

		System.out.println(my.deQueue());
		System.out.println(my.deQueue());

		my.enQueue(4);
		System.out.println(my.deQueue());
		System.out.println(my.deQueue());
	}

}
