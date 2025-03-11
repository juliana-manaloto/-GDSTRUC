import java.util.NoSuchElementException;

public class PlayerQueue {
    private Player[] queue;
    private int front;
    private int size;

    public PlayerQueue(int capacity){
        queue = new Player[capacity];
        front = 0;
    }

    public void enqueue(Player player){
        //resize array if queue is full
        if(size == queue.length){
            Player[] largerQueue = new Player[queue.length*2];
            System.arraycopy(queue,0,largerQueue,0,queue.length);
            queue = largerQueue;
        }

        queue[size]=player;
        size++;
    }

    public Player Dequeue(){
        //check if queue is empty
        if(size == 0){
            throw new NoSuchElementException();
        }

        Player removePlayer = queue[front];

        // shift elements 1 step back
        for(int i = 1; i < size; i++){
            queue[i-1]=queue[i];
        }
        size--;
        queue[size]= null;
        return removePlayer;
    }

    public Player peek(){
        if(size == 0){
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public void printQueue(){
        for(int i = front; i < size; i++){
            System.out.print(queue[i]);

            if(i < size -1){
                System.out.print(" -> ");
            }
        }
    }

    public int sizeCheck(){

        int sizeLength = size;
        return sizeLength;
    }

}
