package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;
    int i;
    private static final int DEFAULT_VALUE_IF_EMPTY = -1;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return DEFAULT_VALUE_IF_EMPTY;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return DEFAULT_VALUE_IF_EMPTY;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
class Node {

    private final int value;
    private Node prev;
    private Node next;

    public Node(int i) {
        value = i;
    }

    int getValue() {
        return value;
    }

    Node getNext() {
        return next;
    }

    void setNext(Node next) {
        this.next = next;
    }

    Node getPrev() {
        return prev;
    }

    void setPrev(Node prev) {
        this.prev = prev;
    }
}
// TODO: usunąć niepotrzebną zmienną int i