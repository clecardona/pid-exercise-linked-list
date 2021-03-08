package se.sdaproject;

import static java.lang.String.*;

// a node
class Node {
    // field 1: the data in our case just an integer
    int elem;
    // field 2: the reference to the next node
    Node next;
    Node(int num) {
        this.elem = num;
        this.next = null;
    }
}


public class LinkedList {

    private Node first = null;

    public void add(int num) {

        // step 1: is the linked list still empty?
        if (first == null) {
            // in this case, the linked list is empty
            Node node = new Node(num); // node.next == null
            first = node;
        } else {
            // in this case, the linked list is *not* empty
            // this means, first != null

            // step 2: find the last node

            // Key: introduce a temporary variable!
            // we can then update this temporary variable,
            // without changing "first"!
            // important, since "first" should not be changed!
            Node current = first;
            while (current.next != null) { // current is not the last node!
                current = current.next;
            }

            // step 3: create a new node with the given int "num"
            Node node = new Node(num);

            // step 4: change the reference of the last node to
            // point to the new node
            current.next = node;
        }

    }


    public String toString() {
        // goal is to return a string like this:
        // "LinkedList(5,2,10)"

        StringBuilder builder = new StringBuilder();

        // call methods on "builder" to add strings

        builder.append("LinkedList(");
        // append strings for each integer in the list

        if (first == null) {
            // what to do here?
            // string to be returned: "LinkedList()"
            // nothing left to do!
        } else {
            // here, we know that first != null
            // go through the chain of nodes, starting with
            // "first"

            Node current = first;
            // treat first element specially:
            builder.append("" + current.elem);

            while (current.next != null) {
                current = current.next;
                builder.append("," + current.elem);
            }
            // current.next == null
            // we have already appended the last num!
        }

        // append ")"
        builder.append(")");
        return builder.toString();
    }

    /**
     * Search index that match the value passed in argument.
     * @param valueToFind
     * @return a String that concatenates the index corresponding
     */
    public String search(int valueToFind) {
        Node current = first;
        String result = "";
        int index = 0;

        while (current!= null) {

            if (current.elem == valueToFind) {
                // if the element is found
                //the value of the index is converted
                //to a string and concatenated

                result +=  Integer.toString(index)+" ";

            }

            current = current.next;
            index++;
        }

        return result.trim();

    }

    /**
     * Search THE FIRST index that match the value passed in argument.
     * @param valueToFind
     * @return an int corresponding to the 1st index with the value
     */
    public int searchFirst(int valueToFind) {
        Node current = first;
        int  result =-1;
        int index = 0;

        while (current!= null) {

            if (current.elem == valueToFind) {
                // if the element is found
                result =index;
                break; // exits the loop

            }

            current = current.next;
            index++;
        }

        return result;

    }

    public int get(int key) {

        Node current = first;
        int result = -1; // by default
        int indexToReach = 0;

        if (key >= 0 ) {
            while (current != null) { // other cases will return -1

                if (indexToReach == key) {// if the index is reached
                    result = current.elem; // return the element
                    break;// stop the loop
                }
                current = current.next;
                indexToReach++;
            }
        }
        return result;
    }

    public int size() {

        Node current = first;

        int count = 1;

        //the if statement escape the case: empty list -> list.size()= 0
        if (current != null) {

            while (current.next != null) {
                count++;
                current = current.next;
            }

        }else{
            count = 0;
        }

        return count;

    }

    public LinkedList remove(LinkedList list, int valueToDelete) {

        Node current = list.first;
        Node previous = null;

        //list.searchFirst(valueToDelete);


            if (current != null && current.elem == valueToDelete) {
                list.first = current.next; // Changed the first by the next after current
                return list;
            }

            while (current != null && current.elem != valueToDelete) { // iterate through the list
                // If current does not hold key
                // continue to next node
                previous = current;
                current = current.next;
            }
            //here: current.elem == valueToDelete
            // Unlink current from linked list
            if (current != null) {
                previous.next = current.next;
            }

        return list;
    }



}