//Creating object of child class by using parent class

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
        Parent p = new Child();
		p.m1();
    }
}