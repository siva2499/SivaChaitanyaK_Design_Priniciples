package Hello;

import java.util.Scanner;
public class Calculator{
static double addittion(double a,double b)
{
return a+b;
}
static double subtraction(double a,double b)
{
return a-b;
}
static double multiplication(double a,double b)
{
return a*b;
}
static double division(double a,double b)
{
return a/b;
}
public static void main(String args[])throws Exception
{
Scanner v=new Scanner(System.in);
double a,b,res=0;
char op;
System.out.println("Enter first number");
a=v.nextFloat();
System.out.println("Enter second number");
b=v.nextFloat();
System.out.println("\nEnter the operation needed \n + for Addition\n - for substraction\n* for multiplication\n/ for division");
op=v.next().charAt(0);
switch(op)
{
case '+':
       res=addittion(a,b);
	System.out.println(res);
	break;
case '-':
	res=subtraction(a,b);
	System.out.println(res);
	break;
case '*':
	res=multiplication(a,b);
	System.out.println(res);
	break;
case '/':
	if(b==0)
	System.out.println("Division with Zero is not possible");
	else
	{
	res=division(a,b);
	System.out.println(res);
	}
}
}
}



