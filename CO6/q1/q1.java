import java.io.*;
public class q1
{
   public static void main(String[] args) throws IOException
   {
   String[] pathnames;
   File f=new File("/home/hamna/Desktop/hamna");
   pathnames=f.list();
   System.out.println("Listing all files and directories in specified location:");
   for(String i : pathnames){
        System.out.println(i);
   }
   
   FilenameFilter filter=new FilenameFilter(){
   
       public boolean accept(File dir, String fname)
       {
           return fname.startsWith("h");
       }
   };
   
   String[] search=f.list(filter);
   System.out.println("Searching for specified file:");
   
   if(search.length==0)
   {
   System.out.println("Empty directory");
   }
   else
   {
   for( int i=0;i < search.length;i++)
   {
       System.out.println(search[i]+" is founded");
   }
   }
   
 }
}
