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
                num = stringArray[i].length();
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
        System.out.print("Please pick from the following: \n1. Accept elements.\n2. Display elements.\n3. Search an element.\n4. Sort the array.\n5. Stop\nanswer: ");
        int choice = s.nextInt(), size; boolean isExist = false;
        System.out.print("Please enter the size of the array: ");
        size = s.nextInt(); s.nextLine();
        int[] arrayUser = new int[size];
        while (choice != 5){
            switch (choice){
                case 1:
                    isExist = true; int element;
                    for ( int i=0; i< size; i++){
                        System.out.print("Enter element "+i+": ");
                        element = s.nextInt();
                        arrayUser[i]= element;
                    }System.out.println(); break;
                case 2:
                    if (isExist){
                        for (int i = 0; i < size; i++) {
                            System.out.print(arrayUser[i]+" | ");
                        }
                        System.out.println(); break;
                    }
                    else {
                        System.out.println("You have not entered the array elements yet");
                        break;
                    }
                case 3: // tell user if element exists or not. hes gonna enter a singular number
                    System.out.print("Enter the number: ");
                    int element_ = s.nextInt(); s.nextLine(); boolean exist = false;
                    for ( int i =0; i <size; i++){
                        if ( arrayUser[i]== element_) exist = true;
                    }
                    if (exist) System.out.println("Number is found");
                    else System.out.println("Number has nos been found");

                    break;

                case 4:
                    Arrays.sort(arrayUser);
                    for (int i = 0; i < size; i++) {
                        System.out.print(arrayUser[i]+" | ");
                    }
                    System.out.println();
            }
            System.out.print("Please pick from the following: \n1. Accept elements.\n2. Display elements.\n3. Search an element.\n4. Sort the array.\n5. Stop\nanswer: ");
            choice = s.nextInt();
        }


        //Q6
        System.out.println("QUESTION 6 ===================================================");
        int min, max, count;
        System.out.print("Enter minimum: ");
        min = s.nextInt();
        System.out.print("Enter maximum: ");
        max = s.nextInt();
        System.out.print("Now enter how many numbers to generate: ");
        count = s.nextInt(); s.nextLine();
        System.out.println("Random numbers within the specified range are: ");
        for (int i= 0; i< count; i++) {
            System.out.print(getRandomNum(min, max));
            if (i <count -1) System.out.print(" | ");
        }
        System.out.println();


        //Q7
        System.out.println("QUESTION 7 ===================================================");

        System.out.print("Please enter your password: ");
        String password = s.nextLine();
        int result = PasswordChecker(password);

        if (result >= 8) System.out.println("Your password is strong!");
        else if (result >= 5) System.out.println("Your password is moderately strong");
        else System.out.println("Your password is weak");


        //Q8
        System.out.println("QUESTION 8 ===================================================");
        System.out.print("Please enter a number: ");
        int input = s.nextInt();
        System.out.println("Fibonacci sequence with " + input + " terms is:");
        int newNum, zero= 0, one= 1;
        for (int i = 0; i < input; i++) {
            System.out.print(zero + " ");
            newNum = zero + one;
            zero = one;
            one = newNum;
        }
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


    public static int PasswordChecker(String password) {
        int len = password.length(), num1, num4, num2 =0, num3 =0;
        if (len >= 8) num1= 3;
        else if (len >= 6) num1= 2;
        else num1= 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!Character.isLetterOrDigit(c)) num3= 2;
        }
        boolean upper = false, lower = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) upper = true;
            if (Character.isLowerCase(c)) lower = true;
        }
        if (upper && lower) num4= 3;
        else num4=0; return num1+num2+num3+num4;
    }
}
