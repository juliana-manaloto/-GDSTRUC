import java.util.EmptyStackException;

public class CardStack {
    private Card[] cardArray;
    private int top;

    public CardStack(int limit){
        cardArray = new Card[limit];
        top = -1;
    }

    public void push(Card card){
        if(top == cardArray.length - 1){
            Card[] biggerarray = new Card[cardArray.length * 2];
            System.arraycopy(cardArray,0,biggerarray,0,cardArray.length);
            cardArray = biggerarray;
        }
        cardArray[++top] = card;
    }

    public Card pop(){
        //deletes top of stack
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return cardArray[top--];
    }
    public Card peek(){
        //shows top of stack
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return cardArray[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
public void printStack(){
        for(int i = top;i >=0;i--){
            System.out.println(cardArray[i]);
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
