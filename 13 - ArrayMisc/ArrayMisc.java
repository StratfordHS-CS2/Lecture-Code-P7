import java.util.Arrays;

public class ArrayMisc
{
    public static String outputIntArray( int[] arr )
    {
        String out = "";
        out = "[ ";
        for( int i = 0; i < arr.length; i++ )
        {
            out += arr[i] + " ";
        }
        out += "]";
        return out;
    }
    
    public static String outputStrArray( String[] arr )
    {
        String out = "";
        for( int i = 0; i < arr.length; i++ )
        {
            out += arr[i] + "\n";
        }
        return out;
    }
    
    public static void main( String[] args )
    {
        // What is the default value of an int array
        int[] intArr = new int[5];
        System.out.println( outputIntArray( intArr ) );
        // The default values for an int array is an array of zeros.
        
        // fill an array with 42s
        // Arrays.fill( arrayName, value );
        Arrays.fill( intArr, 42 );
        System.out.println( outputIntArray( intArr ) );
        
        // change some of the values
        intArr[1] = 15;
        intArr[2] = 9;
        intArr[3] = 24;
        System.out.println( outputIntArray( intArr ) );
        
        // sort the array
        // Arrays.sort( arrayName );
        Arrays.sort( intArr );
        System.out.println( outputIntArray( intArr ) );
        
        // Try it again, this time with Strings
        String[] strArr = new String[5];
        System.out.println( outputStrArray( strArr ) );
        // Default values in a String array are nulls (no value)
        
        strArr[0] = "Compsci";
        strArr[1] = "computer";
        strArr[2] = "Physics C";
        strArr[3] = "CompScience";
        strArr[4] = "Physics Class";
        System.out.println( outputStrArray( strArr ) );
        Arrays.sort( strArr );
        System.out.println( outputStrArray( strArr ) );
    }
}










