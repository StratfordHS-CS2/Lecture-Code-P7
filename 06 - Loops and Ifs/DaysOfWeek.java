import java.util.Scanner;
import java.util.GregorianCalendar;

public class DaysOfWeek
{
    public static void printDaysOfWeek()
    {
        // for loops are for when you know how many times
        // you want the loop to run.
        // for( starting condition; continuing condition; increment )
        for( int i = 0; i <= 7; i++ )
        {
            System.out.println("Weekday " + i + ": " + weekdayName(i) );
        }
    }
    
    public static String weekdayName( int dayNum )
    {
        String dayName = "";
        // if dayNum = 1 --> dayName = Sunday
        if( dayNum == 1 )
        {
            dayName = "Sunday";
        }
        else if( dayNum == 2 )
        {
            dayName = "Monday";
        }
        else if( dayNum == 3 )
        {
            dayName = "Tuesday";
        }
        else if( dayNum == 4 )
        {
            dayName = "Wednesday";
        }
        else if( dayNum == 5 )
        {
            dayName = "Thursday";
        }
        else if( dayNum == 6 )
        {
            dayName = "Friday";
        }
        // else if( dayNum == 7 || dayNum == 0 )
        // "or" -> "||"
        // "and" -> "&&"
        // "not" -> "!"
        // "not equal" -> "!="
        else if( dayNum == 7 )
        {
            dayName = "Saturday";
        }
        else if( dayNum == 0 )
        {
            dayName = "Saturday";
        }
        else 
        {
            dayName = "error";
        }
        return dayName;
    }
    
    public static void main( String[] args )
    {
        // What is today?
        GregorianCalendar cal = new GregorianCalendar();
        int todayNum = cal.get( GregorianCalendar.DAY_OF_WEEK );
        System.out.println( "Today is a " + weekdayName( todayNum ) );
        System.out.println();
        
        System.out.println( "Weekday 1: " + weekdayName(1) );
        System.out.println( "Weekday 2: " + weekdayName(2) );
        System.out.println( "Weekday 3: " + weekdayName(3) );
        System.out.println( "Weekday 4: " + weekdayName(4) );
        System.out.println( "Weekday 5: " + weekdayName(5) );
        System.out.println( "Weekday 6: " + weekdayName(6) );
        System.out.println( "Weekday 7: " + weekdayName(7) );
        System.out.println( "Weekday 0: " + weekdayName(0) );
        System.out.println();
        System.out.println( "Weekday 43: " + weekdayName(43) );
        System.out.println( "Weekday 17: " + weekdayName(17) );
        System.out.println( "Weekday -1: " + weekdayName(-1) );
        
        System.out.println( "\nUsing a for loop..." );
        printDaysOfWeek();
        System.out.println();
        
        int dayNum = 0;
        Scanner keyboard = new Scanner( System.in );
        // while loops are for when you don't know how many
        // times the loop should run.
        // while( continuation condition )
        while( dayNum != -1 )   // -1 means quit
        {
            System.out.print("Enter a day of the week (0-7): ");
            dayNum = keyboard.nextInt();
            keyboard.nextLine();  // read the \n and get ready for more input
            if( dayNum != -1 )
            {
                System.out.println("Weekday " + dayNum + ": " + weekdayName(dayNum));
            }
            else  // dayNum == -1 so we are quitting
            {
                System.out.println("Exiting...");
            }
        }
    }
}




 









