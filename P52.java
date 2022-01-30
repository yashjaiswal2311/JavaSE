                                         /*[Polymorphism]
                                            [Run-Time]
                                        [Method Overidding]*/
class Parent
{
    void m1()
    {
        System.out.println("Parent class m1 method");
    }
}
class Child extends Parent
{
    void m1()
    {
        System.out.println("Child class m1 method");
    }
    public static void main(String[] args)
    {
        Child c= new Child();
		c.m1();
    }
}

//also an example of primitive level cause it is  returning values of primitive type void,int char,float,etca