public class StackNodeList {

    Node top;
    int num_items = 0;


    public StackNodeList() {

        this.top = null;

    }

    public StackNodeList(Node top) {

        this.top = top;

    }

    public boolean isEmpty() {

        return this.top == null;

    }

    public void push(int value) {

        this.top = new Node(value);
        this.num_items++;

    }

    public int pop() {

        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("Stack UnderFlow!");
        }
        int item = this.top.data;
        this.top = this.top.next;
        this.num_items++;
        return item;

    }

    public int peek() {

        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("Stack UnderFlow!");
        }
        return this.top.data;

    }

    public int size() {

        return this.num_items;

    }

}