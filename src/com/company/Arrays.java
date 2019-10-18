package com.company;

public class Arrays {
    public static void main(String[] args) {
        int [][] data = {
                {4,6,3,10},
                {4,2,40,1,5,8,9,63,2},
                {5,34,1,43}
        };
        data[1][2] = 49;
//        System.out.println(data[1][2]);

//        System.out.println(data.length); // row
//        System.out.println(data[0].length); // column

        // iterate through a 2d array
        for(int i = 0; i < data.length; i++) {
//            System.out.println("row index " + i);
            for(int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]);
            }
            System.out.println();
        }
    }
}
