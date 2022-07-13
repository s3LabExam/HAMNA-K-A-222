import java.io.*;
import java.net.*;
public class server{
  public static void main(String[] args) throws Exception{
     try{
       ServerSocket ss=new ServerSocket(2665);
       System.out.println("Server is waiting for client");
       Socket sk=ss.accept();
       System.out.println("Connection established");
       InputStreamReader isr=new InputStreamReader(sk.getInputStream());
       BufferedReader br=new BufferedReader(isr);
       String str=br.readLine();
       System.out.println("The Message is:");
       System.out.println(str);
       
       PrintWriter pw=new PrintWriter(sk.getOutputStream(),true);
       pw.println("Server:Hello client!");
       pw.close();
      }
      catch(Exception e){
          System.out.println("Error");
      }
   }
}
