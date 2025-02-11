import java.text.MessageFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
public static void main(String[] args){
    int index;
    PlayerLinkedList playerLinkedList = new PlayerLinkedList();
    playerLinkedList.addToFront(new Player(1, "Bob", 33 ));
    playerLinkedList.addToFront(new Player(2, "Todd", 44 ));
    playerLinkedList.addToFront(new Player(3, "Cece", 303 ));
    playerLinkedList.addToFront(new Player(4, "Robin", 12 ));

    playerLinkedList.printLinkedList();
    //shows size of the list:
    playerLinkedList.printLinkedListSize();
    // removes first element:
    playerLinkedList.deleteHead();
    playerLinkedList.printLinkedList();


}
}