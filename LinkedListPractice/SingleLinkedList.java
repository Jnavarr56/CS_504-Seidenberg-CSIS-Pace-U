public class SingleLinkedList {

    private Node head = null;

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

            if (index == 0) {

                newNode.setNext(head);
                head = newNode;

            }

            else {

                Node trav = head;
                int count = 0;

                while (count < index - 1 && trav.getNext() != null) {

                    trav = trav.getNext();
                    count++;

                }

                if (count == index - 1) {

                    if (trav.getNext() != null) {

                        newNode.setNext(trav.getNext());
                        trav.setNext(newNode);

                    }

                    else {

                        trav.setNext(newNode); 

                    }

                }
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

    public void remove(int index) {

        if (head != null) {

            if (index == 0) {

                if (head.getNext() == null) {

                    head = null;

                }

                else {

                    head = head.getNext();

                }

            }

            else {

                Node trav = head;
                int count = 0;

                while (count < index - 1 && trav.getNext() != null) {

                    trav = trav.getNext();
                    count++;

                }

                if (count == index - 1 && trav.getNext() != null) {

                    if (trav.getNext().getNext() == null) {

                        trav.clearNext();

                    }

                    else {

                        trav.setNext(trav.getNext().getNext());

                    }

                }

            }

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