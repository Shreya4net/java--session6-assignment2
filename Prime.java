import java.io.*;
public class Prime implements  Runnable {
public void run()
{
	int no;
	for(no=2; no<=100;no++)
	{
		int sum=0;
		for(int i=2;i<=no/2;i++)
	if(no%i==0)
	{
sum++;
break;
	}
		if(sum==0)
System.out.println(no+"Number is prime");
	}}
	public static void main(String args[])
	{
		
		{
			Prime p1=new Prime();
			Thread t1=new Thread(p1);
			t1.start();
		}
	 
	}
	}