package Doubly_LinkedList;

public class DLL {
    private Node head;

    public void insertFirst(int val){
        Node node  = new Node(val);
        node.next = head;
        node.prev = null;

        if(head != null){
        head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(head == null){
            node.prev = null;
            head = node;
            return;
        }

        Node last = head;
        while(last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;
        node.next = null;
    }

    public void insert(int after,int value){
        Node temp = find(after);

        if(temp == null){
            System.out.println("Node does not exists");
        }

        Node node = new Node(value,temp.next,temp);
        temp.next = node;
        
        if(node.next != null)
        node.next.prev = node;
    }

    public Node find(int after){
        Node temp = head;

        while(temp != null){
            if(temp.val == after){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        Node last = null;

        while(temp != null){
            System.out.print(temp.val+" -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("End");

        System.out.println("Print in Reverse");

        while(last != null){
            System.out.print(last.val+"- >");
            last = last.prev;
        }
        System.out.print("Start");
    }

    private class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val){
            this.val = val;
        }

        public Node(int val,Node next,Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
