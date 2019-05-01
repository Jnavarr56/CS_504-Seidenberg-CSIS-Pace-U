import java.util.*;

public class Main {

    private static void bubbleSort(int[] arr, boolean ascending) {

        int temp;
        boolean done;

        do {

            done = true;

            for (int i = 0; i < arr.length - 1; i ++) {

                if (ascending ? arr[i + 1] < arr[i] : arr[i + 1] > arr[i]) {

                    done = false;

                    temp = arr[i];

                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp; 

                }

            }   

        } while(!done);

        System.out.println(
            "== " +
            (ascending ? "Bubble Sort: Ascending" : "Bubble Sort: Descending") +
            " ==\n" +
            Arrays.toString(arr) +
            "\n"
        );

    }

    public static void main(String args[]) {

        // ========== BUBBLE SORT - Prints results Ascending and Descending =============
        System.out.println("\n\n======== Implementation of Bubble Sort =================\n");
        // Test Data
        int[] sortTestData = {55, 23, 62, 3, 1, 79, 100, 5000, 5, 1, 12, 67, 4000, 231};

        System.out.println("== Unsorted Array ==\n" + Arrays.toString(sortTestData) + "\n");
        
        // Ascending
        bubbleSort(Arrays.copyOf(sortTestData, sortTestData.length), true);

        // Descending
        bubbleSort(Arrays.copyOf(sortTestData, sortTestData.length), false);

        // ==============================================================================

        // ========== Linked List (SINGLE) =============================================
        System.out.println("\n\n======== Implementation of a Single Linked List ========\n");
        
        // Create Nodes with some data.
        Node a = new Node("Apples");
        Node b = new Node("Bananas");
        Node c = new Node("Cherries");

        // Add Nodes to linkedlist (at end) and print.
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addNode(a);
        linkedList.addNode(b);
        linkedList.addNode(c);
        linkedList.printList();

        System.out.println("");

        // Add a Nodes to linkedlist at specific index and print.
        linkedList.insertBefore(2, new Node("Cantaloupe"));
        linkedList.printList();

        System.out.println("");

        // Add a Nodes to linkedlist after specific index and print.
        linkedList.insertAfter(0, new Node("Blueberries"));
        linkedList.printList();

        System.out.println("");

        // Remove Node at specific index.
        linkedList.removeNodeAt(3);
        linkedList.printList();

        System.out.println("");

        int blueBerriesIndex = linkedList.indexOf("Blueberries");
        int crabApplesIndex = linkedList.indexOf("Crab Apples");

        System.out.println(

            "Blueberries are " + (blueBerriesIndex != -1 ? "at index " + blueBerriesIndex  + "." : "not in this linked list.")
            
        );

        System.out.println(
            
            "Crab Apples are " + (crabApplesIndex != -1 ? "at index " + crabApplesIndex + "." : "not in this linked list.")
            
        );

    }

}