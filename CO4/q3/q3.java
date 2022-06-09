import java.util.Scanner;
class UsernameException extends Exception
{
	UsernameException(String msg)
	{
		super(msg);
	}
}
public class q3{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String username;
		String password;
		System.out.println("Enter the Username:");
		username=sc.nextLine();
		System.out.println("Enter the password:");
		password=sc.nextLine();
		try{
			if(username.matches("hamna") && password.matches("hamnammu#001"))
			{
				System.out.println("Login Succesfull");
			}
			else
			{
				throw new UsernameException("Invalid username or password");
			}
		}
		catch(UsernameException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
