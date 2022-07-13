import java.io.*;
import java.util.*;
public class q2{
   public static void main(String[] args) throws IOException
   {
      File myobj=new File("/home/hamna/hamna.txt");
      FileWriter myWriter=new FileWriter("/home/hamna/hamna.txt");
      myWriter.write("Hai...");
      myWriter.close();
      
      Scanner myReader=new Scanner(myobj);
      while(myReader.hasNextLine()){
         String data=myReader.nextLine();
         System.out.println(data);
       }
   }
}
      
      
