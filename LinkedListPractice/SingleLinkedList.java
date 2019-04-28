public class SingleLinkedList {

    private Node head = null;

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

            while(trav.getNext() != null) {

                trav = trav.getNext();

            }

            trav.setNext(newNode);

        }

    }

    public void add(Node newNode, int idx) {

        if (head == null) {

            head = newNode;

        }

        else {

            if (idx == 0) {

                newNode.setNext(head);
                head = newNode;

            }

            else {

                int count = 0;
                Node trav = head;

                while (count < idx - 1) {

                    trav = trav.getNext();

                    count++;

                }

                newNode.setNext(trav.getNext());
                trav.setNext(newNode);

            }

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

    public void remove(int idx) {

        if (head != null) {

            int count = 0;
            Node trav = head;

            while (count < idx - 1) {

                trav = trav.getNext();

                count++;

            }

            trav.setNext(trav.getNext().getNext());

        }

    }

    public void printList() {

        if (head != null) {

            Node trav = head;

            while (trav.getNext() != null) {

                System.out.println(trav.getData());

                trav = trav.getNext();

            }

            System.out.println(trav.getData());

        }

    }

}