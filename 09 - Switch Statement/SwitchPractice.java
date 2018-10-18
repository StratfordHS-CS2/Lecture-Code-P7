import java.util.Scanner;
/**
 * Practice using the Java "switch" statement.
 * 
 * @author Dave Avis
 * @version 10.18.2018
 */
public class SwitchPractice
{
    public static void main( String[] args )
    {
        Scanner kb = new Scanner( System.in );
        System.out.print("Enter the number of a day of the week: ");
        int dayNum = kb.nextInt(); // read the integer input
        kb.nextLine(); // read and discard any whitespace or newline characters after the integer
        
        switch(dayNum) {   // dayNum is the variable we are checking the value of
            case 1:     System.out.println("Sunday");
                        break; // execution continues until a "break;" is encountered.
            case 2:     System.out.println("Monday");
                        break;
            case 3:     System.out.println("Tuesday");
                        break;
            case 4:     System.out.println("Wednesday");
                        break;
            case 5:     System.out.println("Thursday");
                        break;
            case 6:     System.out.println("Friday");
                        break;
            case 7:     System.out.println("Saturday");
                        break;
            default:    System.out.println("Error"); // this is executed when none of the cases are hit
                        break;
        }
        /*
        if( dayNum == 1 )
        {
            System.out.println("Sunday");
        }
        else if( dayNum == 2 )
        {
            System.out.println("Monday");
        }
        // continue all the way through Saturday
        else
        {
            System.out.println("Error");
        }
        */
    }
}











