class animal
{
void bark()
{
System.out.println("animals are barked with differt sounds");
}
}
class dog extends animal
{
void bark()
{
System.out.println(" dog shouts like bow....bow...");
}
}
class cat extends animal
{
void bark()
{
System.out.println(" cat shouts like meow...meow...");
}
}
class goat extends animal
{
void bark()
{
System.out.println(" goat shouts like mah..mah....");
}
}
class AnimalExample
{
public static void main(String args[])
{
animal a=new animal();
a.bark();
dog d=new dog();
d.bark();
cat c=new cat();
c.bark();
goat g=new goat();
g.bark();
}
}