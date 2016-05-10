package proyect_1_estructura_de_datos;

/**
 *
 * @author Vinicio
 */
public class Node {

    private Object data = null;
    private Node next = null;

    public Node(Object p) {
        data = p;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
