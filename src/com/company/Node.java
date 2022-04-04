package com.company;

public class Node {
    private Node next;
    private int value;



    public Node(int value, Node n) {
        this.value = value;
        this.next = n;

    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
