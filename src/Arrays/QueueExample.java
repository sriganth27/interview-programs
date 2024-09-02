package Arrays;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q1 = new LinkedList<>(); 
		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.add(4);
		q1.add(5);
	
		System.out.println("queue" + q1);
		int front = q1.peek();
		
		System.out.println("front element is "+front);
		
	
		
		int size= q1.size();
		
		System.out.println("size is"+size);
		
		while(!q1.isEmpty()) {
			int dequeue = q1.remove();
			System.out.println("dequeue element is " +dequeue);
		}
		
		System.out.println("queue after dequeing all elements"+ q1);
		
		

	}

}
