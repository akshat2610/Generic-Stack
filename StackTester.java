package stack;

import static org.junit.Assert.*;
import org.junit.Test;

public class StackTester {
	@Test
	public void test_default_ctor() {
		Stack<String> function_calls = new Stack<>();

		assertEquals(function_calls.is_empty(), true);
		assertEquals(function_calls.is_full(), false);
		assertEquals(function_calls.get_size(), 0);
		assertEquals(function_calls.get_capacity(), 10);
	}

	@Test
	public void test_parametric_ctor() {
		Stack<String> function_calls = new Stack<>(20);

		assertEquals(function_calls.is_empty(), true);
		assertEquals(function_calls.is_full(), false);
		assertEquals(function_calls.get_size(), 0);
		assertEquals(function_calls.get_capacity(), 20);
	}

	@Test
	public void test_first_push() {
		Stack<String> function_calls = new Stack<>(20);

		function_calls.push("Merge1");
		function_calls.print();

		assertEquals(function_calls.is_empty(), false);
		assertEquals(function_calls.is_full(), false);
	}

	@Test
	public void test_multiple_push() {
		Stack<String> function_calls = new Stack<>(5);

		function_calls.push("Merge1");
		function_calls.push("Merge1.1");
		function_calls.push("Merge1.1.1");
		function_calls.push("Merge1.1.1.1");
		function_calls.push("Merge1.1.1.1.1");

		function_calls.print();

		assertEquals(function_calls.is_empty(), false);
		assertEquals(function_calls.is_full(), true);
		assertEquals(function_calls.get_size(), 5);
	}

	@Test
	public void test_first_pop() {
		Stack<String> function_calls = new Stack<>(5);

		function_calls.push("Merge1");
		function_calls.push("Merge1.1");
		function_calls.push("Merge1.1.1");
		function_calls.push("Merge1.1.1.1");
		function_calls.push("Merge1.1.1.1.1");

		assertEquals(function_calls.is_empty(), false);
		assertEquals(function_calls.is_full(), true);
		assertEquals(function_calls.get_size(), 5);

		String popped_function = function_calls.pop();
		System.out.println("Function popped is " + popped_function);
		function_calls.print();

		assertEquals(function_calls.is_empty(), false);
		assertEquals(function_calls.is_full(), false);
		assertEquals(function_calls.get_size(), 4);
	}

	@Test
	public void test_multiple_pop() {
		Stack<String> function_calls = new Stack<>(5);

		function_calls.push("Merge1");
		function_calls.push("Merge1.1");
		function_calls.push("Merge1.1.1");
		function_calls.push("Merge1.1.1.1");
		function_calls.push("Merge1.1.1.1.1");

		assertEquals(function_calls.is_empty(), false);
		assertEquals(function_calls.is_full(), true);
		assertEquals(function_calls.get_size(), 5);

		String popped_function1 = function_calls.pop();
		String popped_function2 = function_calls.pop();
		System.out.println("1st function popped is " + popped_function1);
		System.out.println("2st function popped is " + popped_function2);
		function_calls.print();

		assertEquals(function_calls.is_empty(), false);
		assertEquals(function_calls.is_full(), false);
		assertEquals(function_calls.get_size(), 3);
	}

	@Test
	public void test_push_pop() {
		Stack<String> function_calls = new Stack<>(5);

		function_calls.push("Merge1");
		function_calls.push("Merge1.1");
		function_calls.push("Merge1.1.1");
		function_calls.push("Merge1.1.1.1");
		function_calls.push("Merge1.1.1.1.1");

		assertEquals(function_calls.is_empty(), false);
		assertEquals(function_calls.is_full(), true);
		assertEquals(function_calls.get_size(), 5);

		String popped_function1 = function_calls.pop();
		String popped_function2 = function_calls.pop();
		System.out.println("1st function popped is " + popped_function1);
		System.out.println("2st function popped is " + popped_function2);
		function_calls.print();

		assertEquals(function_calls.is_empty(), false);
		assertEquals(function_calls.is_full(), false);
		assertEquals(function_calls.get_size(), 3);

		function_calls.push("Merge2.0");
		function_calls.print();

		assertEquals(function_calls.is_empty(), false);
		assertEquals(function_calls.is_full(), false);
		assertEquals(function_calls.get_size(), 4);

		function_calls.pop();
		function_calls.print();

		assertEquals(function_calls.is_empty(), false);
		assertEquals(function_calls.is_full(), false);
		assertEquals(function_calls.get_size(), 3);

		function_calls.push("Merge3.0");
		function_calls.print();

		assertEquals(function_calls.is_empty(), false);
		assertEquals(function_calls.is_full(), false);
		assertEquals(function_calls.get_size(), 4);
	}

	@Test
	public void test_peek() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		Stack<String> function_calls = new Stack<>(5);

		function_calls.push("Merge1");
		function_calls.push("Merge1.1");
		function_calls.push("Merge1.1.1");
		function_calls.push("Merge1.1.1.1");
		function_calls.push("Merge1.1.1.1.1");
		
		System.out.println("Peeking... " + function_calls.peek());
		function_calls.pop();
		function_calls.pop();
		System.out.println("Peeking... " + function_calls.peek());
		
		assertEquals(function_calls.get_size(), 3);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
	
	@Test
	public void test_empty_pop_peek() {
		Stack<String> function_calls = new Stack<>(5);
		
		assertEquals(function_calls.get_capacity(), 5);
		assertEquals(function_calls.get_size(), 0);
		
		assertEquals(function_calls.pop(), null);
		assertEquals(function_calls.peek(), null);
	}
	
	@Test
	public void test_0_capacity_push() {
		Stack<String> function_calls = new Stack<>(0);
		
		assertEquals(function_calls.push("Try to insert"), false);
	}
	
	
}
