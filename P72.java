										//[INTERFACE]
//example of point 7
//(Multiple Inheritance) 
interface A
{
	void m1();						//bydefault abstract method
}
interface B
{
	void m2();
}
class C
{
}
abstract class D extends C implements A,B
{
}



/*
[an abstract class can be extended from a class and implemented from an interface or interfaces 
 at the same time]

-It supports multiple inheritance 
-an interface can have one,two or more than two parents at the same time.

class C can't be a normal class because interfaec B inherits from A which has m1(); which has abstract 
method and B inherit m1() and the class which is inherited from B so it also contains m1() so it has to be 
an abstract class.

we can't extend interface to class we can only implement interface to class.
we can extends interface to interface
*/