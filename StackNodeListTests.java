import static org.junit.Assert.*;
import java.util.*;

import org.junit.Test;

public class StackNodeListTests {

	public static final double DELTA = 0.00001;

	@Test
	public void is_empty1() { 
		StackNodeList stack = new StackNodeList();
		assertTrue(stack.isEmpty());
	}

	@Test
	public void is_empty2() {
		StackNodeList stack = new StackNodeList(new Node(2, new Node (1, null)));
		assertFalse(stack.isEmpty());
	}

	@Test
	public void push1() {
		StackNodeList stack = new StackNodeList(new Node(1, new Node (2, null)));
		stack.push(3);
		assertEquals(3, stack.top.data, DELTA);
	}

	@Test
	public void push2() {
		StackNodeList stack = new StackNodeList(new Node(3, new Node(5, new Node(7, new Node(51, null)))));
		stack.push(1);
		assertEquals(1, stack.top.data, DELTA);
	}

	@Test
	public void pop1() {
		StackNodeList stack = new StackNodeList();
		try {
			stack.pop();
			fail();
		}
		catch (IndexOutOfBoundsException e) {
			assertEquals("Stack UnderFlow!", e.getMessage());
		}
	}

	@Test
	public void pop2() {
		StackNodeList stack = new StackNodeList(new Node(2, new Node(1, null)));
		assertEquals(2, stack.pop(), DELTA);
	}

	@Test
	public void peek1() {
		StackNodeList stack = new StackNodeList();
		try {
			stack.peek();
			fail();
		}
		catch (IndexOutOfBoundsException e) {
			assertEquals("Stack UnderFlow!", e.getMessage());
		}
	}

	@Test
	public void peek2() {
		StackNodeList stack = new StackNodeList(new Node(5, new Node(7, new Node(31, new Node(51, null)))));
		stack.peek();
		assertEquals(5, stack.peek(), DELTA);
	}

	@Test
	public void size1() {
		StackNodeList stack = new StackNodeList(new Node(2, new Node(1, null)));
		assertEquals(2, stack.size(), DELTA);
	}

	@Test
	public void size2() {
		StackNodeList stack = new StackNodeList();
		assertEquals(0, stack.size(), DELTA);
	}

}
