package Questions;

import java.util.*;

public class Three3_SetOfStacks {
	// SetOfStacks
	// SetOfStacks

	class SetOfStacks {
		ArrayList<Stack<Integer>> stacks;
		int maxLength = 10;

		public SetOfStacks() {
			stacks = new ArrayList<Stack<Integer>>();
		}
		
		public Stack<Integer> getLastStack() {
			if (stacks.size() == 0) return null;
			return stacks.get(stacks.size()-1);
		}

		void push(Integer n) {
			Stack<Integer> stack = getLastStack();
			// empty stack
			if ((stacks.size() == 0) || (stack.size() == maxLength)) {
				Stack<Integer> s = new Stack<Integer>();
				stacks.add(s);
				s.push(n);
			} else {
				stack.push(n);
			}
		}

		Integer pop() {
			Stack<Integer> stack = getLastStack();
			if ((stacks.size() == 0) || stacks.get(0).size() == 0) {
				return Integer.MAX_VALUE;
			}

			Integer n = stack.pop();
			if (stack.size() == 0) {
				stacks.remove(stacks.size()-1);
			}

			return n;
		}
	}
}