import java.util.Scanner;
public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int grade) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number grade: ");

        int grade = scan.nextInt();

        if( grade >= 90 && grade <= 100) {
            return 'A';
        } else if(grade >=80 && grade <=89) {
            return 'B';
        } else if(grade >= 70 && grade <= 79) {
            return 'C';
        } else if(grade >= 60 && grade <= 69) {
            return 'D';
        } else if(grade >= 50 && grade <= 59) {
            return 'E';
        } else if (grade <= 49) {
            return 'F';
        } else {
            System.out.println("The number you entered is invalid");
        }

    }



    // Question 2 - fizzBuzz
    public static String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "fizzbuzz";
        } else if (number % 3 == 0) {
            return "fizz";
        } else if (number % 5 == 0) {
            return "buzz";
        } else {
            return "unlucky";
        }
    }


    // Question 3 - frontBack
    public static String frontBack(String input) {
        if (input.length() < 2) {
            return input;
        } else {
            String firstTwoChars = input.substring(0, 2);
            return firstTwoChars + input + firstTwoChars;
        }
    }

    // Question 4 - twoAsOne
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        boolean result = twoAsOne(num1, num2, num3);
        System.out.println(result);
    }
    public static boolean twoAsOne(int num1, int num2, int num3) {
        return num1 + num2 == num3 || num1 + num3 == num2 || num2 + num3 == num1;
    }



    // Question 5 - endUp
    public static String endUp(String input) {
        if (input.length() <= 3) {
            return input.toUpperCase();
        } else {
            String firstPart = input.substring(0, input.length() - 3);
            String lastPart = input.substring(input.length() - 3);
            return firstPart + lastPart.toUpperCase();
        }
    }


}
