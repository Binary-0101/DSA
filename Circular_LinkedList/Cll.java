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

    public void delete(int value){
        if(head == null)
        return;

        if(head.value == value){
            head = head.next;
            tail.next = head;
            return;
        }

        Node temp = head;

        do{
            Node n = temp.next;
            if(n.value == value){
                 temp.next = n.next;

                 if(n == tail){
                    tail = n;
                    tail.next = head;
                 }
            }
            n = n.next;
            temp = temp.next;
        } while(temp != head);
    }

    public void display(){
        Node temp = head;

        if(head == null)
        return;

        do{
            System.out.print(temp.value+" -> ");
            temp = temp.next;
       }while(temp != head);
       System.out.println("HEAD");
    }
    private class  Node {
        int value;
        Node next;
        
        Node(int value){
            this.value = value;
        }
    }
}
