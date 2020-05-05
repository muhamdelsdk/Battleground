package com.company;


import javafx.beans.property.ReadOnlyBooleanWrapper;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static battlefield playersBattleField = new battlefield();
    public static battlefield computerBattleField = new battlefield();
    public static int playeraBttleground[][] = new int[10][10];
    public static int computerBattleground[][] = new int[10][10];
    public static int firstUserBlock, secondUserBlock, thirdUserBlock, fourthUserBlock, fifthUserBlock;
    public static int firstRandomBlockForComputer, secondRandomBlockForComputer, thirdRandomBlockForComputer, fourthRandomBlockForComputer, fifthRandomBlockForComputer;
    public static int thePlayerHitCell;
    public static Scanner coordinates = new Scanner(System.in);

    public static void main(String[] args) {
        PlayersShipsCoordinates();
        computersShipsCoordinated();
        int count = 2;
        for (int i = 0; i <= 101; i++) {
            if (count % 2 == 0) {
                playerHit();
           /* computerBattleField.Battleground(computerBattleground);
            playersBattleField.Battleground(playeraBttleground); */
                checkForWin();


            }
            if (count % 2 != 0) {
                computerhit();
              /*  computerBattleField.Battleground(computerBattleground);
                playersBattleField.Battleground(playeraBttleground); */
                checkForWin();

            }

            count++;
        }
    }

    public static void PlayersShipsCoordinates() {


        System.out.println("player x enter your ships coordinates");
        System.out.println("player x enter your first ship coordinates");


        firstUserBlock = coordinates.nextInt();
        if (firstUserBlock > 0 && firstUserBlock <= 100) {
            turningTheCellNumberIntoXandY(firstUserBlock);
            playeraBttleground[row][column] = 1;
            System.out.println("you have taken this place successfully ");
            System.out.println((row + 1) + "    " + (column + 1));


        }
        System.out.println("player x enter your second ship coordinates");

        secondUserBlock = coordinates.nextInt();
        if (secondUserBlock > 0 && secondUserBlock <= 100) {
            turningTheCellNumberIntoXandY(secondUserBlock);
            playeraBttleground[row][column] = 1;
            System.out.println("you have taken this place successfully ");

            System.out.println((row + 1) + "    " + (column + 1));


        }
        System.out.println("player x enter your third ship coordinates");

        thirdUserBlock = coordinates.nextInt();
        if (thirdUserBlock > 0 && thirdUserBlock <= 100) {
            turningTheCellNumberIntoXandY(thirdUserBlock);
            playeraBttleground[row][column] = 1;
            System.out.println("you have taken this place successfully ");

            System.out.println((row + 1) + "    " + (column + 1));


        }
        System.out.println("player x enter your fourth ship coordinates");

        fourthUserBlock = coordinates.nextInt();
        if (fourthUserBlock > 0 && fourthUserBlock <= 100) {
            turningTheCellNumberIntoXandY(fourthUserBlock);
            playeraBttleground[row][column] = 1;
            System.out.println("you have taken this place successfully ");
            System.out.println((row + 1) + "  " + (column + 1));

        }
        System.out.println("player x enter your fifth ship coordinates");

        fifthUserBlock = coordinates.nextInt();
        if (fifthUserBlock > 0 && fifthUserBlock <= 100) {
            turningTheCellNumberIntoXandY(fifthUserBlock);
            playeraBttleground[row][column]
                    = 1;
            System.out.println("you have taken this place successfully ");
            System.out.println((row + 1) + "   " + (column + 1));

        }
        playersBattleField.Battleground(playeraBttleground);

    }


    public static void computersShipsCoordinated() {
        Random randNumber1 = new Random();
        Random randNumber2 = new Random();
        Random randNumber3 = new Random();
        Random randNumber4 = new Random();
        Random randNumber5 = new Random();


        firstRandomBlockForComputer = (randNumber1.nextInt(100) + 1);
        turningTheCellNumberIntoXandY(firstRandomBlockForComputer);
        computerBattleground[row][column] = 2;
        System.out.println(firstRandomBlockForComputer);


        secondRandomBlockForComputer = (randNumber2.nextInt(100) + 1);
        turningTheCellNumberIntoXandY(secondRandomBlockForComputer);
        computerBattleground[row][column] = 2;
        System.out.println(secondRandomBlockForComputer);
        thirdRandomBlockForComputer = (randNumber3.nextInt(100) + 1);
        turningTheCellNumberIntoXandY(thirdRandomBlockForComputer);
        computerBattleground[row][column] = 2;
        System.out.println(thirdRandomBlockForComputer);
        fourthRandomBlockForComputer = (randNumber4.nextInt(100) + 1);
        turningTheCellNumberIntoXandY(fourthRandomBlockForComputer);
        computerBattleground[row][column] = 2;
        System.out.println(fourthRandomBlockForComputer);
        fifthRandomBlockForComputer = (randNumber5.nextInt(100) + 1);
        turningTheCellNumberIntoXandY(fifthRandomBlockForComputer);
        computerBattleground[row][column] = 2;
        System.out.println(fifthRandomBlockForComputer);


        computerBattleField.Battleground(computerBattleground);


    }


    public static int column;
    public static int row;


    public static int turningTheCellNumberIntoXandY(int CellNumber) {


        if (CellNumber > 0 && CellNumber < 11) {
            row = 0;
            column = CellNumber - 1;
            return column;
        }
        if (CellNumber > 10 && CellNumber < 21) {
            row = 1;
            column = CellNumber - 11;
            return column;
        }
        if (CellNumber > 20 && CellNumber < 31) {
            row = 2;
            column = CellNumber - 21;
            return column;
        }
        if (CellNumber > 30 && CellNumber < 41) {
            row = 3;
            column = CellNumber - 31;
            return column;
        }
        if (CellNumber > 40 && CellNumber < 51) {
            row = 4;
            column = CellNumber - 41;
            return column;
        }
        if (CellNumber > 50 && CellNumber < 61) {
            row = 5;
            column = CellNumber - 51;
            return column;
        }
        if (CellNumber > 60 && CellNumber < 71) {
            row = 6;
            column = CellNumber - 61;
            return column;
        }
        if (CellNumber > 70 && CellNumber < 81) {
            row = 7;
            column = CellNumber - 71;
            return column;
        }
        if (CellNumber > 80 && CellNumber < 91) {
            row = 8;
            column = CellNumber - 81;
            return column;
        }
        if (CellNumber > 90 && CellNumber < 101) {
            row = 9;
            column = CellNumber - 91;
            return column;
        }
        return row;

    }

    public static void playerHit() {


        System.out.println("select the ship you wanna hit ");

        thePlayerHitCell = coordinates.nextInt();
        if (thePlayerHitCell == firstRandomBlockForComputer) {
            System.out.println(" WOW ... you have hit a computer ship");
            turningTheCellNumberIntoXandY(firstRandomBlockForComputer);
            computerBattleground[row][column] = 0;
        }

        if (thePlayerHitCell == secondRandomBlockForComputer) {
            System.out.println(" WOW ... you have hit a computer ship");
            turningTheCellNumberIntoXandY(secondRandomBlockForComputer);
            computerBattleground[row][column] = 0;


        }
        if (thePlayerHitCell == thirdRandomBlockForComputer) {
            System.out.println(" WOW ... you have hit a computer ship");
            turningTheCellNumberIntoXandY(thirdRandomBlockForComputer);
            computerBattleground[row][column] = 0;

        }
        if (thePlayerHitCell == fourthRandomBlockForComputer) {
            System.out.println(" WOW ... you have hit a computer ship");
            turningTheCellNumberIntoXandY(fourthRandomBlockForComputer);
            computerBattleground[row][column] = 0;

        }
        if (thePlayerHitCell == fifthRandomBlockForComputer) {
            System.out.println(" WOW ... you have hit a computer ship");
            turningTheCellNumberIntoXandY(fifthRandomBlockForComputer);
            computerBattleground[row][column] = 0;

        }



     /*   else
        {
            System.out.println("you missed");   
        }
       */
    }


    public static void computerhit() {
        System.out.println("computer turn ");

        Random randomComputer = new Random();
        int randomForComputerHit = randomComputer.nextInt(101);
        System.out.println("the computer wants to hit the  " + randomForComputerHit + "block ");


        if (randomForComputerHit == firstUserBlock) {
            System.out.println(" the computer hit  onr of your ships");
            turningTheCellNumberIntoXandY(firstRandomBlockForComputer);
            playeraBttleground[row][column] = 0;


        }
        if (randomForComputerHit == secondUserBlock) {
            System.out.println("the computer hit  onr of your ships");
            turningTheCellNumberIntoXandY(secondRandomBlockForComputer);
            playeraBttleground[row][column] = 0;


        }
        if (randomForComputerHit == thirdUserBlock) {
            System.out.println(" the computer hit  onr of your ships");
            turningTheCellNumberIntoXandY(thirdRandomBlockForComputer);
            playeraBttleground[row][column] = 0;

        }
        if (randomForComputerHit == fourthUserBlock) {
            System.out.println(" the computer hit  onr of your ships");
            turningTheCellNumberIntoXandY(fourthRandomBlockForComputer);
            playeraBttleground[row][column] = 0;

        }
        if (randomForComputerHit == fifthUserBlock) {
            System.out.println("the computer hit  onr of your ships");
            turningTheCellNumberIntoXandY(fifthRandomBlockForComputer);
            playeraBttleground[row][column] = 0;

        }
    }

    public static void checkForWin() {
        int count1 = 0 ;
                int count2 = 0  ;
        System.out.println("checking for win");
        computerBattleField.Battleground(computerBattleground);


        if (firstRandomBlockForComputer == 0) {
            count1 ++ ;
            if (secondRandomBlockForComputer == 0)
            {count1 ++ ;
                if (thirdRandomBlockForComputer == 0)
                {count1 ++ ;
                    if (fourthRandomBlockForComputer == 0)
                    {count1 ++ ;
                        {
                            if (fifthRandomBlockForComputer == 0) {
                                count1++;
                            }
                            if(count1 == 5)
                            {
                                System.out.println("WOOOho you have destroyed all computers ships");
                                System.out.println("GAME OVER");
                                System.out.println("thank you");
                            }
                        }


                        }

                        }
                    }
        }
        if (firstUserBlock == 0) {
            if (secondUserBlock == 0) if (thirdUserBlock == 0) if (fourthUserBlock == 0) if (fifthUserBlock == 0) {
                System.out.println("the computer has destroyed all your ships");

                System.out.println("GAME OVER");
                System.out.println("thank you");
            }


        }


    }}






