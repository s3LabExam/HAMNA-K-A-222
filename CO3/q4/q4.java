import java.util.*;
class book
{
	int bookid;
	String bookname;
	Scanner sc=new Scanner(System.in);
	book()
	{
		System.out.println("Enter the bookid:");
		bookid=sc.nextInt();
		System.out.println("Enter the name of book:");
		bookname=sc.next();
		
	}
	
}
class publisher extends book
{
	String publisher_name;
	String edition;
	Scanner sc=new Scanner(System.in);
	publisher()
	{
		System.out.println("Enter the Publisher Name:");
		publisher_name=sc.nextLine();
		System.out.println("Enter the edition:");
		edition=sc.next();
	}
}
class fiction extends publisher
{
	String author;
	String genere;
	int price;
	Scanner sc=new Scanner(System.in);
	fiction()
	{
		super();
		System.out.println("Enter the author:");
		author=sc.nextLine();
		System.out.println("Enter the genere:");
		genere=sc.nextLine();
		System.out.println("Enter the price:");
		price=sc.nextInt();
	}
	void display()
	{
		System.out.println("THE FICTION BOOK DETAILS:");
		System.out.println("The bookid is:"+bookid);
		System.out.println("The book name is:"+bookname);
		System.out.println("The publisher name is:"+publisher_name);
		System.out.println("The edition is:"+edition);
		System.out.println("The author is:"+author);
		System.out.println("The  genere is:"+genere);
		System.out.println("The price is:"+price);
	}
}
class literature extends publisher
{
	String autho;
	String gener;
	int pric;
	Scanner sc=new Scanner(System.in);
	literature()
	{
		super();
		System.out.println("Enter the author:");
		autho=sc.nextLine();
		System.out.println("Enter the genere:");
		gener=sc.nextLine();
		System.out.println("Enter the price:");
		pric=sc.nextInt();
	}
	void display()
	{
		System.out.println("THE LITERATURE BOOK DETAILS:");
		System.out.println("The bookid is:"+bookid);
		System.out.println("The book name is:"+bookname);
		System.out.println("The publisher name is:"+publisher_name);
		System.out.println("The edition is:"+edition);
		System.out.println("The author is:"+autho);
		System.out.println("The  genere is:"+gener);
		System.out.println("The price is:"+pric);
	}
}
class q4 {
	public static void main(String[] args)
	{
		fiction f=new fiction();
		literature l=new literature();
		System.out.println("THE DETAILS OF BOOKS");
		System.out.println("********************");
		f.display();
		l.display();

		
	
	}
}
