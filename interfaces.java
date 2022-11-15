interface flowers
{
void view();
}
class WaterFlowers implements flowers
{
public void view()
{
System.out.println(" waterflowers view is looking good" );
}
public static void main(String args[])
{
WaterFlowers W=new WaterFlowers();
W.view();
}
}