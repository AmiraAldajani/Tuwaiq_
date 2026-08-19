import java.util.Scanner;
import java.util.InputMismatchException;
public class Exercise4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        //Q1
        try {
            System.out.print("Plsea enter two numbers.");
            System.out.print("Number one: ");
            int num1 = s.nextInt();
            System.out.print("Number two: ");
            int num2 = s.nextInt();
            int sum, multibly, subt, divide, remainder;
            sum = num1 + num2;
            multibly = num1 * num2;
            subt = num1 - num2;
            divide = num1 / num2;
            remainder = num1 % num2;
            System.out.println(num1 + "+" + num2 + " = " + sum);
            System.out.println(num1 + "-" + num2 + " = " + subt);
            System.out.println(num1 + "x" + num2 + " = " + multibly);
            System.out.println(num1 + "/" + num2 + " = " + divide);
            System.out.println(num1 + " mod " + num2 + " = " + remainder);
        } catch (ArithmeticException e){
            System.out.println(e);
        } catch (InputMismatchException e){
            System.out.println(e);
        }

        //Q2
        try {
            System.out.print("Input a number to get its multiplication table: ");
            int numM = s.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(numM + "x" + i + " = " + numM * i);
            }
        }catch (InputMismatchException e){
            System.out.println(e);
        }


        //Q3
        try {
            System.out.print("Enter Redius: ");
            double redius = s.nextDouble();
            double area = 3.14*(redius*redius);
            double perimeter = 2*3.14*redius;
            System.out.println("Perimeter is: "+perimeter);
            System.out.println("Area is: "+ area);
        }catch (InputMismatchException e){
            System.out.println(e);
        }

        //Q4
        try {
            System.out.print("Enter the count of numbers: ");
            int counter = s.nextInt();
            int sumNum=0, input;
            for(int i=0; i<counter; i++){
                System.out.print("Enter an integer: ");
                input = s.nextInt();
                sumNum = sumNum + input;
            }
            double average = (double)sumNum / counter;
            System.out.println("The average is: "+ average);
        } catch (ArithmeticException e){
            System.out.println(e);
        } catch (InputMismatchException e){
            System.out.println(e);
        }

        //Q5
        try {
            System.out.print("Enter the first number: ");
            int firstNum = s.nextInt();
            System.out.print("Enter the second number: ");
            int secNum = s.nextInt();
            System.out.print("Enter the third number: ");
            int thirdNum = s.nextInt();
            if (firstNum + secNum == thirdNum) System.out.print("Result is true");
            else System.out.println("Result is false");
        } catch (InputMismatchException e){
            System.out.println(e);
        }

        //Q6
        try {
            s.nextLine();
            System.out.print("Enter a word: ");
            String word = s.nextLine();
            for (int i = 0; i < word.length(); i++) {
                System.out.print(word.charAt(word.length() - 1 - i));
            }
        } catch (StringIndexOutOfBoundsException e){}
        System.out.println("");


        //Q7
        try {
            System.out.print("Enter a number to check if even or odd: ");
            int userNum = s.nextInt();
            if (userNum % 2 == 0) System.out.println("Is even");
            else System.out.println("Is odd");
        } catch (InputMismatchException e){}

        //Q8
        try {
            System.out.print("Enter temp in Centigrade: ");
            double centigrade = s.nextInt();
            double fehrenheit = centigrade* 9/5 + 32;
            System.out.println("Temperature in Fehrenheit is "+ fehrenheit);
        } catch (InputMismatchException e){}


        //Q9
        try {
            System.out.print("Enter a string: ");
            s.nextLine();
            String userString = s.nextLine();
            System.out.print("Enter an Index: ");
            int indexString = s.nextInt();
            System.out.println(userString.charAt(indexString));
        } catch ( StringIndexOutOfBoundsException e){}


        //Q10
        try {
            System.out.print("Enter Width: ");
            double width = s.nextDouble();
            System.out.print("Enter Height: ");
            double height = s.nextDouble();
            double areaRectangle = width * height;
            double perimeterRectangle = 2 * (width + height);
            System.out.println("Perimeter is: " + perimeterRectangle);
            System.out.println("Area is: " + areaRectangle);
        } catch (InputMismatchException e){}

        //Q11
        try {
            System.out.print("Enter input1: ");
            int input1 = s.nextInt();
            System.out.print("Enter input2: ");
            int input2 = s.nextInt();
            if (input1 == input2) System.out.println(input1 + "==" + input2);
            else System.out.println(input1 + "!=" + input2);
            if (input1 < input2 && input1 != input2) System.out.println(input1 + " < " + input2);
            else System.out.println(input1 + " > " + input2);
            if (input1 <= input2) System.out.println(input1 + " <= " + input2);
            if (input1 >= input2) System.out.println(input1 + " >= " + input2);
        } catch (InputMismatchException e){}


        //Q12
        try {
            System.out.print("Enter seconds: ");
            int seconds = s.nextInt();
            int hour = 0, minute = 0, second = 0;
            for (int i = 0; i < seconds; i++) {
                second++;
                if (second == 60) {
                    second = 0;
                    minute++;
                }
                if (minute == 60) {
                    minute = 0;
                    hour++;
                }
            }
            System.out.println(hour + ":" + minute + ":" + second);
        } catch (InputMismatchException e){}


        //Q13
        try {
            System.out.print("Enter first number: ");
            int value1 = s.nextInt();
            System.out.print("Enter second number: ");
            int value2 = s.nextInt();
            System.out.print("Enter third number: ");
            int value3 = s.nextInt();
            System.out.print("Enter forth number: ");
            int value4 = s.nextInt();
            if (value1 == value2 && value3 == value4 && value2 == value3) System.out.println("Numbers are equal!");
            else System.out.println("Numbers are NOT equal.");
        } catch ( InputMismatchException e){}


        //Q14
        try {
            System.out.println("Enter a number: ");
            int numToBeChecked = s.nextInt();
            if (numToBeChecked == 0) System.out.println("Number is zero.");
            else if (numToBeChecked > 0) System.out.println("Number is positive.");
            else System.out.println("Number is negative");
        } catch (InputMismatchException e){}
        

        //Q15
        try {
            System.out.print("Enter numbers and stop by entering -1: ");
            int userInput_ = s.nextInt();
            int positive = 0, negative = 0, zero = 0;
            while (userInput_ != -1) {
                if (userInput_ == 0) zero++;
                else if (userInput_ > 0) positive++;
                else negative++;
                System.out.print("Enter another (stop by entering -1): ");
                userInput_ = s.nextInt();
            }
            System.out.println("Positives: " + positive + "\nNigatives: " + negative + "\nZeros: " + zero);
        } catch (InputMismatchException e){}

        //Q16
        try {
            System.out.print("Enter a long-ish number: ");
            int numberToBeReverse = s.nextInt();
            String numberToBeReversed = "" + numberToBeReverse;
            for (int i = 0; i < numberToBeReversed.length(); i++) {
                System.out.print(numberToBeReversed.charAt(numberToBeReversed.length() - 1 - i));
            }
        } catch (InputMismatchException e){}

        //Q17
        try {
            int input_1, input_2, input_repeat, smallNumber, largeNumber;
            System.out.print("\nEnter AT LEAST two numbers: ");
            input_1 = s.nextInt();
            System.out.print("Enter another: ");
            input_2 = s.nextInt();
            if (input_1 >= input_2) {
                largeNumber = input_1;
                smallNumber = input_2;
            } else {
                largeNumber = input_2;
                smallNumber = input_1;
            }
            input_repeat = input_2;
            while (input_repeat != 0) {
                if (input_repeat > largeNumber) largeNumber = input_repeat;
                if (input_repeat < smallNumber) smallNumber = input_repeat;
                System.out.print("Enter another (0 to stop): ");
                input_repeat = s.nextInt();
            }
            System.out.println("the large number: " + largeNumber);
            System.out.println("the small number: " + smallNumber);
        } catch (InputMismatchException e){}

        //Q18
        try {
            System.out.print("Enter string (counting how many 'a' there is): ");
            int count_ = 0;
            String user_string = s.nextLine();
            for (int i = 0; i < user_string.length(); i++) {
                if (user_string.charAt(i) == 'a' || user_string.charAt(i) == 'A') count_++;
            }
            System.out.println("Number of a's is: " + count_);
        } catch ( InputMismatchException e){}
    }
}
