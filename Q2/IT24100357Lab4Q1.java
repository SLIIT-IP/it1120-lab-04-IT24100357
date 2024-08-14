import java.util.Scanner;

public class IT24100357Lab4Q1 {
  public static void main(String[] args) {

  Scanner Scanner = new Scanner(System.in);

  System.out.print("Enter a number: ");
  int number = Scanner.nextInt();

  if (number > 0){
     System.out.println("The number is: positive");

  } else if (number < 0){
    System.out.println("The number is: Negative");

  } else {
    System.out.println("The number is: Zero");
  }
 }
} 