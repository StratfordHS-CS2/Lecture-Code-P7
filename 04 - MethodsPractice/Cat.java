public class Cat
{
    /**
     * Prints the string "Meow!" every time it is called.
     * void means there is no information returned to the
     * calling method.
     */
    public static void speak()
    {
        System.out.println("Meow!");
    }
    
    /**
     * Returns the string "Fluffy" since that is the cat's name.
     * "String" in the first line means that a String value must
     * be returned.  There must be a return statement.  Whenever
     * there is a return statement it must be documented in the
     * javadoc comment.
     * 
     * @return  The name of the cat.
     */
    public static String name()
    {
        String myName = "Fluffy";
        return myName;
    }
    /**
     * The cat will sleep for a specified number of minutes.
     * Anytime you have a parameter sent to the method you must add
     * a @param tag to the javadoc
     * 
     * @param   time    How many minutes the cat should nap.
     */
    public static void takeANap( int time )
    {
        int napLength = time;
        System.out.println("Zzzz... Sleeping for " + napLength + " minutes.");
    }
    
    public static void main( String[] args )
    {
        System.out.println("Hello. I am a cat.");
        System.out.print("What does the cat say? ");
        speak();
        System.out.println("My name is " + name() );
        String catName = name();
        System.out.println("My name is " + catName );
        System.out.println("Take a 5 minute nap.");
        takeANap(5);
    }
}










