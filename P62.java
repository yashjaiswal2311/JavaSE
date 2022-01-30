								//[Abstract Class & Methods]

abstract class Test
{
	abstract void m1();						//abstract methods does not contain body that's why it is called
											//as incomplete methods and it terminates by ';'
	public static void main(String[] args) 
	{
	}
}




/*[Note:-
 1: we can create main method inside abstract class.
 2: we can't create object/instance of abstract class but it can be subclassed & subclasses usually provides
    implementation for all the abstract methods in its parent class
 3: Abstract class may or may not contain abstract method but
    if it contains an abstract method then it must be an abstract class otherwise Error
 4:-Abstract class can have normal methods.
 5: we can inherit a normal class from an abstract class and also an abstract class from normal class.

Ex:- Error
class Test
{
	abstract void m1();
	public static void main(String[] args) 
	{
	}
}
]*/