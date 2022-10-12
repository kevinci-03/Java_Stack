import static org.junit.Assert.*;

import org.junit.Test;


public class StackNodeListTests {

	@Test
	public void is_empty1() {
		var stack = new StackNodeList();
		assertTrue(stack.isEmpty());
	}

	@Test
	public void is_empty2() {
		var stack = new StackNodeList(new Node(2, new Node (1, null)));
		assertFalse(stack.isEmpty());
	}

	@Test
	public void push1() {
		var stack = new StackNodeList(new Node(1, new Node (2, null)));
		stack.push(3);
		assertEquals(stack.top.data, 3);
	}

	@Test
	public void push2() {
		var stack = new StackNodeList(new Node(3, new Node(5, new Node(7, new Node(51, null)))));
		stack.push(1);
		assertEquals(stack.top.data, 1);
	}

}
