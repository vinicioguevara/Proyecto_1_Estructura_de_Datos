package proyect_1_estructura_de_datos;

/**
 *
 * @author Vinicio
 */
public class LinkedList {

    public Node Head = null;
    public int size = 0;

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
            tmp.next = new Node(p);
            size++;
        }
    }

    public Node remove(int p) {
        if (size == 0) {
            return null;
        } else if (p > size) {
            return null;
        } else {
            Node Remove = Head;
            Node Return;
            for (int i = 0; i < p - 1; i++) {
                if (Remove.next != null) {
                    Remove = Remove.next;
                }
            }
            Return = Remove.next;
            Remove.next = null;
            return Return;
        }
    }

    public Object first() {
        return Head.data;
    }

    public Node get(int p) {
        if (size == 0) {
            return null;
        } else if (p > size) {
            return null;
        }
        Node tmp = Head;
        for (int i = 0; i < p - 1; i++) {
            if (tmp.next != null) {
                tmp = tmp.next;
            } else {
                return null;
            }
        }
        return null;
    }
}
