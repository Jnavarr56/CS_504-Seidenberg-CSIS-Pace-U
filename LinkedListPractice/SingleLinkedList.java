public class SingleLinkedList {

    private Node head;

    public SingleLinkedList() {
        
        head = null;

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

            if (index == 0) {

                newNode.setNext(head);
                head = newNode;

            }

            else {

                Node trav = head;

                int count = 0;

                while (count < index - 1) {

                    trav = trav.getNext();

                    count++;

                }

                newNode.setNext(trav.getNext());
                trav.setNext(newNode);

            }

        } 

    }

    public Node getHead() {

        return head;

    }
    
    public void printList() {

        System.out.println("SINGLE LINKED LIST----------");

        int nodeNum = 0;

        Node trav = head;

        while (trav.getNext() != null) {

            System.out.println(" Node: " + nodeNum + " " + trav.getData());

            trav = trav.getNext();

            nodeNum++;

        }

        System.out.println(" Node: " + nodeNum + " " + trav.getData());

    }

}