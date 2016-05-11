package proyect_1_estructura_de_datos;

/**
 *
 * @author Vinicio
 */
public class Node {

    private Object Data = null;
    private Node next = null;

    public Node(Object Data) {
        this.Data = Data;
    }

    public Object getData() {
        return Data;
    }

    public void setData(Object Data) {
        this.Data = Data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
