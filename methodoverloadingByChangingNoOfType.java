class addition
{
int sum(int a,int b)
{
return(a+b);
}
double sum(double a,double b)
{
return(a+b);
}
}
class example
{
public static void main(String args[])
{
addition a=new addition();
System.out.println(a.sum(30,40));
System.out.println(a.sum(10.2,2.3));
}
}
