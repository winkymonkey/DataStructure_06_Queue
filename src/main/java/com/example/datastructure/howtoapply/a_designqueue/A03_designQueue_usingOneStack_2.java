package com.example.datastructure.howtoapply.a_designqueue;

import java.util.Stack;


/**
 * *****************************************************************************
 * Implement Queue using Stacks
 * *****************************************************************************
 */
public class A03_designQueue_usingOneStack_2 {
	private static A03_designQueue_usingOneStack_2 obj = new A03_designQueue_usingOneStack_2();
	
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
	
	
	
	private void enqueue(Stack<Integer> stack, int elem) {
		stack.push(elem);
	}
	/* recursive function which returns */
	private int dequeue(Stack<Integer> stack) {
		int badElement;
		if(stack.size() == 1) {
			return stack.pop();
		}
		else {
			int temp = stack.pop();
			badElement = dequeue(stack);
			stack.push(temp);
			return badElement;
		}
	}
}
