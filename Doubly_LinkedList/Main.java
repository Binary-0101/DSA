package Doubly_LinkedList;

public class Main {
    public static void main(String[] args) {
        DLL dll = new DLL();

        dll.insertFirst(1);
        dll.insertFirst(2);
        dll.insertFirst(3);
        dll.insertFirst(4);
        dll.insertFirst(5);
        dll.insertFirst(6);

        dll.insertLast(7);

        dll.display();
    }
}
