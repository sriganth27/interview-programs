package Arrays;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println("the element of linkedlist is :"+list);
		
		Collections.reverse(list);
		
		System.out.println("reverse of linked list is :"+list);

	}

}
