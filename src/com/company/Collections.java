package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Collections {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(new File("text"));

        List<String> students = new ArrayList<String>();
        while(in.hasNextLine()) {
            students.add(in.nextLine());
        }

        for(int i = 0; i < students.size(); i++) {
            System.out.println("name: " + students.get(i));
        }
        in.close();


    }
}

