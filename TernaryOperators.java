


import java.util.*;
public class TernaryOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the value to check whether the number is greater or less than 100:");
 
         int num = scan.nextInt();
         int check = 100;

         String check1 = (num>check) ? ("Yes the  value is greater than 100") : ("No , the value is less than 100");

         System.out.print(check1);
    }     
}


// public class TernaryOperators {

//     public static void main(String[] args) {
//         boolean bl = (2<4) ? (true):(false); 
//         System.out.println(bl);
//     }
// }

// ternary operator = (variable)= (condition) ? (true statement) : (false statement)


// Exercise - Write a program to check even number using ternary operator 
// import java.util.*;
// public class TernaryOperators { 
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);

//         System.out.print("Enter a num to check even or odd:");
//         int num = scan.nextInt();
        
//         String result = (num%2 == 0 ) ? ("Even number") : ("Odd number");
//         System.out.println(result);      
//         }
//     }
 
// Challenge - Write a program to find the maximum of the three numbers 
// import java.util.Scanner;
// public class TernaryOperators {

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter the first number : ");
//         int num1= scan.nextInt();

//          System.out.print("Enter the second  number : ");
//         int num2 = scan.nextInt();

//          System.out.print("Enter the third number : ");
//         int num3 = scan.nextInt();

//          int max = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
//          System.out.println("The maximum number is : "+max);

//     }
// }