import java.util.*;
class Bheri{  
int fun_1()
{
	try
	{
		int val=10/0;
	}
	catch(Exception e)
	{
		System.out.println(e);
		return 5;
	}
	finally
	{
		return -5;
	}

}
public static void main(String args[])
{ 
Bheri obj=new Bheri(); 
	int val=obj.fun_1();
	System.out.println("val is "+val);
}  
}
