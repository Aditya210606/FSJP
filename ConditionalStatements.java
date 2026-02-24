
//     public static void main(String[] args) {
//             // if statement 
//         if (true ){
//             System.out.println("The condition is correct");
//         }
//         System.out.println("The condition is incorrect ");
//     }
      
// }
// Here if the if condition is true than both the statements are print inside loop statement and outside also 

// to avoid this we use else  statement 

// public class ConditionalStatements {
//     public static void main(String[] args) {
//         // else statement 
//         int money = 5000;
//         if(money >= 4000){
//             System.out.println("We will have party at 5 star hotel");

//         }
//         else{
//             System.out.println("Sorry we cannot have party at 5 star hotel");
//         }
//     }

    
// }

// To add more condition we can use else if statement 
// import java.util.*;
// public class ConditionalStatements {

//     public static void main(String[] args) {
//         // else if statement 
//     Scanner scan = new Scanner(System.in);
//     System.out.print("Enter the amount of money you have :");
//     int money = scan.nextInt();



        

//         if (money >= 5000){
//             System.out.println("We will have party in a 5 star hotel");
//         }
//         else if (money <5000 && money >=2000) {
//             System.out.println("We can still have party in a normal hotel");
//         }
//         else{
//             System.out.println("Sorry we cannot have party in the hotel");
//         }
//     }
// }


// import java.util.*;
// public class ConditionalStatements {
//  public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);

//     System.out.print("Enter the day of the week :");
//     String Daysoftheweek = scan.next();

//     switch(Daysoftheweek){
//          case "Sunday" : System.out.println("The first day of the week" );
//         break;
//          case "Monday": System.out.println("The second day of the week ");
//         break;
//          case "Tuesday": System.out.println("The third day of the week  ");
//         break;
//          case "Wednesday": System.out.println("The fourth day of the week  ");
//         break;
//          case "Thursday": System.out.println("The fifth day of the week ");
//         break;
//          case "Friday": System.out.println("The sixth day of the week ");
//         break;
//          case "Saturday": System.out.println("The seventh day of the week ");
//         break;
//         default:System.out.println("You entered the the wrong value ");
//     }


//  }
// }

// Exercise - Write a program to check even number 

// import java.util.*;
// public class ConditionalStatements {

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter number to check whether the number is even or not :");
//         int even = scan.nextInt();

//         int result = even%2;

//         if(result ==0 ){
//             System.out.println("The entered value is even");
//         }
//         else {
//             System.out.println("The entered value is not even ");
//         }
        
//     }
// }

 // Challenge - /* Write a program to calculate the grade  A grade = >=90 , B grade = between 80 and 90 , c = grade between 70 to 80 , Fail = <35 */
import java .util.*;
public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the marks to check grade :");
        int marks = scan.nextInt();

        if (marks>=90){
            System.out.println("Your grade is 'A' ");
        }
        else if (marks <=89 && marks >=80){
            System.out.println("Your grade is 'B'");
        }
        else if (marks <=79 && marks >=70 ){
            System.out.println("Your grade is 'c'");
        }
        else if (marks <=34){
            System.out.println("You Failed in exam !!");
        

        }
    }
}
    
