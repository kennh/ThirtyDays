package com.company;

import java.util.LinkedList;

public class Collections2 {


    public static void main(String[] args) {
        // que
        LinkedList<String> names = new LinkedList<String>();
        names.add("Caleb");
        names.add("Sally");
        names.add("Robert");
        System.out.println(names.remove());
        System.out.println(names.remove());
        System.out.println(names.remove());

        // stack
        names.push("Caleb");
        names.push("Sally");
        names.push("Robert");
        System.out.println(names.pop());
        System.out.println(names.remove());
        System.out.println(names.removeFirst());
    }
}
