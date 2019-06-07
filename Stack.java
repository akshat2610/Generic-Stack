package stack;

import java.util.ArrayList;


public class Stack<T>{
	private ArrayList<T>		stack;
	private int 				top_index;
	private int 				bottom_index;
	private	int 				capacity;
	private final static int 	default_capacity = 10;
	
	public Stack() {
		capacity				= default_capacity;
		stack					= new ArrayList<>(capacity);
		top_index				= -1;
		bottom_index			= 0;
	}
	
	public Stack(int initial_capacity) {
		capacity				= initial_capacity;
		stack					= new ArrayList<>(capacity);
		top_index				= -1;
		bottom_index			= 0;
	}
	
	public int get_size() {
		return top_index - bottom_index + 1;
	}
	public int get_capacity() {
		return capacity;
	}
	public boolean is_empty() {
		return get_size() == 0;
	}
	public boolean is_full() {
		return get_size() == capacity;
	}
	
	
	public boolean push(T data) {
		if (get_size() >= capacity)
			return false;
		
		top_index++;
		stack.add(top_index, data);
		
		return true;
	}
	
	/**
	 * Removes the last inserted element from the stack
	 * @return most recently inserted element
	 */
	public T pop() {
		if (stack.size() < 1)
			return null;
		
		top_index--;
		return stack.get(top_index+1);
	}
	
	/**
	 * returns but does not remove the last inserted element
	 * @return most recently inserted element
	 */
	public T peek() {
		if (get_size() < 1)
			return null;
		
		return stack.get(top_index);
	}
	
	public void print() {
		System.out.println("******************");
		
		for (int i = top_index; i >= bottom_index; i--)
			System.out.println(stack.get(i));
		
		System.out.println("__________________");
	}
}
