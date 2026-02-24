import java.util.*;

public class Userinput {
    public static void main(String[] args) {
        
         // System.out.println(args[0]); this is only for ellipse ide java 

        Scanner scan = null;
        scan = new Scanner(System.in);

        System.out.print("Enter the value for int = ");
        int intData = scan.nextInt(); // For int we used scan.nextInt()

        System.out.print("Enter the value for float = ");
        float floatvalue = scan.nextFloat(); //For float input  we used scan.nextFloat() 

        System.out.print("Enter the value for char = ");
        char ch = scan.next().charAt(1); //For char input we used scan.next().charAt()

        System.out.print("Enter the value for string = ");
        String stringvalue = scan.next();  // For string input we uesd scan.next()
    
        System.out.println("Your entered int value is "+intData);   //For merging the line i.e concatination we have to put "+" sign after the line 
        System.out.println("Your entered float value is "+floatvalue);
        System.out.println("Your entered char value is "+ch);
        System.out.println("Your entered String value is "+stringvalue);

    }
}
  

// *** Exercise 1 - Write a code using user input to print summation of two numbers 

// import java.util.Scanner;

// public class Userinput {

//     public static void main(String[] args) { 

//         Scanner scan = new Scanner(System.in); 

//         System.out.print("Enter the first number : ");
//         int num1 = scan.nextInt();

//         System.out.print("Enter the second number : ");
//         int num2 = scan.nextInt();
        
//         System.out.print("The summation of two number is "+(num1+num2));


//     }
// }

 /*** Challenge - Write a program to add two paragraph */

// import java.util.Scanner;

// public class Userinput {

//     public static void main(String[] args) { 

//         Scanner scan = new Scanner(System.in); 

//         System.out.print("Enter the first paragraph : ");
//         String string1 = scan.nextLine();

//         System.out.print("Enter the second paragraph : ");
//         String string2 = scan.nextLine();
        
//         System.out.print("The summation of two paragraph is "+(string1+ string2));


//     }
// }