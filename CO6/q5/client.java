import java.net.*;
import java.io.*;
public class client{
  public static void main(String[] args) throws Exception{
  try{
     Socket s=new Socket("localhost",2665);
     PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
     pw.println("client:Hai Server");
     InputStreamReader isr=new InputStreamReader(s.getInputStream());
     BufferedReader br=new BufferedReader(isr);
     String str2=br.readLine();
     System.out.println("The Message is:");
     System.out.println(str2);
     pw.close();
     s.close();
     }
     
  catch(Exception e)
  {
     System.out.println("Error");
  }
 }
}
      
