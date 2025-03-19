//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player pikachu = new Player(1,"Pikachu",10);
        Player celebi = new Player(2,"Celebi",20);
        Player hitmonchan = new Player(3,"Hitmonchan",30);
        Player mankey = new Player(4,"Mankey",40);
        Player starmie = new Player(5,"Starmie",50);
        Player togepi = new Player(6,"Togepi",60);

        SimpleHashtable players = new SimpleHashtable();
        players.put(pikachu.getUsername(), pikachu);
        players.put(celebi.getUsername(), celebi);
        players.put(hitmonchan.getUsername(), hitmonchan);
        players.put(mankey.getUsername(), mankey);
        players.put(starmie.getUsername(), starmie);
        players.put(togepi.getUsername(), togepi);

        players.printHashtable();
        //3 players cant be assigned since they have the same amount of characters as the first 3 players

        String key = starmie.getUsername();
        System.out.println("Player at key " + key + "=" + players.get(key));

        //removes player using key
        String removeKey = celebi.getUsername();
        System.out.println("Removing Player at key " + removeKey);
        players.removePlayer(removeKey);

        //shows that the player is removed
        players.printHashtable();
        String testkey = celebi.getUsername();
        System.out.println("Player at key " + testkey + " = " + players.get(testkey));

        }
    }
