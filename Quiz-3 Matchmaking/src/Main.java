import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlayerQueue players = new PlayerQueue(10);
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int rounds = 1;
        int level = 0;
        int id = 1;
        int name = 1;
        int remove = 1;

        while (rounds < 11) {
            System.out.println("Round " + rounds);
            int x = random.nextInt(7) + 1;
            do {
                for (int i = 0; i < x; i++) {
                    players.enqueue(new Player(id, "Player" + name, level));
                    id++;
                    name++;
                    level++;

                }
                System.out.println("\n Players: ");
                players.printQueue();
                System.out.println("\nThere are "+ players.sizeCheck() + " players in the queue.");
            } while (players.sizeCheck() < 5);

            do{
                System.out.println("\n dequeue player: ");
                Player removedPlayer = players.Dequeue();
                System.out.println("removed player: "+ removedPlayer);
                remove++;
            } while ( remove < 6);
            System.out.println("\n Players left: ");
            players.printQueue();
            rounds++;
            remove = 1;
            System.out.println("\nPress Enter to go to next round");
            Scanner s = new Scanner(System.in);
            s.nextLine();
        }
    }
    }

