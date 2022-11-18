import java.io.*;
public class ReadData
{
public static void main(String args[]) throws IOException
{
FileReader fr=new FileReader("C:\\Program Files\\Java\\jdk1.6.0_29\\bin\\self.txt");
BufferedReader br=new BufferedReader(fr);
String str;
while((str=br.readLine())!=null)
{
System.out.println(str);
}
br.close();
}
}
