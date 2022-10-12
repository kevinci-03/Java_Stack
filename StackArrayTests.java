import static org.junit.Assert.*;
import java.lang.IndexOutOfBoundsException;
import java.util.*;

import org.junit.Test;


public class StackArrayTests {

    public static final double DELTA = 0.00001;

    @Test
    public void test_is_empty1() {
        StackArray<Integer> stack = new StackArray<>(0);
        assertTrue(stack.isEmpty());
    }

    @Test
    public void test_is_empty2() {
        StackArray<Integer> stack = new StackArray<>(5);
        assertTrue(stack.isEmpty());
    }

    @Test
    public void test_is_empty3() {
        StackArray<Integer> stack = new StackArray<>(5);
        stack.push(3);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void test_is_full1() {
        StackArray<Integer> stack = new StackArray<>(2);
        stack.push(1);
        stack.push(2);
        assertTrue(stack.isFull());
    }

	@Test
	public void test_is_full2() {

		StackArray<Integer> stack = new StackArray<>(5);
		stack.push(3);
		stack.push(4);
		stack.push(1);
		stack.push(5);
		assertFalse(stack.isFull());

	}

	@Test
	public void test_is_full3() {
		StackArray<Integer> stack = new StackArray<>(3);
		assertFalse(stack.isFull());
	}

	@Test
	public void push1() {
		StackArray<Integer> stack = new StackArray<>(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
		try {
            stack.push(4);
            fail();
        }
        catch (IndexOutOfBoundsException e){
            assertEquals("Stack OverFlow!", e.getMessage());
        }
	}

    @Test
    public void push2() {
        StackArray<Integer> stack = new StackArray<>(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertEquals(list, stack.items);
    }

    @Test
    public void pop1() {
        StackArray<Integer> stack = new StackArray<>(4);
        try {
            stack.pop();
            fail();
        }
        catch(IndexOutOfBoundsException e) {
            assertEquals("Stack UnderFlow!", e.getMessage());
        }
    }

    @Test
    public void pop2() {
        StackArray<Integer> stack = new StackArray<>(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop(), DELTA);
        assertEquals(2, stack.size(), DELTA);
    }

    @Test
    public void peek1() {
        StackArray<Integer> stack = new StackArray<>(4);
        try {
            stack.peek();
            fail();
        }
        catch(IndexOutOfBoundsException e) {
            assertEquals("Stack UnderFlow!", e.getMessage());
        }
    }

    @Test
    public void peek2() {
        StackArray<Integer> stack = new StackArray<>(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.peek(), DELTA);
        assertEquals(3, stack.size(), DELTA);
    }

    @Test
    public void size1() {
        StackArray<Integer> stack = new StackArray<>(3);
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.size(), DELTA);
    }

    @Test
    public void size2() {
        StackArray<String> stack = new StackArray<>(3);
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        assertEquals(3, stack.size(), DELTA);
    }

    @Test
    public void size3() {
        StackArray<String> stack = new StackArray<>();
        assertEquals(0, stack.size(), DELTA);
    }

} 
