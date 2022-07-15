import java.io.*;
import java.util.*;
public class q1 {

	public static void main(String[] args) throws IOException {
	
		int ch;
		File f1=new File("E:\\Exam\\Exam\\src\\num.txt");
		File f2=new File("E:\\Exam\\Exam\\src\\even.txt");
		File f3=new File("E:\\Exam\\Exam\\src\\odd.txt");
		
		FileInputStream num=new FileInputStream(f1);
		FileOutputStream even=new FileOutputStream(f2);
		FileOutputStream odd=new FileOutputStream(f3);
		
		while((ch=num.read())!=-1)
		{
			if(ch%2==0)
			{
				even.write(ch);
			}
			else
			{
				odd.write(ch);
			}
		}
		System.out.println("Finished");

	}
	

}
