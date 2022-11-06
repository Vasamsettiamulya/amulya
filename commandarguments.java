class cmd
{
public static void main(String args[])
{
int i,n;
n=args.length;
System.out.println("no of arguments="+n);
System.out.println("arguments is");
for(i=0;i<n;i++)
{
System.out.println(args[i]);
}
}
}