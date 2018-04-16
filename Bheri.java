import java.util.*;
class Bheri{  
int fun_1()
{
	try
	{
		int val=10/0;
		if(val>1)
		{
			System.out.println("in try block");
			return -55;
		}
	}
	catch(Exception e)
	{
		System.out.println("in catch block");
		return 5;
	}
	/*finally
	{
		//return -5;
		System.out.println("finally block");
		return -5;
	}*/
return -1; //error: missing return statement
}
public static void main(String args[])
{ 
Bheri obj=new Bheri(); 
	int val=obj.fun_1();
	System.out.println("val is "+val);
}  
}

//o/p: 5 (with exception) -55 with out
// try/catch blocks always returns control to finally block(if present)
