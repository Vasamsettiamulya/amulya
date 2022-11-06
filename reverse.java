import java.util.Scanner;
class reverse
{
public static void main(String args[])
{
int n,t,rev=0;
Scanner in=new Scanner(System.in);
System.out.println("enter n values");
n=in.nextInt();
while (n>0)
{
t=n%10;
rev=rev*10+t;
n=n/10;
}
System.out.println("reverse="+rev);
}
}