import java.util.ArrayList;

public class ArrayListPractice
{
    public static void main( String[] args )
    {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        
        numList.add(0);  // add 0 to the end of numList
        numList.add(1);
        numList.add(2);
        numList.add(3);
        System.out.println( numList );
        
        numList.add( 2, 25 );  // add 25 at location 2
        System.out.println( numList );
        
        numList.set( 3, 200 );  // set location 3 to be 200
        System.out.println( numList );
        
        System.out.println( "Location 2 is " + numList.get(2) );
        
        numList.remove( 3 );
        System.out.println( numList );
        
        System.out.println( "numList contains a 3: " + numList.contains( 3 ) );
        System.out.println( "A 3 is at location: " + numList.indexOf(3) );
        System.out.println( "numList size is " + numList.size() );
        
        // ArrayLists hold objects, not primative data types.
        // You can't use == to compare object values, use .equals
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(255);
        test.add(255);
        System.out.println( test );
        System.out.println( "Using ==: " + (test.get(0) == test.get(1)) );
        System.out.println( "Using .equals: " + test.get(0).equals(test.get(1)) );
        
        
        
        
    }
}







