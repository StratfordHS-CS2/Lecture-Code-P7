public class PersonRunner
{
    public static void main( String[] args )
    {
        Person gabriel = new Person();
        System.out.println( gabriel );
        gabriel.setName( "Gabriel" );
        gabriel.setAge( 4 );
        gabriel.setHeight( 66 );
        gabriel.setHairColor( "carrot" );
        System.out.println( gabriel );
        
        Person nick = new Person();
        nick.setName( "Nick" );
        nick.setAge( 12 );
        nick.setHeight( 100 );
        nick.setHairColor( "black" );
        System.out.println( nick );
        
        System.out.println( "Gabriel is " + gabriel.getHeight() + " inches tall." );
        System.out.println( "Nick is " + nick.getAge() + " years old." );
        System.out.println( nick.greeting() );
        
        
        
        
        
        
        
        
        
    }
}