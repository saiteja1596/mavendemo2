class chocolates
{
	 String[] chocolates= {"choco","sugarchoco","saltchoco","choco2"};
	 String s=chocolates.toString();
	public void choco()
	{
		System.out.println("chocolates");
	}
}
class sweet1 extends chocolates//inheritance concept
{
	public void sweet1()
	{
		System.out.println("chocolates are:",s);
	System.out.println("sweet1");
}
}
interface sweet2//interface declaration
{
	public void sweet2();
}
class newyeargift implements sweet2//interface concept with implementation
{
	public void sweet2()
	{
		System.out.println("sweet2")
	}
}
class newgift
{
	public static void main(String args[])
	{
		sweet1 s=new sweet1();//creation of objects
		s.sweet1();
		newyeargift n=new newyeargift();
		n.sweet2();
		
				
	}
}