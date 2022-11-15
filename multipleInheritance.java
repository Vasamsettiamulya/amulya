interface AnimalEat
{
void eat();
}
interface AnimalTravel
{
void Travel();
}
class Animal implements AnimalEat,AnimalTravel
{
public void eat()
{
System.out.println("animal is eating");
}
public void Travel()
{
System.out.println("animals are travelling");
}}
class Demo
{
public static void main(String args[])
{
Animal a=new Animal();
a.eat();
a.Travel();
}
}
