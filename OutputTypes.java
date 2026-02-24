public class OutputTypes {
    public static void main(String[] args) {
         System.out.println("hello aditya"); // println prints the data on next line 
        System.out.println( "hello world");    // print prints the data on the same line 

        //formatting 
        System.out.println(Math.PI);
        System.out.printf("%.2f",Math.PI);  // f represents it is a floating value and "2" represents that give me two digit value after point.

        int x = 10;
        System.out.printf("\n%d",x);    // d represents it a decimal value
         System.out.printf("\n%d",++x); // first increment than prints the value 
         System.out.printf("\n%d", x++); //first prints the value than increment
        

         float fl  = 21.34f;
         System.out.printf("\n%.4f",fl);
         System.out.printf("\n%10.4f",fl);  // Here 10 i the width specifier 

         //Error printing 
         System.err.println( "\nYour code is having some errors");
        
    }
}
