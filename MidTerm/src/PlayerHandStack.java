import java.util.EmptyStackException;

public class PlayerHandStack {
    private Card[] playerHandArray;
    private int top;

    public PlayerHandStack(int limit) {
        playerHandArray = new Card[limit];
        top = -1;
    }

    public void push(Card card) {
        if (top == playerHandArray.length - 1) {
            Card[] biggerarray = new Card[playerHandArray.length * 2];
            System.arraycopy(playerHandArray, 0, biggerarray, 0, playerHandArray.length);
            playerHandArray = biggerarray;
        }
        playerHandArray[++top] = card;
    }

    public Card pop() {
        //deletes top of stack
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return playerHandArray[top--];
    }

    public Card peek() {
        //shows top of stack
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return playerHandArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void printStack() {
        for (int i = top; i >= 0; i--) {
            System.out.println(playerHandArray[i]);
        }
    }
}
