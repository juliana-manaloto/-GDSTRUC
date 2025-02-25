import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Random ran = new Random();
        Scanner scanner = new Scanner(System.in);
        CardStack cardStack = new CardStack(30);
        DiscardStack discardStack = new DiscardStack(30);
        PlayerHandStack playerHand = new PlayerHandStack(30);
        cardStack.push(new Card("The Fool"));
        cardStack.push(new Card("The Fool reversed"));
        cardStack.push(new Card("The Magician"));
        cardStack.push(new Card("The High Priestess"));
        cardStack.push(new Card("The Empress"));
        cardStack.push(new Card("The Emperor"));
        cardStack.push(new Card("The Hierophant"));
        cardStack.push(new Card("The Lovers"));
        cardStack.push(new Card("The Chariot"));
        cardStack.push(new Card("Justice"));
        cardStack.push(new Card("The Hermit"));
        cardStack.push(new Card("The Hanged Man"));
        cardStack.push(new Card("The Wheel of Fortune"));
        cardStack.push(new Card("Strength"));
        cardStack.push(new Card("Death"));
        cardStack.push(new Card("Temperance"));
        cardStack.push(new Card("The Devil"));
        cardStack.push(new Card("The Tower"));
        cardStack.push(new Card("The Sun"));
        cardStack.push(new Card("The Moon"));
        cardStack.push(new Card("The Star"));
        cardStack.push(new Card("The World"));
        cardStack.push(new Card("Judgement"));
        cardStack.push(new Card("The Wheel of Fortune reversed"));
        cardStack.push(new Card("The Sun reversed"));
        cardStack.push(new Card("Justice reversed"));
        cardStack.push(new Card("The Devil reversed"));
        cardStack.push(new Card("The Tower reversed"));
        cardStack.push(new Card("The Moon reversed"));
        cardStack.push(new Card("The Lovers reversed"));

        int y = 1;
        while (!cardStack.isEmpty()) {

            int x = random.nextInt(5) + 1;

            int z = ran.nextInt(3) + 1;
            System.out.println("\n Round " + y);
            switch (z) {
                case 1:
                    System.out.println("\n Drawing " + x + " cards.");
                    for (int i = 0; i < x && !cardStack.isEmpty(); i++) {
                        playerHand.push(cardStack.pop());
                    }
                    break;
                case 2:
                    System.out.println("\n Discard " + x + " cards.");
                    for (int i = 0; i < x && !playerHand.isEmpty(); i++) {
                        discardStack.push(playerHand.pop());
                    }
                    break;
                case 3:
                    System.out.println("\n Get " + x + " cards from the discarded pile.");
                    for (int i = 0; i < x && !discardStack.isEmpty(); i++) {
                        playerHand.push(discardStack.pop());
                    }
                    break;
            }
            System.out.println("\n Cards in Player Hand: ");
            playerHand.printStack();
            System.out.println("\n Number of Cards left in Player Deck: ");
            cardStack.arraySize();
            System.out.println("\nNumber of cards in Discarded Pile: ");
            discardStack.arraySize();
            y++;
            System.out.println("\nPress Enter to continue");
            Scanner s = new Scanner(System.in);
            s.nextLine();

        }

        System.out.println("\n No more cards left in Player Deck! Goodbye!!");

    }



        }




