//We can never override static methods in java and this is also known as 'Method Hiding'
//TYPE CASTING

class Parent
{
    void m2()
    {
        System.out.println("Parent class m2 method");
    }
    static void m1()
    {
        System.out.println("Parent class m1 method");
    }
}
class Child extends Parent
{
    void m3()
    {
        System.out.println("Child class m3 method");
    }
    static void m1()
    {
        System.out.println("Child class m1 method");
    }
    public static void main(String[] args)
    {
        Parent p = new Child();
        p.m1();
        p.m2();
        //p.m3();   error (read the note)
        Child c  = (Child) p;
        c.m1();
        c.m3();
    }
}
//NO OVERRIDING for static methods

/*[if reference variable is of type parent and object is of type Child then we can call only those methods
    using parent class reference variable which are
   (1)Present in parent class
   (2)Present in both the classes
 But if method is present only in Child class then we can't access it using parent class reference variable]
   (if you want to access those method then you have to convert parent class reference variable into Child 
   type by TYPE CASTING)*/

/*[Note:-reference variable of parent type of child class can access the method present inside parent class
 or present inside both ]the classes but can access method which are present in child class onlt thatswhy
 it can access m1(),m2() but not m3() and it will show error that is where the concept of TypeCasting
 introduced in the next line we are typecasting reference variable p in the object of class child c]*/