import java.util.Scanner;
class Division
{
public static void main(String args[])
{
int a,b,div;
Scanner in=new Scanner(System.in);
System.out.println("enter a,b values /n");
a=in.nextInt();
b=in.nextInt();
div=a/b;
try
{
System.out.println("division of "+a+"/"+b+"="+div);
}
catch(ArithmeticException e)
{
System.out.println(e);
System.out.println("check the values");
}
finally
{
System.out.println("program completed");
}
}
}