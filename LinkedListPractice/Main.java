public class Main {

    public static void main(String args[]) {

        System.out.println("Implementation of a Single Linked List ========");

        // Implementation of a Single Linked List ========

        // Create Nodes with some data.
        Node a = new Node("Apples");
        Node b = new Node("Bananas");
        Node c = new Node("Cherries");

        Node d = new Node("Cantaloupe");

        // Add Nodes to LinkedList (at end) and print.
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.add(a);
        singleLinkedList.add(b);
        singleLinkedList.add(c);
        singleLinkedList.printList();

        System.out.println("");

        // Add a Nodes to LinkedList at specific index and print.
        singleLinkedList.add(d, 2);
        singleLinkedList.printList();

        System.out.println("");

        // Remove last Node and print.
        singleLinkedList.remove();
        singleLinkedList.printList();

        System.out.println("");

        // Remove Node at specific index.
        singleLinkedList.remove(1);
        singleLinkedList.printList();
        


        /*

        System.out.println("\n\nImplementation of a Double Linked List ========");
        // Implementation of a Double Linked List ========

        Node a2 = new Node("Adam");
        Node b2 = new Node("Bryan");
        Node c2 = new Node("Cheryl");

        Node d2 = new Node("Candice");

        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add(a2);
        doubleLinkedList.add(b2);
        doubleLinkedList.add(c2);
        doubleLinkedList.printForwards();

        doubleLinkedList.add(d2, 2);
        doubleLinkedList.printForwards();

        doubleLinkedList.printBackwards();

        */

    }
}