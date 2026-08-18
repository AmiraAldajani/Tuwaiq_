import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Lab2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Q1
        System.out.println("QUESTION 1 ===================================================");/*
        ArrayList<String> stringArray = new ArrayList<>(); String word = " ";
        System.out.println("Enter as many words as u want: (x to exit)");
        while ( !word.equalsIgnoreCase("x") ){
            System.out.print("Enter a word (x to exit): ");
            word = s.nextLine();
            if ( !word.equalsIgnoreCase("x" )) stringArray.add(word);
        }
        int num = stringArray.get(0).length();
        for ( int i = 0 ; i < stringArray.size(); i++ ) {
            if (stringArray.get(i).length() > num)
                num = stringArray.get(i).length();
        }
        for ( int i = 0 ; i < stringArray.size(); i++ ) {
            if (stringArray.get(i).length() == num)
                System.out.print(stringArray.get(i)+" ");
        }
        System.out.println();*/

        //OR, create a new array with new values. And make old values Fixed not as input. ?

        String[] stringArray = {"cat", "dog", "red", "is", "am"};
        int num = stringArray[0].length();
        for ( int i = 0 ; i < stringArray.length; i++ ) {
            if (stringArray[i].length() > num)
                num = stringArray[0].length();
        }
        ArrayList<String> newStringArr = new ArrayList<>();
        for ( int i = 0 ; i < stringArray.length; i++ ) {
            if (stringArray[i].length() == num)
                newStringArr.add(stringArray[i]);
        }
        System.out.println(newStringArr);

        //Q2
        System.out.println("QUESTION 2 ===================================================");
        int[] arrayInt = { 1, 1,1,3,3,5};
        ArrayList<Integer> values = new ArrayList<>();
        int value, accurs;
        for ( int i=0; i< arrayInt.length; i++){
            value = arrayInt[i]; accurs =0;
            if (!values.contains(value)){ values.add(value);
                for ( int j=0; j< arrayInt.length; j++)
                    if ( value == arrayInt[j]) accurs++;
                if ( accurs == 1)
                    System.out.println(value + " accurs "+ accurs+ " time");
                else System.out.println(value + " accurs "+ accurs+ " times");}
        }

        //Q3
        System.out.println("QUESTION 3 ===================================================");
        System.out.print("Please enter the amount of numbers to find: ");
        int k = s.nextInt();
        int[] numArray = {1,4,17,7,25,3,100};
        Arrays.sort(numArray);
        for (int i =numArray.length-1; i>= numArray.length-k; i--) {
            System.out.print(numArray[i]+" ");
        }
        System.out.println();


        //Q4 this question was too hard
        System.out.println("QUESTION 4 ===================================================");
        int[] numArray2 = {5,4,3,2,1};
        reverse(numArray2, 0, numArray2.length-1);
        for (int i=0; i <numArray2.length; i++) {
            System.out.print(numArray2[i] + " ");
        }
        System.out.println();

        //Q5
        System.out.println("QUESTION 5 ===================================================");
        System.out.print("Please pick from the following: \n1. Accept elements.\n2. Display elements.\n3. Search an element.\n4. Sort the array.\n5. Stop");
        int choice = s.nextInt();
        while (choice != 5){
            switch (choice){
                case 1:

            }
            System.out.print("Please pick from the following: \n1. Accept elements.\n2. Display elements.\n3. Search an element.\n4. Sort the array.\n5. Stop");
            choice = s.nextInt();
        }


        //Q6
        System.out.println("QUESTION 6 ===================================================");
        int min, max, count;
        System.out.print("Enter minimum: ");
        min = s.nextInt();
        System.out.print("Enter maximum: ");
        max = s.nextInt();
        System.out.print("Enter how many numbers to generate: ");
        count = s.nextInt();
        System.out.println("Random numbers within the specified range: ");
        for (int i= 0; i< count; i++) {
            System.out.print(getRandomNum(min, max));
            if (i <count -1) System.out.print(" | ");
        }
        System.out.println();


        //Q7
        System.out.println("QUESTION 7 ===================================================");

        //Q8
        System.out.println("QUESTION 8 ===================================================");

    }

    public static void reverse( int[] i, int j, int k) {
        if (j >= k) return;
        int num = i[j];
        i[j] = i[k];
        i[k] = num;
        reverse(i, j + 1, k - 1);
    }

//    public static int getRandomNum(int min, int max) {
//        return (int)((Math.random()* (max-min))+ min);
//    }
    public static int getRandomNum(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }
}
