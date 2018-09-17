public class MathPractice
{
    public static double cubeVolume( double side )
    {
        double volume;
        volume = Math.pow( side, 3 );
        return volume;
    }
    
    public static void main( String[] args )
    {
        double sideLength = 5;
        double vol = cubeVolume( sideLength );
        System.out.println( "A cube with sides " + sideLength + " long has volume " + vol );
        System.out.println( "Math.PI = " + Math.PI );
        System.out.println( "Absolute value of -32 is " + Math.abs( -32 ) );
        System.out.println( "Square root of 45 is " + Math.sqrt( 45 ) );
    }
}







