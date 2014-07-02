package Questions;

import java.util.Arrays;

public class Three1_3StacksInOneArray_Flexible {
	public static class StackData {
		static int start;
		static int pointer;
		static int capacity;
		static int size;
		
		public StackData(int s, int c) {
			start = s;
			pointer = start - 1;
			capacity = c;
			size = 0;
		}
		public static boolean isWithinStack(int index, int total_size) {
			if (start <= index && index < start+capacity) {
				return true;
			} else if (start+capacity > total_size && index < (start+capacity)%total_size) {
				return true;
			}
			return false;
		}
	}
	
	static int number_of_stacks = 3;
	static int default_size = 4;
	static int total_size = number_of_stacks * default_size;
	static StackData[] stacks = {new StackData(0, default_size),
		new StackData(default_size, default_size),
		new StackData(default_size * 2, default_size)
	};
	static int buffer[] = new int[total_size];
		
	public static int totalSize() {
		return stacks[0].size + stacks[1].size + stacks[2].size;
	}
	
	public static int prevElement(int index) {
		if (index == 0) return total_size - 1;
		else return index - 1;
	}
	
	public static int nextElement(int index) {
		if (index+1 == total_size) return 0;
		else return index+1;
	}
	
	public static void shift(int stackNumber) {
		StackData stack = stacks[stackNumber];
		
		if (stack.size >= stack.capacity) {
			shift((stackNumber+1)%number_of_stacks);
			stack.capacity++;
		}
		
		//shift elements in reverse order
		for (int i = (stack.start + stack.capacity -1) % total_size; stack.isWithinStack(i, total_size);
				i = prevElement(i)) {
			buffer[i] = buffer[prevElement(i)];
		}
		buffer[stack.start] = 0;
		stack.start = nextElement(stack.start);
		stack.pointer = nextElement(stack.pointer);
		stack.capacity--;
	
	}
	
	public static void expand(int stackNumber) {
		shift((stackNumber+1)%number_of_stacks);
		stacks[stackNumber].capacity++;
	}
	
	public static void push(int stackNumber, int n) throws Exception {
		if (totalSize() >= total_size) {
			throw new Exception("Buffer is completely full");
		}
		
		StackData stack = stacks[stackNumber];
		if (stack.size >= stack.capacity ) {
			// shift next few arrays and expand current stack			
			expand(stackNumber);
		}
		
		// just insert
		stack.pointer++;
		buffer[stack.start+stack.pointer] = n;
		stack.size++;
	}
		
	public static int pop(int stackNumber)	throws Exception {
		StackData stack = stacks[stackNumber]; 
		
		if (stack.size == 0) {
			throw new Exception("No empty in this stack");
		}
		int value = buffer[stack.pointer];
		buffer[stack.pointer] = 0;
		stack.pointer = prevElement(stack.pointer);
		stack.size--;
		
		return value;
	}

	public static void print() {
		System.out.println(Arrays.toString(buffer));
	}
		
	public static void main(String[] args) throws Exception {
			push(0, 10);
			push(0, 11);
			push(0, 12);
			push(1, 20);
			push(0, 13);
		print();
	}
}
