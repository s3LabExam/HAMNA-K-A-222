import java.io.*;
import java.util.*;
public class q4{
  public static void main(String[] args) throws IOException{
    File x=new File("from.txt");
    File y=new File("even.txt");
    File z=new File("odd.txt");
    
    FileInputStream in= new FileInputStream(x);
    FileOutputStream out=new FileOutputStream(y);
    FileOutputStream outs=new FileOutputStream(z);
    
    int ch;
    while((ch=in.read())!=-1)
    {
       if(ch%2==0)
          out.write(ch);
       else
          outs.write(ch);
    }
    in.close();
    out.close();
    outs.close();
 }
}
