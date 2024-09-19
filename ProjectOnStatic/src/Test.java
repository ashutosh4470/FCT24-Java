// Java program to demonstrate use of static blocks

public class Test
{
    // static variable
    int a = 10;
    static int b;
    {
        System.out.println("non Static block initialized.");
        System.out.println(b);
        b = 3 * 4;
        System.out.println(b);

    }
    // static block
    static {
        System.out.println("Static block initialized.");
        System.out.println(b);
        b = 3 * 4;
        System.out.println(b);

    }
     
    Test(){
    	System.out.println("Constructor called    ");
    }

    public static void main(String[] args)
    {
       System.out.println("from main");
       Test t = new Test();
       System.out.println("Value of b : "+b);
    }
}
