package Zad1;

import java.util.Stack;

public class StackExample {
	Stack<String> stos = new Stack<String>();
	public void push(String el) {
		stos.push(el);
	}
	public String pop() {
		if (stos.size() == 0) {
			System.out.println("Pusty stos, nie można usunąć!");
			return "blad";
		} else {
			String output = stos.pop();
			System.out.println("Usunięty element: "+output);
			return output;
		}
	}
	public String peek() {
		if (stos.size() == 0) {
			System.out.println("Pusty stos, nie można zoabczyć elementu!");
			return "blad";
		} else {
			String output = stos.lastElement();
			System.out.println(output);
			return output;
		}
	}
	public static void main(String[] args) {
		StackExample stack = new StackExample();
		stack.pop();
		stack.peek();
		stack.push("Jeden");
		stack.peek();
		stack.pop();
	}
}
