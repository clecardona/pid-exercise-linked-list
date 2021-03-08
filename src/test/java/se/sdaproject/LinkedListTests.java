package se.sdaproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LinkedListTests {

    @Test
    void addsTwoNumbers() {
        assertEquals(2, 1 + 1, "1 + 1 should equal 2");
    }

    @Test
    void addANumberToList() {
        LinkedList list = new LinkedList();
        list.add(5);
        String expected = "LinkedList(5)";
        assertEquals(list.toString(), expected);
    }

    @Test
    void testToStringOfEmptyList() {
        LinkedList list = new LinkedList();
        String expected = "LinkedList()";
        assertEquals(list.toString(), expected);
    }

    @Test
    void testSearch() {
        LinkedList list = new LinkedList();
        list.add(1);// index 0
        list.add(2);// index 1
        list.add(4);// index 2
        list.add(8);// index 3
        list.add(9);// index 4
        list.add(4);// index 5

        assertEquals(list.search(8), "3");
        assertEquals(list.search(9), "4");
        assertEquals(list.search(4), "2 5");
        assertEquals(list.search(3), "");

    }

    @Test
    void testSearchFirst() {
        LinkedList list = new LinkedList();
        list.add(1);// index 0
        list.add(2);// index 1
        list.add(4);// index 2
        list.add(8);// index 3
        list.add(9);// index 4


        assertEquals(list.searchFirst(8), 3);
        assertEquals(list.searchFirst(9), 4);
        assertEquals(list.searchFirst(3), -1);

    }

    @Test
    void testSize() {
        LinkedList list = new LinkedList();

        assertEquals(list.size(), 0);

        list.add(1);
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(9);

        assertEquals(list.size(), 5);

        list.add(10);
        list.add(11);

        assertEquals(list.size(), 7);

    }

    @Test
    void testGet() {
        LinkedList list = new LinkedList();
        list.add(1);// index 0
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(9);// index 4

        assertEquals(list.get(0), 1);
        assertEquals(list.get(3), 8);
        assertEquals(list.get(4), 9);
        assertEquals(list.get(12), -1);//outOfBounds

    }

    @Test
    void testRemove() {
        LinkedList list = new LinkedList();
        list.add(1);// key 0
        list.add(2);// key 1
        list.add(4);// key 2 - will be removed
        list.add(8);// key 3
        list.add(9);// key 4


        list.remove(list,4);

        String expected = "LinkedList(1,2,8,9)";

        assertEquals(list.toString(), expected);

        list.remove(list,4);
        expected = "LinkedList(1,2,8,9)";

        assertEquals(list.toString(), expected);

        list.remove(list,8);
        expected = "LinkedList(1,2,9)";

        assertEquals(list.toString(), expected);

        list.remove(list,1);
        expected = "LinkedList(2,9)";

        assertEquals(list.toString(), expected);

    }

}
