import java.util.Scanner;
class factorial
{
public static void main(String args[])
{
int n,i,fact=1;
Scanner in=new Scanner(System.in);
System.out.println("enter the factorial");
n=in.nextInt();
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("factorial="+fact);
}
}