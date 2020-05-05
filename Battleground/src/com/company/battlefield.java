package com.company;

import java.util.Random;

public class battlefield {
    public  static int randomNUmber  ;




    public static void Battleground(int seaBattlefield[][]) {

        String smallSpace = " ";

        System.out.print(smallSpace);
        // draw the first line
        for (int j = 1; j < 11; j++) {
            System.out.print(j + smallSpace);
        }
        System.out.println();
// draw the board

        for (int i = 0; i < 10; i++) {
            System.out.print((i +1) + smallSpace);
            for (int k = 0; k < 10; k++) {
                if (seaBattlefield[k][i] == 0) {
                    System.out.print(smallSpace + smallSpace ) ;
                } else System.out.print(seaBattlefield[k][i] + smallSpace);
            }
            System.out.print(i+1);
            System.out.println();
        }
        // draw the last line


        System.out.print(smallSpace);
        for (int j = 1; j < 11; j++) {
            System.out.print(j + smallSpace);
        }
        System.out.println(smallSpace);
    }
    public static int generateRandomNumber ()
    {
       Random randomNumber = new Random() ;
       randomNUmber =randomNumber.nextInt(101) ;
       return randomNUmber ;

    }
}
