class Example
{
public static void main(String args[])
{
try
{
int num=120/0;
System.out.println(num);
}
catch(ArithmeticException e)
{
System.out.println(e);
System.out.println("number should notbe divided");
}
finally
{
System.out.println("this is final block");
}
System.out.println("out of try-catch-final");
}
}