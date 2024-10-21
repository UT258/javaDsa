package oops;

public class inheritance {
    public static void main(String[] args) {
        B obj=new B();
        obj.show();

    }

}
class A
{
    public void show()
    {
        System.out.println("in A");
    }
}
class  B extends A
{   @Override
    public void show()
    {
        System.out.println("in B");
    }
}
//mulitiple level inheritance
// class A
class c extends A{
    public void show()
    {
        System.out.println("in c");
    }
}
class D extends  c
{
    public void show()
    {
        System.out.println("in D");
    }
}
class  E extends D
{
    public void show()
    {
        System.out.println("in E");
    }
}
//in multilevel inheritance the method of the class which is nearest to the object is called
//if the method is not present in the nearest class then the method of the parent class is called
//if the method is not present in the parent class then the method of the grandparent class is called
//if the method is not present in the grandparent class then the method of the great grandparent class is called
//herirachical inheritance in java
//in heierarchical inheritance the parent class is inherited by multiple child classes
class F extends A
{
    public void show()
    {
        System.out.println("in F");
    }
}
class G extends  A
{
    public void show()
    {
        System.out.println("in G");
    }
}



