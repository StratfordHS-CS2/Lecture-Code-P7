public class Matrix
{
    public static int arrayLargest( int[][] intArr )
    {
        int biggest = Integer.MIN_VALUE; // the smallest int = -2billion
        for( int row = 0; row < intArr.length; row++ )
        {
            for( int col = 0; col < intArr[row].length; col++ )
            {
                if( intArr[row][col] > biggest )
                {
                    biggest = intArr[row][col];
                }
            }
        }
        return biggest;
    }
    
    public static void main( String[] args )
    {
        int[][] array = {
            { 1, 2, 3, 4 },
            { 8, 4, 9, 1 },
            { 4, 3, 7, 9 }
        };
        
        // print the array
        for( int row = 0; row < array.length; row++ )
        {
            for( int col = 0; col < array[row].length; col++ )
            {
                System.out.print( array[row][col] + " " );
            }
            System.out.println();
        }
        
        System.out.println( "The largest number is: " + arrayLargest(array) );
    }
}








