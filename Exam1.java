
import java.util.Scanner;
import java.util.ArrayList;
public class Exam1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Write a Java program that accept three numbers from the user and print the largest number .
        System.out.println("Please enter three numbers.");
        System.out.print("Enter the first number: ");
        int num1 = s.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = s.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = s.nextInt(); s.nextLine();
        if ( num1 >= num2 && num1 >= num3) System.out.println("Largest number is: "+num1);
        else if ( num3 >= num2 ) System.out.println("Largest number is: "+num3);
        else System.out.println("Largest number is: "+num2);


        //Write a Java program that accept a String and a number from the user, then print the character at the given index( the number) .
        System.out.print("Enter a string: ");
        String stringQ2 = s.nextLine();
        System.out.print("Enter a number (not larger than "+(stringQ2.length()-1)+"): "); // i can specify no larger than
        int stringQ2Index = s.nextInt();
        System.out.println(stringQ2.charAt(stringQ2Index));


        //Write a Java program that allows the user to enter numbers repeatedly until they choose to stop,
        // then displays the total sum of all entered numbers.
        int sum=0, num;
        System.out.print("Enter a number (0 to stop)");
        num= s.nextInt();
        while (num!=0){
            sum +=num;
            System.out.print("Please enter another number (0 to stop): ");
            num = s.nextInt(); s.nextLine();
        }
        System.out.println("The sum of these numbers is: "+sum);


        //Write a Java program to determine whether each number in a given array is positive or negative.
        int[] numberArray = { 10, -21, 30, 31, -25};
        for( int i=0; i< numberArray.length; i++){
            if ( numberArray[i] > 0) System.out.println(numberArray[i]+" is a positive number");
            else System.out.println(numberArray[i]+" is a negative number");
        }

        //Write a Java program to find the shortest word in a given array of strings
        String[] stringArray = {"Tuwaiq", "Bootcamp", "Student", "JAVA"};
        String shortest = stringArray[0];
        for( int i =0; i < stringArray.length; i++){
                if ( stringArray[i].length() < shortest.length())
                    shortest= stringArray[i];
        } System.out.println(shortest);
    }
}
