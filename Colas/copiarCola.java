import java.util.Collections;
import java.util.LinkedList;

public class copiarCola {
    public static void main(String[] args) {
        LinkedList cola1 = new LinkedList();
        LinkedList cola2 = new LinkedList();
        cola1.addFirst(4);
        cola1.addFirst(6);
        cola1.addLast(45);
        cola1.addFirst(7);
        cola1.addLast(56);

        while(  cola1.size() > 0 )
                cola2.addFirst( (int) cola1.removeLast());
        while(  cola2.size() >0 )
                System.out.print("Dato:" + (int) cola2.removeLast() + "\n");

    }
}
