import java.util.Scanner;

public class InputPractice
{
    public static void main( String[] args )
    {
        // setting variables
        int count = 42;   // can be positive or negative whole numbers
        double maxHeight = 70.2;    // decimal numbers
        String myName = "Mr. Avis";   // String needs double quotes
        char grade = 'A';    // char needs single quotes
        boolean isDone = true;  // or false
        
        // printing variables
        System.out.println( "count = " + count );
        System.out.println( "maxHeight = " + maxHeight );
        System.out.println( "myName = " + myName );
        System.out.println( "grade = " + grade );
        System.out.println( "isDone = " + isDone );
        
        // modify variables
        count = count + 5;
        count += 5;   // -=   and   *=    and     /=    also work
        count++;      // means   count = count + 1
        count--;      // means   count = count - 1
        System.out.println( "count is now [52]: " + count );
        
        // integer vs. double math
        double num = 5/2;
        System.out.println( "5/2 = " + (5/2) );
        System.out.println( "5/2.0 = " + (5/2.0) );
        
        // char math
        grade += 5;
        System.out.println( "grade + 5 = " + grade );
        System.out.println( "grade + 5 = " + (int)grade );
        
        // min and max
        System.out.println( "max int = " + Integer.MAX_VALUE );
        System.out.println( "min int = " + Integer.MIN_VALUE );
        System.out.println( "max double = " + Double.MAX_VALUE );
        System.out.println( "min double = " + Double.MIN_VALUE );
        System.out.println( "max char = " + Character.MAX_VALUE );
        System.out.println( "min char = " + Character.MIN_VALUE );
        System.out.println( "max char as int = " + (int)Character.MAX_VALUE );
        System.out.println( "min char as int = " + (int)Character.MIN_VALUE );
        
        System.out.println( "max int + 1 = " + (Integer.MAX_VALUE + 1) );
        
        // User Input
        Scanner keyboard = new Scanner( System.in );
        System.out.print( "What is your name? " );
        String name = keyboard.nextLine();
        System.out.print( "How many dogs do you have? " );
        int numDogs = keyboard.nextInt();   // grabs the next int, not the \n at the end
        keyboard.nextLine();    // grab the \n and go to the next line for input.
        System.out.print( "What is your favorite color? " );
        String favColor = keyboard.nextLine();
        System.out.println( name + " has " + numDogs + " dogs and likes " + favColor );
    }
}




