import java.util.*;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    System.out.println("************Welcome to the calculator************");
    System.out.print("Enter the first number : ");
    long num1 = scan.nextLong();

    System.out.print("Enter the second number :");
    long num2 = scan.nextLong();
 
    System.out.print("Enter the operation (+,-,*,/) = ");
    char ch = scan.next().charAt(0);

    switch(ch){
        case '+':System.out.println("Addition = "+(num1+num2));
       break;
        case '-':System.out.println("Subtraction = "+(num1-num2));
       break;
        case '*':System.out.println("Multiplication = "+(num1*num2));
       break;
        case '/':System.out.println("Division = "+(num1/num2));
       break;
       default : System.out.println("You enter wrong option !!");
    }


    }
}
