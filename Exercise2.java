
import java.util.Scanner;
import java.util.ArrayList;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Q1
        System.out.println("QUESTION 1 ============================");
        ArrayList<Integer> arrayofNumber1 = new ArrayList<Integer>();
        int flag = -1;
        while (flag!=0){
            System.out.print("Please add a number to the list (0 to stop): ");
            flag = s.nextInt();
            if(flag !=0) arrayofNumber1.add(flag);}
        System.out.println(arrayofNumber1.get(0).equals(arrayofNumber1.get((arrayofNumber1.size()-1))));

        //Q2
        System.out.println("QUESTION 2 ============================");
        double average, sum =0;
        ArrayList<Integer> arrayofNumber2 = new ArrayList<Integer>();
        flag = -1;
        while (flag!=0){
            System.out.print("Please add a number to the list (0 to stop): ");
            flag = s.nextInt();
            if(flag !=0) arrayofNumber2.add(flag);
        }
        for (int i : arrayofNumber2){
            sum = sum + i;
        }
        average = sum / arrayofNumber2.size();
        ArrayList<Integer> newArrayNumber = new ArrayList<Integer>();
        for(int i : arrayofNumber2) if(i > average) newArrayNumber.add(i);
        System.out.println("The average is: "+average+". The numbers in the array that are greater than the average are: "+newArrayNumber);


        //Q3
        System.out.println("QUESTION 3 ============================");
        ArrayList<Integer> arrayofNumber3 = new ArrayList<Integer>();
        flag = -1; int num;
        while (flag!=0){
            System.out.print("Please add a number to the list (0 to stop): ");
            flag = s.nextInt();
            if(flag !=0) arrayofNumber3.add(flag);}
        if(arrayofNumber3.get(0)>(arrayofNumber3.get((arrayofNumber3.size()-1)))) num =arrayofNumber3.get(0);
        else num = arrayofNumber3.get((arrayofNumber3.size()-1));
        System.out.println("Larger value between first and last element is: "+num);



        //Q4
        System.out.println("QUESTION 4 ============================");
        ArrayList<Integer> arrayofNumber4 = new ArrayList<Integer>();
        flag = -1; int num1, num2;
        while (flag!=0){
            System.out.print("Please add a number to the list (0 to stop): ");
            flag = s.nextInt();
            if(flag !=0) arrayofNumber4.add(flag);}
        int lastIndex = arrayofNumber4.size()-1;
        num1 = arrayofNumber4.get(0);
        num2 = arrayofNumber4.get(lastIndex);
        arrayofNumber4.set(0,num2); arrayofNumber4.set(lastIndex, num1);
        System.out.println("New array after swapping first with last: "+arrayofNumber4);


        //Q5
        System.out.println("QUESTION 5 ============================");
        ArrayList<Integer> arrayofNumber5 = new ArrayList<Integer>();
        ArrayList<Integer> oddArrayList = new ArrayList<Integer>();
        ArrayList<Integer> evenArrayList = new ArrayList<Integer>();
        flag = -1;
        while (flag!=0){
            System.out.print("Please add a number to the list (0 to stop): ");
            flag = s.nextInt();
            if(flag !=0) arrayofNumber5.add(flag);}
        for(int i : arrayofNumber5) {
            if (i %2 == 0) evenArrayList.add(i);
            else  oddArrayList.add(i);
        }
        arrayofNumber5.clear();
        for(int i : oddArrayList) {
            arrayofNumber5.add(i);
        }
        for(int i : evenArrayList) {
            arrayofNumber5.add(i);
        }
        System.out.println("Re-arranging the list from odd to even: "+arrayofNumber5);


        //Q6
        System.out.println("QUESTION 6 ============================");
        ArrayList<Integer> arrayofNumber6_1 = new ArrayList<Integer>();
        ArrayList<Integer> arrayofNumber6_2 = new ArrayList<Integer>();
        boolean isEqual = true;
        flag = -1;
        while (flag!=0){
            System.out.print("Please add a number to the FIRST list (0 to stop): ");
            flag = s.nextInt();
            if(flag !=0) arrayofNumber6_1.add(flag);}
        flag=-1;
        while (flag!=0){
            System.out.print("Please add a number to the SECOND list (0 to stop): ");
            flag = s.nextInt();
            if(flag !=0) arrayofNumber6_2.add(flag);}
        if( arrayofNumber6_1.size() != arrayofNumber6_2.size()){
            isEqual = false;
        }
        else {
            for(int i = 0; i < (arrayofNumber6_1.size()); i++){
                if( arrayofNumber6_1.get(i) != arrayofNumber6_2.get(i) )
                    isEqual = false;
            }
        }
        System.out.println(isEqual);
    }}

