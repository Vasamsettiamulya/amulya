import java.util.Scanner;
class EvenOrOdd
{
public static void main(String args[])
{
int n;
Scanner in=new Scanner(System.in);
System.out.println("enter the number");
n=in.nextInt();
if(n%2==0)
{
System.out.println(n+"is even");
}
else
System.out.println(n+"is odd");
}
}