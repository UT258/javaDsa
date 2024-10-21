package oops;

public class mutlipleinheritance {
    //in multiple inheritance the child class is inheriting from multiple parent classes
    //in java multiple inheritance is not supported
    //so we use interface to achieve multiple inheritance
    //there is a term called abstract class in java which is used to achieve partial abstraction
    public static void main(String[] args) {
        A3 obj=new A3();

    }
}
abstract  class absract
{
    abstract void show();
    //it can have normal methods also
    void display() {
        System.out.println("in display");
    }
    //the main difference between abstract class and interface is that abstract class can have normal methods also
}

interface  B1 {
    void B1();
    //interface can have only abstract methods
    //it can have default methods also
    default void show()
    {
        System.out.println("in show");
    }
    //it can have static methods also
    static void display()
    {
        System.out.println("in display");
    }
}
interface B2
{
    void B2();
}
class A3 implements B1,B2
{
    public void B1()
    {
        System.out.println("in A1");
    }
    public void B2()
    {
        System.out.println("in A2");
    }
}
