package howtoapply.a_designqueue;

import java.util.Stack;


/**
 * *****************************************************************************
 * Implement Queue using Stacks
 * *****************************************************************************
 */
public class A01_designQueue_usingTwoStack {
	private static A01_designQueue_usingTwoStack obj = new A01_designQueue_usingTwoStack();
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		obj.enqueue(stack, 10);
		obj.enqueue(stack, 20);
		obj.enqueue(stack, 30);
		System.out.println(stack);
		
		System.out.println(obj.dequeue(stack));
		System.out.println(stack);
		
		obj.enqueue(stack, 40);
		System.out.println(stack);
		obj.enqueue(stack, 50);
		System.out.println(stack);
		
		System.out.println(obj.dequeue(stack));
		System.out.println(stack);
	}
	
	
	
	private final Stack<Integer> stack2 = new Stack<Integer>();
	
	private void enqueue(Stack<Integer> stack, int elem) {
		stack.push(elem);
	}
	private int dequeue(Stack<Integer> stack) {
		while(stack.size() != 1) {
			stack2.push(stack.pop());
		}
		int badElement = stack.pop();
		while(!stack2.isEmpty()) {
			stack.push(stack2.pop());
		}
		return badElement;
	}
}
