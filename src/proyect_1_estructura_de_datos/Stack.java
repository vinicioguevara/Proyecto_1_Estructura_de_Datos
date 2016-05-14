package proyect_1_estructura_de_datos;

/**
 *
 * @author Vinicio
 */
public class Stack {

    private DLLNode Top = null;
    private int size = 0;

    public Stack() {
    }

    public void push(Object Data) {
        if (size == 0) {
            Top = new DLLNode(Data);
            size++;
        } else {
            Top.setNext(new DLLNode(Data));
            Top = Top.getNext();
        }
    }

    public Object pop() {
        if (size == 0) {
            return null;
        } else {
            DLLNode tmp = Top;
            Top = Top.getPrev();
            return tmp;
        }
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getSize() {
        return size;
    }

    public Object peek() {
        return Top.getData();
    }
}
