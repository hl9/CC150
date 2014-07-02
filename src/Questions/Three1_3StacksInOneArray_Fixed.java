package Questions;

import java.util.EmptyStackException;

public class Three1_3StacksInOneArray_Fixed {
	int stackSize = 100;
	int[] arr = new int[stackSize * 3];
	int[] stackPointer = {-1, -1, -1};
	
	void push(int stackNumber, int t) throws Exception {
		if ((stackPointer[stackNumber] + 1) > stackSize) {
//			throw new FullStackException();
			throw new Exception();
		}
		stackPointer[stackNumber]++;
		arr[topOfStack(stackNumber)] = t;
	}
	
	int pop(int stackNumber) {
		if (isEmpty(stackNumber)) {
			throw new EmptyStackException();
		}
		int n = arr[topOfStack(stackNumber)];
		stackPointer[stackNumber]--;
		return n;		
	}
	
	int peed(int stackNumber) {
		if (isEmpty(stackNumber)) {
			throw new EmptyStackException();
		} 
		return arr[topOfStack(stackNumber)];
	}
	
	boolean isEmpty(int stackNumber) {
		return stackPointer[stackNumber] == -1;
	}
	
	int topOfStack(int stackNumber) {
		return (stackSize * stackNumber + stackPointer[stackNumber]);
	}
}
