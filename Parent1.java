class Parent1
{
    void m1()
    {
        System.out.println("Parent class m1 method");
    }
}
class Child extends Parent1
{
    int m1()
    {
        System.out.println("Child class m1 method");
		return 0;
    }
    public static void main(String[] args)
    {
        Child c= new Child();
		c.m1();
    }
}