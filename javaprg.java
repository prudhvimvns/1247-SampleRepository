package javapackage;

import Sample.A;
import Sample.B;

interface Interface
{
	public static int y=100;
}

class B implements Interface
{
	private int x=10;
	public void set(int j)
	{
		x=j;
	}
	public void get()
	{
		System.out.print("y value is:"+y+" and x value is:"+x);
	}
}

class A implements Interface
{
	public void Amethod()
	{
		System.out.println("This is A method");
	}
}
public class javaprg extends A
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		A obj = new A();
		obj.Amethod();
		B obj1 = new B();
		obj1.set(20);
		obj1.get();

	}

}
