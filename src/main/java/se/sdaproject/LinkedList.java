package se.sdaproject;

import static java.lang.String.*;

// a "box" in our previous picture
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
        // int num is available!

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

    // useful for testing!
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



    public String search(int integerToFind) {
        Node current = first;
        String result = "";
        int index = 0;

        while (current!= null) {

            if (current.elem == integerToFind) {
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



    public int get(int i) {

        Node current = first;
        int result = -1;
        int indexToReach = 0;

        if (i >= 0 ) {
            while (current != null) { // other cases will return -1

                if (indexToReach == i) {// if the index is reached
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



}