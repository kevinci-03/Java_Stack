import java.util.ArrayList;
/** 
 * Aims to implement an efficient last in first out Abstract Data Type using an ArrayList and generic types 
*/

public class StackArray<T> {

    private int capacity;
    public ArrayList<T> items;
    public int num_items = 0;
    
    public StackArray() {

        this.capacity = 50;
        this.items = new ArrayList<>(50);

    }

    public StackArray(int capacity) {

        this.capacity = capacity;
        this.items = new ArrayList<>(capacity);

    }

    public boolean isEmpty() {  // Time Complexity: O(1)

        return this.num_items == 0;

    }

    public boolean isFull() {  // Time Complexity: O(1)

        return this.num_items == this.capacity;

    }

    public void push(T item) {  // Time Complexity: O(1)

        if (this.isFull()) {
            throw new IndexOutOfBoundsException("Stack OverFlow!");
        }
        this.items.add(this.num_items, item);
        this.num_items++;

    }

    public T pop() {  // Time Complexity: O(1)

        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("Stack UnderFlow!");
        }
        T item = this.items.get(this.num_items - 1);
        this.num_items--;
        return item;

    }

    public T peek() {  // Time Complexity: O(1)

        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("Stack UnderFlow!");
        }
        return this.items.get(this.num_items - 1);

    }

    public int size() {  // Time Complexity: O(1)

        return this.num_items;

    }

}