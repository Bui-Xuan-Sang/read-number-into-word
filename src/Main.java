import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        String numberRead = " ";
        switch (number) {
            case 0:
                numberRead = "zero";
                break;
            case 1:
                numberRead = "one";
                break;
            case 2:
                numberRead = "two";
                break;
            case 3:
                numberRead = "three";
                break;
            case 4:
                numberRead = "four";
                break;
            case 5:
                numberRead = "five";
                break;
            case 6:
                numberRead = "six";
                break;
            case 7:
                numberRead = "seven";
            case 8:
                numberRead = "eight";
                break;
            case 9:
                numberRead = "nine";
                break;
            case 10:
                numberRead = "ten";
                break;
            case 11:
                numberRead = "eleven";
                break;
            case 12:
                numberRead = "twelfth";
                break;
            case 13:
                numberRead = "thirdteen";
                break;
            case 14:
                numberRead = "fourteen";
                break;
            case 15:
                numberRead = "fifteen";
                break;
            case 16:
                numberRead = "sixteen";
                break;
            case 17:
                numberRead = "seventeen";
            case 18:
                numberRead = "eighteen";
                break;
            case 19:
                numberRead = "nineteen";
                break;
            case 20:
                numberRead = "twenty";
                break;
            default:
                System.out.println("Not Read");
                break;
        }
        System.out.println(numberRead);
    }
}



