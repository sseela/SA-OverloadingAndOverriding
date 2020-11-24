package olAndor;

class X
{
    void calculate(int a, int b)
    {
        System.out.println("Class X");
    }
}
 
class Y extends X
{
    @Override
    void calculate(int a, int b)
    {
        System.out.println("Class Y");
    }
}
 
class Z extends Y
{
    @Override
    void calculate(int a, int b) 
    {
        System.out.println("Class Z");
    }
}
 
public class MainClass 
{   
    public static void main(String[] args)
    {
        X x = new Y();
         
        x.calculate(10, 20);
        
        if(x instanceof Y) {									// instanceof is true when ref is of currenttype or its parent type.
        	System.out.println("x is holding Y object");
        }
        if(x instanceof X) {
        	System.out.println("x is of supertype X also");
        }
        if(x instanceof Z) {
        	System.out.println("x");
        }
        Y y = (Y) x;				// here we are downcasting the type only from parent type to child type to call child specific methods.
        
         
        y.calculate(50, 100);
         
        Z z = (Z) y;
         
        z.calculate(100, 200);
    }
    
}