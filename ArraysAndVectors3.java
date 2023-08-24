//ArraysAndVectors.java
//Mak Ramos Yang
// 8-24-23
public class ArraysAndVectors3 {
    public static void main(String[] args) {

        System.out.printf("Welcome to the Array Program\n\n");

        //create an int array
        int[] myNumbers = new int[8];

        //fill the array with ints

        myNumbers[0] = 1;
        myNumbers[1] = 2;
        myNumbers[2] = 3;
        myNumbers[3] = 4;
        myNumbers[4] = 5;
        myNumbers[5] = 6;
        myNumbers[6] = 7;
        myNumbers[7] = 8;


        //output the array

        System.out.println("myNumbers[3] = " + myNumbers[3]);
        System.out.println("\n\n");
        for (int i = 0; i < 8; i++) {

            //something
            System.out.println("myNumbers[" + i + "] is: " + myNumbers[i]);

        }

        //create a 2D array
        int[][] numberGrid = {
                {5, 10, 15},
                {20, 25, 30},
                {35, 40, 45},
                {50, 55, 60},
                {0}
        };

        int myFiveContainer = 0;
        for (int i = 0; i < numberGrid.length; i++) {
            for (int j = 0; j < numberGrid[i].length; j++) {
                System.out.print(numberGrid[i][j]);
                System.out.println();



            }




                }
            }
        }
