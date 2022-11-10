class demoExample	
{
int a=100;
static void t()
{
System.out.println("this is static method");
}
}
class Example
{
public static void main(String args[])
{
demoExample de=new demoExample();
System.out.println(de.a);
}
}