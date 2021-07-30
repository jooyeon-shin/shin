package lesson002;

import java.util.Stack;

public class EStackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();

		stack.add("java");
		stack.add("python");
		stack.add("funny");

		System.out.println("stack : " + stack);

		String temp = stack.peek();
		System.out.println(temp);
		System.out.println("stack after peek() : " + stack);

		temp = stack.pop();
		System.out.println(temp);
		System.out.println("stack after peek() : " + stack);

		// searcj() : 값을 찾아 위치값(1 base)을 반환
		int idx = stack.search("python");
		System.out.println("idx of python : " + idx);
		
	}

}
