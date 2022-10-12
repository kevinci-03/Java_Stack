import java.util.ArrayList;

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

    public boolean isEmpty() {

        return this.num_items == 0;

    }

    public boolean isFull() {

        return this.num_items == this.capacity;

    }

    public void push(T item) {

        if (this.isFull()) {
            throw new IndexOutOfBoundsException("Stack OverFlow!");
        }
        this.items.add(this.num_items, item);
        this.num_items++;

    }

    public T pop() {

        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("Stack UnderFlow!");
        }
        T item = this.items.get(this.num_items - 1);
        this.num_items--;
        return item;

    }

    public T peek() {

        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("Stack UnderFlow!");
        }
        return this.items.get(this.num_items - 1);

    }

    public int size() {

        return this.num_items;

    }

}