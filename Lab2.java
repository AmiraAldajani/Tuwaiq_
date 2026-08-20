import java.util.Scanner;
import java.util.ArrayList;
public class Lab2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Q1
        System.out.println("QUESTION 1 ===================================================");
//        ArrayList<String> stringArray = new ArrayList<>(); String word = " ";
//        System.out.println("Enter as many words as u want: (x to exit)");
//        while ( !word.equalsIgnoreCase("x") ){
//            System.out.print("Enter a word (x to exit): ");
//            word = s.nextLine();
//            if ( !word.equalsIgnoreCase("x" )) stringArray.add(word);
//        }
//        int num = stringArray.get(0).length();
//        for ( int i = 0 ; i < stringArray.size(); i++ ) {
//            if (stringArray.get(i).length() > num)
//                num = stringArray.get(i).length();
//        }
//        for ( int i = 0 ; i < stringArray.size(); i++ ) {
//            if (stringArray.get(i).length() == num)
//                System.out.print(stringArray.get(i)+" ");
//        }
//        System.out.println();

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
        int value, accurs=0;
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


        //Q4
        System.out.println("QUESTION 4 ===================================================");

        //Q5
        System.out.println("QUESTION 5 ===================================================");

        //Q6
        System.out.println("QUESTION 6 ===================================================");

        //Q7
        System.out.println("QUESTION 7 ===================================================");

        //Q8
        System.out.println("QUESTION 8 ===================================================");

    }
}
