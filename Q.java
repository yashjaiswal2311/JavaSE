											//[IMPORT KEYWORD]
package pk4;
import pk3.P;						//importing class P of pk3
class Q
{
	public static void main(String[] args)
	{
		Q q = new Q();
		q.m1();
	}
}

/*we will create the objet of imported class ohrtwise error cause these two classes don't have parent child
 relationship but for protected types child class object must be created otherwise error

for importing it is must that the class we are importing to be a public class other it will show error
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