import java.io.*;
import java.util.*;
public class q3{
  public static void main(String[] args) throws IOException
  {
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter the source file name:");
      String a=sc.nextLine();
      File x=new File(a);
      
      System.out.println("Enter the destination file name:");
      String b=sc.nextLine();
      File y=new File(b);
      
      FileInputStream in= new FileInputStream(a);
      FileOutputStream out=new FileOutputStream(b);
      
      int ch;
      while((ch=in.read()) != -1)
      {
         out.write(ch);
      }
      System.out.println("File copied from source file to destination file");
      in.close();
      out.close();
   }
}
