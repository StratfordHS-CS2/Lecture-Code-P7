public class ArrayPractice
{
    public static void printIntArray( int[] array )
    {
        for( int i = 0; i < array.length; i++ )
        {
            System.out.print( array[i] + " " );
        }
        System.out.println();
    }
    
    public static void printStrArray( String[] array )
    {
        for( int i = 0; i < array.length; i++ )
        {
            System.out.println( array[i] );
        }
    }
    
    public static void main( String[] args )
    {
        int[] nums = new int[10];
        for( int i = 0; i < nums.length; i++ )
        {
            nums[i] = i;
        }
        printIntArray( nums );
        System.out.println();
        
        String[] names = {"Bob", "Jack", "Bryce", "Jacob", "Janet"};
        printStrArray( names );
        System.out.println();
        names[0] = "William";
        printStrArray( names );
        System.out.println();
        
        // add one more name to the array
        // make a new empty array of the correct length
        String[] names2 = new String[ names.length + 1 ];
        // copy the names from names[] into the new array
        for( int i = 0; i < names.length; i++ )
        {
            names2[i] = names[i];
        }
        // add the new name to the last box
        names2[ names2.length-1 ] = "Ella";
        names = names2;
        printStrArray( names );
    }
}








