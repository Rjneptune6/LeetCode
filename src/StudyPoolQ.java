import java.util.Scanner;
import java.lang.Math; //Used for sqrt and log

public class StudyPoolQ {

  public static int factorial(int x){
    int factorial = 1;
    for(int i = 1; i <= x; i++){
      factorial = factorial*i;
    }
    return factorial;
  }


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Welcome to the simple math helper.");
    System.out.println("What would you like to calculate?");
    System.out.println("1. Sqrt");
    System.out.println("2. Log");
    System.out.println("3. Factorial");
    System.out.print("> ");

    int calculation = in.nextInt();

    switch (calculation){
      case 1: //sqrt
        System.out.println("Enter the number to sqrt: ");
        System.out.print("> ");
        int numSqrt = in.nextInt();
        System.out.println(Math.sqrt(numSqrt));
        break;
      case 2: //Log
        System.out.println("Enter the number to log: ");
        System.out.print("> ");
        int numLog = in.nextInt();
        System.out.println(Math.log(numLog));
        break;
      case 3: //Factorial
        System.out.println("Enter the number to log: ");
        System.out.print("> ");
        int numFact = in.nextInt();
        System.out.println(factorial(numFact));
        break;
      default:
        System.out.println("Invalid Number");
        break;
    }




  }
}
