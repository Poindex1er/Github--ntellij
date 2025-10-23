public class DoublyLinkedPlaylist {
    music head = null;
    music tail = null;
    music current = null;
    void addsong(String x){
        music element = new music();
        element.musicname = x;
        element.next=null;
        if(head == null){
            head = element;
            tail = element;
            element.prev = null;
        }
        else{
            tail.next = element;
            element.prev = tail;
            tail = element;

        }
    }
    void print(){
        music temp = head;
        while(temp!=null){
            System.out.print(temp.musicname + " -> ");
            temp = temp.next;
        }
        System.out.print(" end");
    }
    void currentelement(){
        current = head;
    }
    void nextsong(){

        if(current != null && current.next !=null) {
            current = current.next;
            System.out.println("Now playing: " +current.musicname);
        }
        else{
            System.out.println("end of playlist");
        }

    }
    void previoussong(){
        if(current != null && current.prev != null){
            current = current.prev;
            System.out.println("Now Playing: " + current.musicname);
        }
        else{
            System.out.print("start of the playlist");
        }

    }
}
