package com.LickingHeights;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int size = 10;
        int lowestNumber = 0;
        int highestNumber = 10;



        int[] array = createNumberArray(size, lowestNumber, highestNumber);
        printArray(array);
        System.out.println("Arrays");
        System.out.println();
        System.out.println("The sum of the array is " + sum(array));
        System.out.println();
        System.out.println("The min of the array is " + min(array));
        System.out.println();
        System.out.println("The max of the array is " + max(array));


        String[] places = {"Dubai", "my room", "school", "castle"};
        String[] adjectives = {"black", "big", "sweet", "many"};
        String[] people = {"Walter", "Melvin", "Hamza", "John"};
        String[] verbs = {"walking", "jogging", "running", "crawling"};
        String[] times = {"8:00", "9:00", "10:00", "11:00"};
        String[] things = {"Chair", "hair", "home", "store"};
        sentenceGenerator(people,verbs,places,times,adjectives,things);

//        System.out.println();
//        System.out.println("Patterns");
//        System.out.println();
//        Pattern1();
//        Pattern2();
//        Pattern3();
//        Pattern4();
//        Pattern5();
    }

    public static int[] createNumberArray(int size, int lowestNumber, int highestNumber) {
        int[] array = new int[size];




        //fill with random values
        for (int i = 0; i < size; i++) {
            array[i] = createRandomNumber(lowestNumber, highestNumber);
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int createRandomNumber(int lowestNumber, int highestNumber) {

        int number = (int) ((Math.random() * (highestNumber - lowestNumber + 1)) + lowestNumber);
        return number;
    }

    public static void Pattern1() {
        for (int rows = 0; rows < 6; rows++) {

            for (int columns = 0; columns < 6; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void Pattern2() {
        for (int rows = 1; rows <= 6; rows++) {

            for (int columns = 0; columns < 6; columns++) {


                System.out.print(rows);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void Pattern3() {
        for (int rows = 1; rows <= 6; rows++) {

            for (int columns = 1; columns <= 6; columns++) {


                System.out.print(columns);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void Pattern4() {
        for (int rows = 1; rows <= 6; rows++) {

            for (int columns = 1; columns <= rows; columns++) {

                System.out.print("x");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void Pattern5() {
        for (int rows = 1; rows <= 6; rows++) {

            for (int columns = 1; columns <= rows; columns++) {

                System.out.print(columns);
            }
            System.out.println();
        }
    }

    public static int sum(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];


        }


        return sum;
    }

    public static int min(int[] array) {
        int min = 1;

        for (int i = 1; i > array.length; i++) {
            min += array[i];


        }


        return min;
    }

    public static int max(int[] array) {
        int max = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }

        }
        return max;
    }


    public static void sentenceGenerator(String[]people,String[]verbs, String[]places,String[]times,String[]adjectives,String[]things){
        System.out.println("I was "+ randomWord(verbs)+ " down the "+ randomWord(places));
        System.out.println(" around "+ randomWord(times)+ " with my best friend "+ randomWord(people));
        System.out.println(" and we "+ randomWord(verbs)+ " a "+ randomWord(adjectives)+ randomWord(things));
        System.out.println(" that was "+ randomWord(verbs)+ randomWord(things)+"s");
    }

    public static String randomWord(String[] array){
        Random random = new Random();
        return array[random.nextInt(array.length)];
    }
 //   public static int bubbleSort(int[] array) {
  //      int bubbleSort, i;
    //    for (int j = i + 1; i < array.length; i++) {
      //      if () {


        //    }


    //    }
    // }

}



