class addition
{
int sum(int a,int b)
{
return(a+b);
}
int sum(int a,int b,int c)
{
return(a+b+c);
}
}
class example
{
public static void main(String args[])
{
addition a=new addition();
System.out.println(a.sum(30,40));
System.out.println(a.sum(10,50,70));
}
}
