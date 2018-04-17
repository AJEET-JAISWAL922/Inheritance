package com.Inheritance;

public class Inheritance {
	protected int a=10;
	public void nameA()
	{
		System.out.println("Ajeet");
	}

}
class B extends Inheritance
{
	public static void main(String args[])throws Exception
	{
		Inheritance aa = new Inheritance();
System.out.println(aa.a);
aa.nameA();
	}
}