											//[IMPORT KEYWORD]
package pkg2;
import pkg1.A1;						//importing only class A1 of pkg1
class A2 extends A1
{
	public static void main(String[] args)
	{
		A2 a = new A2();
		a.m1();
	}
}

/*Error because 
if we are importing protected method then above class must have parent child relationship with the imported
 class
 to solve this extend A2 from A1
 and we must  create the object of child class*/


/*for importing it is must that the class we are importing to be a public class other it will show error
 can't import no default, protected  or private can be imported


[IMP*]
[we know that we can't access a member of a class in a package or file by a class present inside another
 package or file, but we can import that class into our code and then we can access the method of a class 
 which is present insid other package but there are few conditions:
{
(1)class which we are importing must be a public class method which is present inside that class can be public
or protected only for public direct access  but if it is protected then the class we are importing in our 
class must have parent child relationship between them or 
(imported class  must extends the class in which it is importing)
(2)in case of protected we will create object of child class and we will call the member of parent class
}

if both the classes present inside same package then we can access the one's class method in 
another class at public,protected and default but private method can't be access inside a package or outside
the package]
*/