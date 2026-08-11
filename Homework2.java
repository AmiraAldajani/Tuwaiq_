import java.util.Random;
void main() {
    Scanner s = new Scanner(System.in);

    // Q1
    System.out.print("Enter your role (admin, superuser, user): ");
    String role = s.nextLine();
    if ( role.equalsIgnoreCase("admin")) System.out.println("Welcome admin");
    else if ( role.equalsIgnoreCase("superuser")) System.out.println("Welcome superuser!");
    else System.out.println("Welcome user!");

    
    //Q3
    System.out.print("Enter three number and the greatest number will be printed out: ");
    int num1 = s.nextInt(); int num2 = s.nextInt(); int num3 = s.nextInt();
    int max = Math.max(num1, Math.max(num2, num3));
    System.out.println("The grearest number is: "+ max);

                // OR

    if (num1 > num2 && num1 > num3) System.out.println("The grearest number is: "+ num1);
    else if ( num2 > num1 && num2 > num3) System.out.println("The grearest number is: "+ num2);
    else if ( num3 > num1 && num3 > num2) System.out.println("The grearest number is: "+ num2);
    else System.out.println("retry and don't enter doublicated numbers!");


    //Q3
    System.out.print("The randomized day is: ");
    int day = new Random().nextInt(7) + 1;
    switch (day) {
        case 1: System.out.println("Sunday");    break;
        case 2: System.out.println("Monday");    break;
        case 3: System.out.println("Tuesday");   break;
        case 4: System.out.println("Wednesday"); break;
        case 5: System.out.println("Thursday");  break;
        case 6: System.out.println("Friday");    break;
        case 7: System.out.println("Saturday");  break;
    }


    //Q4
    System.out.print("Please enter your score:  ");
    int score = s.nextInt();
    String scoreLetter ="non";
    if (score >= 90 && score <=100) scoreLetter = "A";
    else if (score <= 89 && score >=80) scoreLetter = "B";
    else if (score <= 79 && score >=70) scoreLetter = "C";
    else if (score <= 69 && score >=60) scoreLetter = "D";
    else if (score <= 59 && score >=0) scoreLetter = "F";
    else System.out.println(score+" is an invalid score. Retry");
    if (!scoreLetter.equals("non")){
        System.out.print("The corresponding letter to this score is: "+ scoreLetter);
    }


    //Q5
    System.out.print("Please enter your age:  ");
    int age = s.nextInt();
    String ageCategory;
    if (age < 13) ageCategory = "Child";
    else if (age <= 19) ageCategory = "Teenager";
    else ageCategory = "Adult";

    if (ageCategory.equals("Adult")){
        System.out.print("Your are an "+ ageCategory);
    }
    else System.out.print("Your are a "+ ageCategory);
}
