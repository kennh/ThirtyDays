package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Collections2 {


    public static void main(String[] args) {
        // que
        LinkedList<String> names = new LinkedList<String>();
//        names.add("Caleb");
//        names.add("Sally");
//        names.add("Robert");
//        System.out.println(names.remove());
//        System.out.println(names.remove());
//        System.out.println(names.remove());

        // stack
        names.push("Caleb");
        names.push("Sally");
        names.push("Robert");

//        Iterator<String> it = names.iterator();
//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }
        names.add(2, "Susan");
//        The for each loop will do the  same result as the above 4 lines. for( element : where you are getting element)
        for (String s: names) {
            System.out.println(s);
        }

        names.add(2, "susan");

//        System.out.println(names.pop());
//        System.out.println(names.remove());
//        System.out.println(names.removeFirst());
    }
}
