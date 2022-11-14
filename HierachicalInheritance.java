class chocolate
{
void eat()
{
System.out.println("chocolates are very tasty...");
}
}
class DairyMilk extends chocolate
{
void bubbly()
{
System.out.println("dairymilk bubbly flavour is very smoothy texture");
}
}
class munch extends chocolate
{
void tasty()
{
System.out.println("i like munch chocolate very much");
}
}
class cadbury
{
public static void main(String args[])
{
munch m=new munch();
m.eat();
m.tasty();
}
}