import java.util.Scanner;
import java.util.Random;

public class Assignment1Program1 {
  public static void main(String[] args) {

    System.out.println(" OOOO    DDDD");
    System.out.println("O    O   D   D");
    System.out.println("O    O   D    D");
    System.out.println("O    O   D   D");
    System.out.println(" OOOO    DDDD");

    System.out.println("\nPlease enter a 5-character string:");

    String message;
    Scanner scan = new Scanner(System.in);

    message = scan.nextLine();

    String trimmedMessage = message.substring(1,message.length()-1);
    StringBuilder stringBuilder = new StringBuilder(trimmedMessage);
    stringBuilder.reverse();
    String reversedMessage = stringBuilder.toString();

    System.out.println("\nPlease enter a number in Fahrenheit:");

    double fahrenheit = scan.nextDouble();
    double celsius = (fahrenheit - 32) * 5/9;
    celsius = Math.round(celsius * 10.0) / 10.0;
    scan.close();
    
    System.out.println("\nRandom number generated. Continuing...");

    Random random = new Random();
    int min = 32;
    int max = 16384;
    int randomNumber = random.nextInt(max - min + 1) + min;

    System.out.println("\nYour new string is: "
    + celsius + "" + reversedMessage + "" + randomNumber);
  }
}
