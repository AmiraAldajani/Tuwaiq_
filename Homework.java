void main() {
    Scanner s = new Scanner(System.in);

    // Q1
    System.out.println("Question 1");

    System.out.print("Enter your weight in Kg: ");
    int weight = s.nextInt();
    System.out.print("Enter your height in meters: ");
    float height = s.nextFloat();
    float resultedBMI = weight/ (height*height);
    System.out.println("Enter your BMI is: "+ resultedBMI);

    // Q2
    System.out.println("Question 2");

    System.out.print("Enter the obtained marks: ");
    float obtainedMarks = s.nextFloat();
    System.out.print("Enter the total marks: ");
    int totalMarks = s.nextInt();
    float perecentage = obtainedMarks / totalMarks * 100;
    System.out.println("Enter your BMI is: "+ Math.round(perecentage)+"%");

    //Q3
    System.out.println("Question 3");

    System.out.print("Enter Amount in USD: ");
    float currency = s.nextFloat();
    System.out.print("Enter the exchange rate (USD to EUR): ");
    float exchangeRate = s.nextFloat();
    float amount = currency * exchangeRate;
    System.out.println("Amount in EUR = "+ amount);

    //Q4
    System.out.println("Question 4");

    System.out.print("Enter a string: ");
    s.nextLine();
    String userStringInput = s.nextLine();
    StringBuilder sb = new StringBuilder(userStringInput);
    System.out.println("Length of the string is: "+userStringInput.length()+". And the reversed string is: "+sb.reverse()+".");

    //Q5
    System.out.println("Question 5");

    System.out.print("Enter start indix: ");
    int startIndex = s.nextInt();
    System.out.print("Enter end indix: ");
    int endIndex = s.nextInt();
    System.out.print("Enter the sentence: ");
    s.nextLine();
    String userSentence = s.nextLine();
    System.out.println("Output after extacting: "+userSentence.substring(startIndex,endIndex));

    //Q6
    System.out.println("Question 6");

    System.out.print("Enter Sentence: ");
    String sentence_ = s.nextLine();
    System.out.print("Enter Keyword: ");
    String keyword = s.nextLine();
    System.out.println("(true if exists, false if does NOT exists)"+sentence_.contains(keyword));


    //Q7
    System.out.println("Question 7");

    System.out.print("Enter Sentence: ");
    String sentence = s.nextLine();
    System.out.print("Choose a word to be used as replacement: ");
    String wordChosen = s.nextLine();
    System.out.print("Enter the word to be replaced: ");
    String toBeReplaced = s.nextLine();
    System.out.println("result: "+sentence.replaceAll(toBeReplaced,wordChosen));


    //Q8
    System.out.println("Question 8");

    System.out.print("Enter String 1: ");
    String string1 = s.nextLine();
    System.out.print("Enter String 2: ");
    String string2 = s.nextLine();
    System.out.println("Output (true is equal, false is NOT equal): "+ string1.equalsIgnoreCase(string2));
}
 
