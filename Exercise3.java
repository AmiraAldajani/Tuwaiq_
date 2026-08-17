
import java.util.Scanner;
import java.util.ArrayList;
public class Exercise3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Q1
        int[] numList;
        System.out.print("Enter how many numbers u want to enter(3 for example): ");
        int num = s.nextInt(); s.nextLine();
        numList = new int[num];
        for (int i=0; i<num; i++){
            System.out.print("Enter number "+(i+1)+": ");
            numList[i] = s.nextInt(); s.nextLine();
        }
        System.out.println("The smallest value is: "+ smallestNum(numList));

        //Q2
        System.out.print("Enter a number: ");
        int num_q2 = s.nextInt(); s.nextLine();
        System.out.println("Number is "+numberCheck(num_q2));

        //Q3
        String answer ="yes", check=" ";
        System.out.print("Please enter your password: ");
        String pass = s.nextLine();
        while (answer.equalsIgnoreCase("yes") && !check.equals("valid")){
            check = passwordCheck(pass);
            if (!check.equals("valid")){
                System.out.print(check);
                System.out.print(" Want to try again?");
                answer = s.nextLine();
            }
            else System.out.println("Your password is valid! "+ pass);
            if ( answer.equalsIgnoreCase("yes") && !check.equals("valid")){
                System.out.print("Re-enter your password: ");
                pass = s.nextLine();
            }
        }
    }

    //Q1
    public static double smallestNum(int[] num){
        double smalest =num[0];
        for (int i : num) {
            if(i<smalest) smalest = i;
        }
        return smalest; // void accepts return
    }

    //Q2
    public static String numberCheck(int num){
        if (num > 0) return "Positive";
        else if (num < 0) return "Negative";
        else return "Zero";
    }

    //Q3
    public static String passwordCheck(String pass){
        String answer = "valid";
        if ( pass.length() < 10) answer = "A password must have at least ten characters.";
        if (!pass.matches("^[a-zA-Z0-9]+$")) answer = "password consists only letters and digits.";
        if (!pass.matches(".*\\d.*\\d.*")) answer = "password must contain at least two digits.";
        return answer;
    }
}
