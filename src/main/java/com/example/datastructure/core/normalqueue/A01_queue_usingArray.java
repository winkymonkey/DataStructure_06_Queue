package com.example.datastructure.core.normalqueue;

public class A01_queue_usingArray {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		
		queue.enQueue(10);
		System.out.println(queue + "---front:"+queue.front() + "---rear:"+queue.rear());
		
		queue.enQueue(20);
		System.out.println(queue + "---front:"+queue.front() + "---rear:"+queue.rear());
		
		queue.enQueue(30);
		System.out.println(queue + "---front:"+queue.front() + "---rear:"+queue.rear());
		
		queue.enQueue(40);
		System.out.println(queue + "---front:"+queue.front() + "---rear:"+queue.rear());
		
		queue.enQueue(50);
		System.out.println(queue + "---front:"+queue.front() + "---rear:"+queue.rear());
		
		queue.enQueue(60);
		System.out.println(queue + "---front:"+queue.front() + "---rear:"+queue.rear());
		
		queue.deQueue();
		System.out.println("dequque");
		System.out.println(queue + "---front:"+queue.front() + "---rear:"+queue.rear());
		
		queue.enQueue(80);
		System.out.println(queue + "---front:"+queue.front() + "---rear:"+queue.rear());
		
		queue.deQueue();
		System.out.println("dequque");
		System.out.println(queue + "---front:"+queue.front() + "---rear:"+queue.rear());
		
		queue.deQueue();
		System.out.println("dequque");
		System.out.println(queue + "---front:"+queue.front() + "---rear:"+queue.rear());
		
		queue.deQueue();
		System.out.println("dequque");
		System.out.println(queue + "---front:"+queue.front() + "---rear:"+queue.rear());
	}
}
