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

    public void setSize(int size) {
        this.size = size;
    }
    
    
    public void add(Object Data) {
        if (size == 0) {
            Head = new Node(Data);
            size++;
        } else {
            Node tmp = Head;
            for (int i = 0; i < size; i++) {
                tmp = tmp.getNext();
            }
            tmp.setNext(new Node(Data));
            size++;
        }
    }

    public Node remove(int Index) {
        if (size == 0) {
            return null;
        } else if (Index > size) {
            return null;
        } else {
            Node Remove = Head;
            Node Return;
            for (int i = 0; i < Index - 1; i++) {
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

    public Node get(int Index) {
        if (size == 0) {
            return null;
        } else if (Index > size) {
            return null;
        }
        Node tmp = Head;
        for (int i = 0; i < Index; i++) {
            if (tmp.getNext() != null) {
                tmp = tmp.getNext();
            } else {
                return null;
            }
        }
        return null;
    }

    public boolean indexOf(Object Data) {
        if (size == 0) {
            return false;
        }
        Node tmp = Head;
        for (int i = 0; i < size; i++) {
            if (Data.equals(tmp.getData())) {
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }
}
