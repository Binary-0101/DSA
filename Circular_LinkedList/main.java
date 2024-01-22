package Circular_LinkedList;

public class main {
    public static void main(String[] args) {
        Cll cll = new Cll();

        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);
        cll.insert(50);
        cll.insert(60);

        cll.delete(10);
        cll.delete(40);
        cll.delete(60);

        cll.display();;
    
    }
}
