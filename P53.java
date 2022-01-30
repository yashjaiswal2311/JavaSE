                                         /*[Polymorphism]
                                            [Run-Time]
                                        [Method Overidding]*/
//example of non-primitive level
class X
{
}
class Y extends X
{
}
class Parent
{
    X m1()
    {
		X x = new X();
        System.out.println("Parent class m1 method");
		return x;
    }
}
class Child extends Parent
{
    Y m1()
    {
		Y y = new Y();
        System.out.println("Child class m1 method");
		return y;
    }
    public static void main(String[] args)
    {
        Child c= new Child();
		c.m1();
    }
}

/*it is non primitive cause method m1 is of class type and returning the object of that class and it is must
  for X & Y to have parent child relation and X must return object x and Y must return object y*/ 

/*Child class and Parent class return type can be different at non primitive level 

  but can't be different at primitive level*/