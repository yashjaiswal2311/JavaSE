class Box
{
	int l,w,h;

	void volume()
	{
		System.out.println("Volume is: "+(l*w*h));
	}
	Box(int x)
	{
		l= w= h = x;
		System.out.println("Cube Created");
	}
	Box(int x,int y,int z)
	{
		l = x;
		w = y;
		h = z;
		System.out.println("Cuboid Created");
	}
	public static void main(String[] args)
	{
		Box cube = new Box(10);
		cube.volume();

		Box cuboid = new Box(10,20,30);
		cuboid.volume();
	}
}