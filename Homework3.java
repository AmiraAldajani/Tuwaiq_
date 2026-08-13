import java.util.Scanner;
void main() {
    Scanner s = new Scanner(System.in);

    //Q1
    System.out.println("Q1: ");
    for ( int num = 1; num <=100; num++) {
      if (num % 3 == 0) System.out.print("Fizz");
      if (num % 5 == 0) System.out.print("Buzz ");
      if (num % 3 == 0 && (num+1) % 5 == 0) System.out.print(" ");
      if (num % 3 != 0 && num % 5 != 0) System.out.print(" "+num+" ");
    }


    //Q2
    System.out.print("\nQ2: ");
    System.out.print("\nEnter a word/sentense to reverse: ");
    String userString = s.nextLine();
    for( int i=0; i < userString.length(); i++){
            System.out.println(userString.charAt(userString.length()-1-i));}


    //Q3
    System.out.println("\nQ3: ");
    System.out.print("Enter a number to get its factorial value: ");
    int userNum = s.nextInt();
    int sum =1;
    for(int i = 2; i<= userNum; i++){
        sum *= i;
        //System.out.print(sum+" "); testing purposes
    }
    System.out.print(sum);

    //Q4
    System.out.println("\nQ4: ");
    System.out.print("Enter a number: ");
    int number = s.nextInt();
    System.out.print("Enter the power of the number: ");
    int power = s.nextInt();
    int result =1;
    for(int i= power; i>0; i--){
        result *= number;
    }
    System.out.print(result);

    //Q5
    System.out.println("\nQ5: ");
    int evenSum=0, oddSum=0;
    System.out.print("Enter a set of integers and press 0 to stop. First number: ");
    int userInt = s.nextInt();
    while (userInt != 0){
        if (userInt %2 == 0) evenSum += userInt;
        else oddSum += userInt;
        System.out.print("Enter another number (press 0 to stop): ");
        userInt = s.nextInt();
    }
    System.out.println("Sum of evem numbers: "+evenSum+"\nSum of odd numbers: "+oddSum);


    //Q6
    System.out.println("\nQ6: ");
    System.out.print("Please enter a positive integer number: ");
    int number_ = s.nextInt();
    boolean prime = true;
    for (int i = 2; i * i <= number_; i++)
        if ( number_ % i == 0) prime = false;
    if (prime)
        System.out.println("Number is Prime");
    else
        System.out.println("Number is NOT Prime");


    //Q7
    System.out.println("\nQ7: ");
    int weeks =4;
    int days =7;
    for ( int i =0; i <= weeks; i++) {
        System.out.println("Week"+ i);
        for ( int j =0; j <= days; j++) System.out.println("Day"+ j);
    }

    //Q8
    System.out.println("\nQ8: ");
    boolean flag = true;
    System.out.print("Enter a word: ");
    s.nextLine();
    String userWord = s.nextLine();
    for (int i = 0; i< userWord.length(); i++){
        if ( userWord.charAt(i) != userWord.charAt((userWord.length()-1)-i)) flag = false;
    }
    if (flag) System.out.print("The word is palindrome!");
    else System.out.print("Word is not palindrome");

}
