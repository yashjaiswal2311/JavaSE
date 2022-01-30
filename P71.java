										//[INTERFACE]
//example of point 6
//(Multiple Inheritance) 
interface A
{
	void m1();						//bydefault abstract method
}
interface B extends A
{
	void m2();
}
interface C extends A,B
{
}



/*It supports multiple inheritance 
-an interface can have one,two or more than two parents at the same time.

class C can't be a normal class because interfaec B inherits from A which has m1(); which has abstract 
method and B inherit m1() and the class which is inherited from B so it also contains m1() so it has to be 
an abstract class.

we can't extend interface to class we can only implement interface to class.
we can extends interface to interface
*/