class birds
{
void fly()
{
System.out.println("birds are flying");
}
}
class flyBirds extends birds
{
void earth()
{
System.out.println("birds are flying onsky");
}
}
class parrot extends flyBirds
{
void beauty()
{
System.out.println("parrot is beautyful");
}
}
class green
{
public static void main(String args[])
{
parrot p=new parrot();
p.fly();
p.earth();
p.beauty();
}
}