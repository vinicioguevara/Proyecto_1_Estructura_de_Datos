package proyect_1_estructura_de_datos;

/**
 *
 * @author Vinicio
 */
public class LinkedList {

    Node Head = null;
    int size = 0;

    public LinkedList() {
    }

    public void add(Object p) {
        if (size == 0) {
            Head = new Node(p);
            size++;
        } else {
            Node tmp = Head;
            for (int i = 0; i < size; i++) {
                tmp = tmp.next;
            }
            size++;
        }
    }
}
