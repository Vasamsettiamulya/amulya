import java.util.Scanner;
class ArmstrongOrNot
{
public static void main(String args[])
{
int num,n,sum=0,r;
Scanner in=new Scanner(System.in);
System.out.println("enter the number");
num=in.nextInt();
n=num;
while (n>0)
{
r=n%10;
sum=sum+r*r*r;
n=n/10;
}
if(num==sum)
{
System.out.println(num+"is armstrong");
}
else
System.out.println(num+"is not armstrong");
}
} 