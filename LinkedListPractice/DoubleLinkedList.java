public class DoubleLinkedList {

    private Node head;
    private Node tail;
    private String data;

    public DoubleLinkedList() {
        
        head = null;

        tail = null;

    }

    public void add(Node newNode) {

        if (head == null) {

            head = newNode;

        }

        else {

            Node trav = head;

            while(trav.getNext() != null) {

                trav = trav.getNext();

            }

            trav.setNext(newNode);
            newNode.setPrev(trav);

            tail = newNode;

        }

    }

    public void add(Node newNode, int index) {

        Node trav = head;

        int count = 0;

        while (count < index - 1) {

            trav = trav.getNext();

            count++;

        }

        newNode.setNext(trav.getNext());
        trav.getNext().setPrev(newNode);

        trav.setNext(newNode);
        newNode.setPrev(trav);

    }

    public void printForwards() {

        System.out.println("DOUBLE LINKED LIST----------");

        int count = 0;

        Node trav = head;

        while(trav.getNext() != null) {

            System.out.println("Node: " + count + " " + trav.getData());

            trav = trav.getNext();

            count++;

        }

        System.out.println("Node: " + count + " " + trav.getData());

    }

    public void printBackwards() {

        System.out.println("DOUBLE LINKED LIST----------");

        Node trav = tail;

        while(trav.getPrev() != null) {

            System.out.println(trav.getData());

            trav = trav.getPrev();

        }

        System.out.println(trav.getData());

    }

}