package proyect_1_estructura_de_datos;

/**
 *
 * @author Vinicio
 */
public class DLLNode {

    private Object Data = null;
    private DLLNode next = null;
    private DLLNode prev = null;

    public DLLNode(Object Data) {
        this.Data = Data;
    }

    public Object getData() {
        return Data;
    }

    public void setData(Object Data) {
        this.Data = Data;
    }

    public DLLNode getNext() {
        return next;
    }

    public void setNext(DLLNode next) {
        this.next = next;
    }

    public DLLNode getPrev() {
        return prev;
    }

    public void setPrev(DLLNode prev) {
        this.prev = prev;
    }
}
