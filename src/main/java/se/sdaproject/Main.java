package se.sdaproject;

import static java.lang.String.*;

public class Main {

    public static void main(String[] args){

        LinkedList list = new LinkedList();
        list.add(1);// key 0
        list.add(2);// key 1
        list.add(4);// key 2
        list.add(8);// key 3
        list.add(9);// key 4 - will be removed

        System.out.println(list.toString()) ;

       list.remove(list,9);

       System.out.println(list.toString());

    }


}
