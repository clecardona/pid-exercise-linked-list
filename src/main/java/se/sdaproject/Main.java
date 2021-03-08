package se.sdaproject;

import static java.lang.String.*;

public class Main {

    public static void main(String[] args){

        LinkedList list = new LinkedList();
        list.add(1);// index 0
        list.add(2);// index 1
        list.add(4);// index 2
        list.add(8);// index 3
        list.add(9);// index 4
        list.add(4);// index 5


       System.out.println(list.search(4)) ;
    }


}
