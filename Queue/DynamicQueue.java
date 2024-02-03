package Queue;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int size){
        super(size);
    }


    @Override
    public boolean insert(int item){
        if(super.isFull()){
            int[] temp = new int[data.length+2];
            System.arraycopy(data,0,temp,0,data.length);
            data = temp;
        }
        return super.insert(item);
    }
}
