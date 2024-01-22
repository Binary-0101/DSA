package Circular_LinkedList;

public class Cll {

    private Node head;
    private Node tail;

    public Cll(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node temp = head;

        if(head == null)
        return;

        do{
            System.out.print(temp.value+" -> ");
            temp = temp.next;
       }while(temp != head);
       System.out.println("END");
    }
    private class  Node {
        int value;
        Node next;
        
        Node(int value){
            this.value = value;
        }
    }
}
