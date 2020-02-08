class Chocolates
{
	 String[] chocolates= {"choco","sugarchoco","saltchoco","choco2"};
	 String s=chocolates.toString();
	public Chocolates()
	{
		System.out.println("chocolates");
	}
}
class Sweet11 extends Chocolates//inheritance concept
{
	public Sweet11()
	{
		System.out.println(s);
	System.out.println("sweet1");
}

	public void Sweet1() {
		System.out.println(s);
		// TODO Auto-generated method stub
		
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
		System.out.println("sweet2");
	}

	@Override
	public void sweet2() {
		System.out.println("sweet2");

		
		// TODO Auto-generated method stub
		
	}
}
class Newgift
{
	public static void main(String args[])
	{
		Sweet11 s=new Sweet11();//creation of objects
		s.Sweet1();
		Newyeargift n=new Newyeargift();
		n.Sweet2();
		
				
	}
}
