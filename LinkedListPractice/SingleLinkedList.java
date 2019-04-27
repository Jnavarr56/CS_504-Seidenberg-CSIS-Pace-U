public class SingleLinkedList {

    private Node head = null;
    private Node tail = null;

    public SingleLinkedList() {

    }

    public SingleLinkedList(Node head) {

        this.head = head;

    }

    public void add(Node newNode) {

        if (head == null) {

            head = newNode;

        }

        else {

            Node trav = head;

            while (trav.getNext() != null) {

                trav = trav.getNext();

            }

            trav.setNext(newNode);

        }

    }

    public void add(Node newNode, int index) {

        if (head == null) {

            head = newNode;

        }

        else {

            int count = 0;
            Node trav = head;
 
            while ((count < index - 1) && (trav.getNext()!= null)) {

                trav = trav.getNext();
                count++;

            }

            newNode.setNext(trav.getNext());
            trav.setNext(newNode);

        }

    }

    public void remove() {

        if (head != null) {

            Node trav = head;
            Node last = null;

            while (trav.getNext() != null) {
                
                last = trav;
                trav = trav.getNext();

            }

            last.clearNext();

        }
        
    }

    public void remove(int index) {

        if (head != null) {

            int count = 0;
            Node trav = head;

            while ((count < index - 1)  && (trav.getNext() != null)) {
                
                trav = trav.getNext();
                count++;

            }

            trav.setNext(trav.getNext().getNext());

        }
        
    }

    public void printList() {

        if (head != null) {

            Node trav = head;
            System.out.println(head.getData());

            while (trav.getNext() != null) {

                trav = trav.getNext();
                System.out.println(trav.getData());

            }

        }

    }

}