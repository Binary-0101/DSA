package Queue;

public class CircularMain {
        public static void main(String[] args) throws Exception {
            DynamicQueue queue = new CircularQueue(5);
            queue.insert(3);
            queue.insert(6);
            queue.insert(5);
            queue.insert(19);
            queue.insert(1);
    
            queue.display();
    
            System.out.println(queue.remove());
            queue.insert(133);
            queue.display();
    
            System.out.println(queue.remove());
            queue.insert(99);
            queue.display();
    
        }
    }
