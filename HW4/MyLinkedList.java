public class MyLinkedList {

    // Head node is set to null by default because
    // we will have the option to set it later.
    private Node head = null;

    // Default Constructor, does nothing special.
    public MyLinkedList() {

    }

    // Add as a Node instance to the end of the Linked List.
    public void addNode(Node newNode) {

        /* If head is null that means that the head was
            never set (aka there are no Node instances in the)
            list yet. If this is the case, then we can just
            go ahead and set the Node instance we are adding
            as the head (since it would be the first Node)
            instance in the list. */

        if (head == null) {  
            
            System.out.println("== Adding " + newNode.getData() + " to beginning of List ==\n");
                                
            head = newNode;     
                                
        }

        /*  If the head is not equal to Null that means
            that it has been set (aka there is at least)
            one Node instance in the list. In which case,
            we have 'walk' (aka traverse) through all the
            Node instances that are in the list until we 
            are at the last one. Each Node instance has 
            a reference to another Node instance (called 'next').
            We can walk through all of the Node instances by 
            setting a variable equal to the first Node in the list (head)
            and then, over and over again (in a loop), set that Node variable equal to
            it's 'next' Node instance. We know to stop when we are 
            at the end of the list, which would be when the Node variable's
            'next' is null instead of another Node instance. 
            Finally, since we are at the end, we can set that Node instance's
            'next' to the newNode. */

        else {                  
                                
            Node trav = head;   
            
            while (trav.getNext() != null) {

                trav = trav.getNext();

            }

            trav.setNext(newNode);

            System.out.println("== Adding " + newNode.getData() + " to end of List (after " + trav.getData() + ") ==\n");

        }
        
    }   

    // Prints the data of each Node, one after another.
    public void printList() {

        /*  We would only have to print stuff if there
            actually Node instances in the list. If 
            the head is null, that means no Node instances
            were ever added to the list. So, we only 
            procede here if the head is not null. */
        
        if (head != null) {

            /* 'Walk' through the Nodes just like we did
                above, except this time we want to print
                the data inside each Node when we cycle 
                through them in the loop. When the loop
                is done, we have the last Node in the loop
                so we are gonna want to print that too. */

            System.out.println("== Printing All Nodes in List ==");
            
            int count = 0;
            Node trav = head;

            while (trav.getNext() != null) {

                System.out.println(trav.getData() + " Index: " + count);

                trav = trav.getNext();

                count++;

            }

            System.out.println(trav.getData() + " Index: " + count);

        }

    }   
    // Add a new Node instance to the list but instead of adding it 
    // to the end, add it at a certain place in the list. 
    public void insertBefore(int index, Node newNode) {

        /*  If head is null, just ignore the index and
            at the newNode at the beginning. */
        if (head == null) {

            head = newNode;

        }

        else {

        /*  If the index is 0, that means we want to
            add the new Node at the beginning of the list
            essentially making it the new 'head' of the list. */
            if (index == 0) {

                System.out.println(
                    "== Inserting " + newNode.getData() + "before Index " + 0 + "(" + head.getData() + ") =="
                );

                newNode.setNext(head);
                head = newNode;

            }

            // =======EXPLAIN THIS PART=============
            // =======EXPLAIN THIS PART=============
            // =======EXPLAIN THIS PART=============

            else {

                int count = 0;
                Node trav = head;

                while (count < index - 1 && trav.getNext() != null) {

                    trav = trav.getNext();

                    count++;

                }

                System.out.println(
                    "== Inserting " + newNode.getData() + " before Index " + index + " (" + trav.getNext().getData() + ") ==\n"
                );

                if (count == index - 1) {

                    if (trav.getNext() == null) {

                        trav.setNext(newNode);

                    }

                    else {

                        newNode.setNext(trav.getNext());
                        trav.setNext(newNode);

                    }

                }

            }

        }

    }

    // Add a new Node instance to the list but instead of adding it 
    // to the end, add it at a certain place in the list. 
    public void insertAfter(int index, Node newNode) {

        /*  If head is null, just ignore the index and
            at the newNode at the beginning. */
        if (head == null) {

            head = newNode;

        }

        else {

        /*  If the index is 0, that means we want to
            add the new Node at the beginning of the list
            essentially making it the new 'head' of the list. */
            if (index == 0) {

                System.out.println(
                    "== Inserting " + newNode.getData() + " after Index " + 0 + " (" + head.getData() + ") ==\n"
                );

                newNode.setNext(head.getNext());
                head.setNext(newNode);

            }

            // =======EXPLAIN THIS PART=============
            // =======EXPLAIN THIS PART=============
            // =======EXPLAIN THIS PART=============

            else {

                int count = 0;
                Node trav = head;

                while (count < index && trav.getNext() != null) {

                    trav = trav.getNext();

                    count++;

                }

                System.out.println(
                    "== Inserting " + newNode.getData() + " after Index " + index + "(" + trav.getData() + ") ==\n"
                );

                if (count == index) {

                    if (trav.getNext() == null) {

                        trav.setNext(newNode);

                    }

                    else {

                        newNode.setNext(trav.getNext());
                        trav.setNext(newNode);

                    }

                }

            }

        }

    }

    // =======EXPLAIN THIS PART=============
    // =======EXPLAIN THIS PART=============
    // =======EXPLAIN THIS PART=============

    public int indexOf(String str) {

        if (head == null) {

            return -1;

        }

        int index = 0;
        Node trav = head;

        while (trav.getNext() != null) {

            if (trav.getData().equals(str)) {

                return index;

            } 

            trav = trav.getNext();

            index++;

        }
        
        return trav.getData().equals(str) ? index : -1;

    }

    // =======EXPLAIN THIS PART=============
    // =======EXPLAIN THIS PART=============
    // =======EXPLAIN THIS PART=============
    public void removeNodeAt(int index) {

        // Nothing to remove.
        if (head == null) {

            return;

        }

        // Only head exists and we want to remove head.
        else if (head.getNext() == null && index == 0) {
            
            head = null;

        }

        // More than head exists.
        else if (head != null) {
            
            int count = 0;
            Node trav = head;

            while (count < index - 1 && trav.getNext() != null) {

                trav = trav.getNext();

                count++;

            }

            if (count == index - 1) {

                System.out.println(
                    "== Removing " + trav.getNext().getData() + " from Index " + index + " ==\n"
                );
                
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