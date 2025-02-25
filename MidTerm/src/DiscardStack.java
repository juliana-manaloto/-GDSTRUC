import java.util.EmptyStackException;
public class DiscardStack {
    private Card[] discaredArray;
    private int top;

    public DiscardStack(int limit){
        discaredArray = new Card[limit];
        top = -1;
    }

    public void push(Card card){
        if(top == discaredArray.length - 1){
            Card[] biggerarray = new Card[discaredArray.length * 2];
            System.arraycopy(discaredArray,0,biggerarray,0,discaredArray.length);
            discaredArray = biggerarray;
        }
        discaredArray[++top] = card;
    }

    public Card pop(){
        //deletes top of stack
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return discaredArray[top--];
    }
    public Card peek(){
        //shows top of stack
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return discaredArray[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public void printStack(){
        for(int i = top;i >=0;i--){
            System.out.println(discaredArray[i]);
        }
    }
    public int arraySize(){
        int y = 0;
        for(int i = top; i >=0; i--){
            y++;
        }
        System.out.println(y);
        return y;
    }
}

