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

    public void insert(int value,int position){
        if(position == 0){
            insertFirst(value);
        }
        else if(position == size){
            insertLast(value);
        }

        Node temp = head;

        for(int i=1;i<position;i++){
            temp = temp.next;
        }

        Node node = new Node(value,temp.next);
        temp.next = node;
    }

    public int deleteFirst(){
        int value = head.value;
        head = head.next;

        if(head == null){
            tail = null;
        }

        size--;
        return value;
    }

    public int deleteLast(){
        if(size <= 1){
            deleteFirst();
        }
        Node secondLast = get(size - 2);

        int value = tail.value;

        tail = secondLast;
        tail.next = null;

        return value;
    }

    public int delete(int index){
        if(size <= 1){
            deleteFirst();
        }
        Node delete_prevIndex = get(index - 1);

        int value = delete_prevIndex.next.value;
        delete_prevIndex.next = delete_prevIndex.next.next;

        return value;
    }

    public Node find(int value){
        Node temp = head;

        while(temp != null){
            if(temp.value == value){
                return temp;
            }

            temp = temp.next;
        }
        return null; 
    }

    public Node get(int index){
        Node temp = head;

        for(int i=0;i<index;i++){
            temp = temp.next;
        }

        return temp; 
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.value+" -> ");
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
