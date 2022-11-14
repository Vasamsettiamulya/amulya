class food
{
void solid()
{
System.out.println("some solid foods are cakes..chocolates");
}
}
class biscuit extends food
{
void eat()
{
System.out.println("tea and biscuit combination are very tasty");
}
}
class FoodTest
{
public static void main(String args[])
{
biscuit b=new biscuit();
b.solid();
b.eat();
}
}