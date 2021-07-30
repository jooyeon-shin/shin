package lesson002;

import java.util.PriorityQueue;

public class Q2 {

	public static void main(String[] args) {
		// creating a priority queue
		PriorityQueue<Integer> numbers = new PriorityQueue<>();

		//using the add() method

		numbers.add(4);
		numbers.add(2);

		System.out.println("PriorityQueue: " + numbers);

		//using the offer() method
		numbers.offer(1);
		System.out.println("updated PriorityQueue: " + numbers);
	}

}
