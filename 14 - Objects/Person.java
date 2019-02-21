public class Person
{
    // properties of a person
    // "instance variables"
    private String name;
    private int age;
    private int height; // inches
    private String hairColor;
    
    // constructor
    // set default values
    public Person()
    {
        name = "";
        age = 0;
        height = 0;
        hairColor = "";
    }
    
    // Other methods
    public String greeting()
    {
        return "Good Morning!";
    }
    
    // accessors
    // getters
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public String getHairColor()
    {
        return hairColor;
    }
    
    // setters
    public void setName( String n )
    {
        name = n;
    }
    
    public void setAge( int a )
    {
        age = a;
    }
    
    public void setHeight( int h )
    {
        height = h;
    }
    
    public void setHairColor( String hc )
    {
        hairColor = hc;
    }
    
    // toString - tell Java how to print this class
    public String toString()
    {
        return name + " is " + age + " years old, " + height + " inches tall with " + hairColor + " hair.";
    }

}