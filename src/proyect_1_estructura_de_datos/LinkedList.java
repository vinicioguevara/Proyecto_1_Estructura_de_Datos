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

    public Node getHead() {
        return Head;
    }

    public void setHead(Node Head) {
        this.Head = Head;
    }
    
    public int getSize() {
        return size;
    }

    public void add(Object Data) {
        if (size == 0) {
            Head = new Node(Data);
            size++;
        } else {
            Node tmp = Head;
            for (int i = 0; i < size - 1; i++) {
                tmp = tmp.getNext();
            }
            tmp.setNext(new Node(Data));
            size++;
        }
    }

    public void remove(int Index) {
        if (Index == 0) {
            Head = null;
            size--;
        } else if (size != 0 || Index <= size) {
            Node Remove = Head;
            for (int i = 0; i < Index - 1; i++) {
                if (Remove.getNext() != null) {
                    Remove = Remove.getNext();
                }
            }
            Remove = null;
            size--;
        }
    }

    public Object first() {
        return Head.getData();
    }

    public Object get(int Index) {
        if (Index < 0 || Index >= size) {
            return null;
        }
        Node tmp = Head;
        for (int i = 0; i < Index; i++) {
            tmp = tmp.getNext();
        }
        return tmp.getData();
    }
}
