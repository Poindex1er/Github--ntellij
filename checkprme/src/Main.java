import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DoublyLinkedPlaylist list1 = new DoublyLinkedPlaylist();
        list1.addsong("The end");
        list1.addsong("sky fall");
        list1.addsong("golden Brown");
        list1.addsong("Mind If I stay");
        list1.currentelement();
        list1.nextsong();
        list1.nextsong();
        list1.previoussong();

    }
}