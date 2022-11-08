class StringFunction
{
public static void main(String args[])
{
String s1="hello";
String s2="java";
String s3;
System.out.println("length of"+s1+"is:"+s1.length());
s3=s1.concat(s2);
System.out.println("5th position of"+s1+"is:"+s1.charAt(4));
System.out.println("v position of"+s2+"is:"+s2.indexOf('v'));
System.out.println("UpperCase of"+s2+"is:"+s2.toUpperCase());
System.out.println("LowerCase of"+s1+"is:"+s1.toLowerCase());
}
}