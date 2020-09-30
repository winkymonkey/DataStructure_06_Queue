package howtoapply.a_designqueue;

import java.util.Stack;


/**
 * *****************************************************************************
 * Implement Queue using Stacks
 * *****************************************************************************
 */
public class A02_designQueue_usingOneStack_1 {
	private static A02_designQueue_usingOneStack_1 obj = new A02_designQueue_usingOneStack_1();
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		obj.enqueue(stack, 10);
		obj.enqueue(stack, 20);
		obj.enqueue(stack, 30);
		System.out.println(stack);
		
		obj.dequeue(stack);
		System.out.println(stack);
		
		obj.enqueue(stack, 40);
		System.out.println(stack);
		obj.enqueue(stack, 50);
		System.out.println(stack);
		
		obj.dequeue(stack);
		System.out.println(stack);
	}
	
	
	
	private void enqueue(Stack<Integer> stack, int elem) {
		stack.push(elem);
	}
	/* recursive function which doesn't return */
	private void dequeue(Stack<Integer> stack) {
		if(stack.size() == 1) {
			stack.pop();
			return;
		}
		int temp = stack.pop();
		dequeue(stack);
		stack.push(temp);
	}
}
