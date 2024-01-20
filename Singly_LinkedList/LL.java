package Singly_LinkedList;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL(){
        this.size = 0;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head; 
        }

        size += 1;
    }

    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.println(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
    private Node next;
    private int value;

    public Node(int value){
        this.value = value;
    }

    public Node(int value,Node next){
        this.value = value;
        this.next = next;
    }

    }
}