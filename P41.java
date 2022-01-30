class A
{
	int x = 60;
	static int y =40;
}
class B extends A
{
	int x = 10;
	static int y =20;
	static										//error
	{
		System.out.println(this.x+this.y);
		System.out.println(super.x+super.y);
	}
	{
		System.out.println(this.x+this.y);
		System.out.println(super.x+super.y);
	}
	public static void main(String[] args) 
	{
		new B();
	}
}


//(this) keyword is used as the object of present class to access instance variables.
//(super) keyword is used as the object of parent class to access instance variables.

//we can't use this & super inside a static method,static block
//and can be used inside instance method & block.