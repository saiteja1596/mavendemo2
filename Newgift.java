class Chocolates
{
	 String[] chocolates= {"choco","sugarchoco","saltchoco","choco2"};
	 String s=chocolates.toString();
	public void Chocolates()
	{
		System.out.println("chocolates");
	}
}
class Sweet1 extends Chocolates//inheritance concept
{
	public void Sweet1()
	{
		System.out.println("chocolates are:",s);
	System.out.println("sweet1");
}
}
interface Sweet2//interface declaration
{
	public void sweet2();
}
class Newyeargift implements Sweet2//interface concept with implementation
{
	public void Sweet2()
	{
		System.out.println("sweet2")
	}
}
class Newgift
{
	public static void main(String args[])
	{
		Sweet1 s=new Sweet1();//creation of objects
		s.Sweet1();
		Newyeargift n=new Newyeargift();
		n.Sweet2();
		
				
	}
}
