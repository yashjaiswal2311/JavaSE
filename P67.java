										//[INTERFACE]
interface A
{
	//void m1();						//bydefault abstract method
	//void m2();						//bydefault abstract method
}
class B implements A
{
}





/*
we can't extend interface to class we can only implement interface to class.
A normal class can't be implemented by interface A because it can contain abstract method and normal class
can't have abstract method so it can be implemented only when an Interface has no methods 
*/