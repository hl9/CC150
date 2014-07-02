package Questions;
import java.util.Stack;

public class Three2_StackWithMin {
	// design a stack which, in addition to push and pop, als has a function min which returns the minimum element.
	// push, pop and min shoudl all operate in O(1) time.

	class StackWithMin extends Stack<Integer> {
		Stack<Integer> s2;

		public StackWithMin() {
			super();
			s2 = new Stack<Integer>();
		}

		void push(int n) {
			push(n);
			if (min() >= n) {
				s2.push(n);
			}
		}

		public Integer pop() {
			if (isEmpty()) {
				return Integer.MAX_VALUE;
			}

			Integer value = super.pop();
			if (value == min()) {
				s2.pop();
			}

			return value;
		}

		Integer min() {
			if (isEmpty()) {
				return Integer.MAX_VALUE;
			}
			return s2.peek();
		}
	}
}
