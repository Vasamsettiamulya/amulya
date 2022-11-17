record Student(int rollno,String name,String address,int age)
{
Student()
{
this(01,"manga","draksharama",21);
}
public static void main(String args[])
{
Student S1=new Student(01, "manga" , "draksharam" ,21);
Student S2=new Student(02, "vasavi" , "kunduru" ,21);
Student S3=new Student(03, "rama" , "yanam" ,21);
Student S4=new Student(04, "sirisha" , "kakinada" ,21);
Student S5=new Student(05, "jaya" , "rajamundry" ,21);

System.out.println(S1);

System.out.println(S2);

System.out.println(S3);

System.out.println(S4);

System.out.println(S5);

}
}
