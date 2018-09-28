public class StringPractice
{
    public static void main( String[] args )
    {
        // Create a string. You must have double quotes around a string.
        String str = "Comp Sci";
        // String.length() returns an int that is how many characters are in the string.
        // Remember, character locations go from 0 to length-1
        int len = str.length();
        System.out.println("str length is " + len );
        
        // Loop through the string from start to finish and print each character on 
        // its own line.  Printing the string vertically.
        for( int i = 0; i < str.length(); i++ )
        {
            System.out.println( str.charAt(i) );
        }
        
        // Loop through the string from back to front printing each character.
        // This prints the string backwards.
        for( int i = str.length()-1; i >= 0; i-- )
        {
            System.out.print( str.charAt(i) );
        }
        System.out.println();
        
        // String.indexOf( char or string ) returns the location of the first
        // occurance of the char or string in the string.
        int spaceLoc = str.indexOf(" ");
        System.out.println("First space is at location " + spaceLoc);
        int strLoc = str.indexOf("Sc");
        System.out.println("Sc is at location " + strLoc);
        System.out.println("zzzz is at location " + str.indexOf("zzzz"));
        
        String str2 = "Stratford Computer Science";
        System.out.println("lastIndexOf r is " + str2.lastIndexOf("r") );
        
        // String.substring(x, y) returns the string starting at x and going until,
        // but not including, y.
        // String.substring(x) returns the string starting at x and going through the
        // end of the string.
        String str3 = "Computer Science";
        String word1 = str3.substring(0, str3.indexOf(" ") );
        String word2 = str3.substring(str3.indexOf(" ")+1 );
        System.out.println("word1 is \'" + word1 + "\'");
        System.out.println("word2 is \'" + word2 + "\'");
        
        String str4 = word1 + word2;
        System.out.println( str4 );
        
        // I may have mentioned it a time or two, but
        // DONT USE == TO COMPARE STRINGS
        // DONT USE == TO COMPARE STRINGS
        // DONT USE == TO COMPARE STRINGS
        // You must use String.equals() to compare strings.
        if( word1.equals("Computer") )
        {
            System.out.println("I found a Computer");
        } else {
            System.out.println("No Computer");
        }
        
        // to make a char a String
        char c = 'A';
        //String s = c;  // doesn't work because char is not a String
        String s = Character.toString(c);
    }
}













