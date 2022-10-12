/**
 * Implement an efficient last in first out Abstract Data Type using a Node list
 */

public class StackNodeList {

    public Node top;
    private int num_items = 0;


    public StackNodeList() {

        this.top = null;

    }

    public StackNodeList(Node top) {

        this.top = top;
        Node node = this.top;
        while (node != null) {
            this.num_items++;
            node = node.next;
        }

    }

    public boolean isEmpty() { // Time Complexity: O(1)

        return this.top == null;

    }

    public void push(int value) {  // Time Complexity: O(1)

        this.top = new Node(value);
        this.num_items++;

    }

    public int pop() {  // Time Complexity: O(1)

        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("Stack UnderFlow!");
        }
        int item = this.top.data;
        this.top = this.top.next;
        this.num_items++;
        return item;

    }

    public int peek() {  // Time Complexity: O(1)

        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("Stack UnderFlow!");
        }
        return this.top.data;

    }

    public int size() {  // Time Complexity: O(1)

        return this.num_items;

    }

}