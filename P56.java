										//{TYPE CASTING]
class Parent
{
    void m2()
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
		p.m2();
	  //p.m1(); is error that is why typecasting is needed

		Child c = (Child) p;					//TYPE CASTING

	  //Child c = (Parent) p;   Wrong typecasting can only happen for same class.

		c.m1();								//method is present in child class only
    }
}

//previous code no 55

/*[if reference variable is of type parent and object is of type Child then we can call only those methods
	using parent class reference variable which are
	(1)Present in parent class
	(2)Present in both the classes
   But if method is present only in Child class then we can't access it using parent class reference variable
   ]
   (if you want to access those method then you have to convert parent class reference variable into Child 
   type by TYPE CASTING)*/