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