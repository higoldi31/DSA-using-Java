package Queues;
//Queue implementation using array
class QueueException extends Exception{//customized exception
    public QueueException(String msg){
        super(msg);
    }
}
class CustomQueue{
     int[] data;
    private static final int DEFAULT_SIZE=10;
    int end=0;//will keep the track of the end position of the queue
   
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data=new int[size];
    } 

    public boolean add(int item) throws QueueException{
        if(isFull()){
            throw new QueueException("Queue is full.");

        }
        data[end++]=item;
        return true;
    }

    public int remove() throws QueueException{
        if(isEmpty()){
            throw new QueueException("Cannot be removed from an empty queue.");
        }
        int removedItem=data[0];
        for(int i=1;i<end;i++){
            data[i-1]=data[i];//copying all elements backward by 1 index
        }
       end--;
       return removedItem;

    }

    public int front() throws QueueException{//returns the first element
        if(isEmpty()){
            throw new QueueException("Queue is empty.");
        }
        return data[0];
    }

    public void display(){
        for(int i=0;i<end;i++){
            System.out.print(data[i]+" <-- ");
        }
        System.out.println("END");
    }

    public boolean isFull(){// isFull method to check if queue is full
        return end==data.length;
    }

    public boolean isEmpty(){// isEmpty method to check if queue is empty
        return end==0;
    }   
}

public class Implementation {
    public static void main(String[] args) throws QueueException {
        CustomQueue queue=new CustomQueue(3);

        queue.add(3);
        queue.add(4);
        queue.add(8);
        queue.display();
        queue.remove();
        queue.display();
        queue.add(11);
        queue.add(22);

    }
    
}
