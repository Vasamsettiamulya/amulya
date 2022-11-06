import java.util.Scanner;
class Addition
{
public static void main(String args[])
{
int a[][],b[][],c[][],i,j,m,n;
Scanner in=new Scanner(System.in);
System.out.println("enter no of rows and columns");
m=in.nextInt();
n=in.nextInt();
a=new int[m][n];
b=new int[m][n];
System.out.println("enter matrix a");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=in.nextInt();
}
}
System.out.println("enter matrix b");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
b[i][j]=in.nextInt();
}
}
System.out.println("matrix A is:");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
System.out.println("matrix B is:");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(b[i][j]+"\t");
}
System.out.println();
}
System.out.println("\n sum of two matrix is");
c=new int[m][n];
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(c[i][j]+"\t");
}
System.out.println();
}
}
}
