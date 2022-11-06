import java.util.Scanner;
class palindram
{
public static void main(String args[])
{
int num,n,t,rev=0;
Scanner in=new Scanner(System.in);
System.out.println("enter the number");
num=in.nextInt();
n=num;
while (n>0)
{
t=n%10;
rev=rev*10+t;
n=n/10;
}
if(num==rev)
{
System.out.println(num+"is palindrum");
}
else
System.out.println(num+"is not palindrum");
}
}