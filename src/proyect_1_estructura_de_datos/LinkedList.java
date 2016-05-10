package proyect_1_estructura_de_datos;

/**
 *
 * @author Vinicio
 */
public class LinkedList {

    private Node Head = null;
    private int size = 0;

    public LinkedList() {
    }

    public void add(Object p) {
        if (size == 0) {
            Head = new Node(p);
            size++;
        } else {
            Node tmp = Head;
            for (int i = 0; i < size; i++) {
                tmp = tmp.getNext();
            }
            tmp.setNext(new Node(p));
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
                if (Remove.getNext() != null) {
                    Remove = Remove.getNext();
                }
            }
            Return = Remove.getNext();
            Remove.setNext(null);
            return Return;
        }
    }

    public Object first() {
        return Head.getData();
    }

    public Node get(int p) {
        if (size == 0) {
            return null;
        } else if (p > size) {
            return null;
        }
        Node tmp = Head;
        for (int i = 0; i < p - 1; i++) {
            if (tmp.getNext() != null) {
                tmp = tmp.getNext();
            } else {
                return null;
            }
        }
        return null;
    }
}
