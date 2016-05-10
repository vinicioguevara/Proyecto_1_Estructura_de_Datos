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

    public Node remove(int p) {
        if (size == 0) {
            return null;
        } else if (size == p) {
            return null;
        } else {
            Node tmp = Head;
            Node Return;
            for (int i = 0; i < p - 1; i++) {
                if (tmp.next != null) {
                    tmp = tmp.next;
                } else {
                    return null;
                }
            }
            Return = tmp.next;
            tmp.next = null;
            return Return;
        }
    }
}
