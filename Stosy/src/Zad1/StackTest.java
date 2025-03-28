package Zad1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StackTest {
	@Test
	public void testPush() {
		StackExample stos = new StackExample();
		stos.push("Hello");
		assertEquals("Hello", "Hello", stos.peek());
	}
	@Test
	public void testPop() {
		StackExample stos = new StackExample();
		stos.push("Hello");
		String output = stos.pop();
		assertEquals("Hello", output, "Hello");
	}
	@Test
	public void testPeek() {
		StackExample stos = new StackExample();
		stos.push("Hello");
		String output = stos.peek();
		assertEquals("Hello", output, "Hello");
	}
	@Test
	public void testPeekError() {
		StackExample stos = new StackExample();
		String output = stos.peek();
		assertEquals("Error", output, "blad");
	}
	@Test
	public void testPopError() {
		StackExample stos = new StackExample();
		String output = stos.pop();
		assertEquals("Error", output, "blad");
	}
}
