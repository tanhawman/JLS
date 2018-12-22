package ADT;

public class LList<T> implements ListInterface<T> {

    private Node<T> first;
    private int numOfEntries;

    public boolean add(T newEntry) {

        // <T> is a collection of object, just like array of object, but this implement the node.
        Node<T> newNode = new Node<>(newEntry);

        if (isEmpty()) {
            // Case 1 : If the node List is empty, make the new node as the last node
            first = newNode;
        } else {
            // This will get the last node by using the "numberOfEntries" which will store the last node's location
            Node<T> lastNode = getNodeAt(numOfEntries);
            // This will make make the last node's next reference to the new Node, and make the new node as the last node.
            lastNode.setNext(newNode);
        }
        numOfEntries++;
        return true;
    }

    public final void clear() {
        // After runnning this functions, all the linkage between all node will lost.
        first = null;
        numOfEntries = 0;
    }

    // the LList is start from 1, not like other function starts with "0", this start with "1".
    public T getEntry(int givenPosition) {
        T result = null;

        // Check within range of LList
        if ((givenPosition >= 1) && (givenPosition <= numOfEntries)) {
            result = getNodeAt(givenPosition).getData();
        }
        return result;
    }

    public int getNumberOfEntries() {
        return numOfEntries;
    }

    public boolean isEmpty() {
        boolean result;

        if (numOfEntries == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    private Node<T> getNodeAt(int givenPosition) {
        Node<T> currentNode = first;

        // go to the node at the given location.
        for (int counter = 1; counter < givenPosition; counter++) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public LList() {
        clear();
    }

    public class Node<T> {
        // This is a variable which allow us to store a collection of data. exmaple like: The whole Customer object.

        private T data;
        // Node is the thing that we used as a link to next node
        private Node next;

        public Node(T data) {
            // Initializing the node
            this.data = data;
            next = null;
        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        public void setData(T data) {
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }
    }
}
