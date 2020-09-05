import java.util.Scanner;
class email
{
	private String firstname;
	private String lastname;
	private String Password;
	private String Departments;
	private String email;
	private int mailboxCapacity=500;
	private int defaultPasswordLength=10;
	private String alternateemail;
	private String companySuffix="sunsky.com";
	//constructor firstname and last name
	//create a department function and call
	//show which department you are working
	// set mail box capacity
	//change password
	email(String firstname,String lastname)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		//System.out.println("Email created: "+this.firstname+" "+this.lastname);
		this.Departments=setdepartment();
	this.Password=randomPassword(8);
		System.out.println("Your Password is:"+this.Password);
		email = firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+Departments+"."+companySuffix; 
		//System.out.println("your email is:"+email);
		}
		
	 private String setdepartment()
		{
			
			System.out.print("DEPARTMNET CODES:\n1:for sales\n2:for Development\n3:For Accounting\n0:for none\nEnter department codes:");
			Scanner s1= new Scanner(System.in);
			int Depchoice=s1.nextInt();
			if(Depchoice==1)
			return"sales";
			else if(Depchoice==2)
			return"Development";
			else if(Depchoice==3)
			return"Accounting";
			else 
			return"none";
		
		}
		private String randomPassword(int length)
		{
			String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789@$%";
			char[] password=new char[length];
			for(int i=0;i<length;i++)
			{
			int rand=(int)(	Math.random()*passwordSet.length());
				password[i]=passwordSet.charAt(rand);
				}
			return new String(password);
			
			}
			
			public void setMailboxCapacity(int capacity)
			{
				this.mailboxCapacity = capacity;
				}
				public void setAlternateEmail(String altEmail)
				{
					this.alternateemail=altEmail;
					}
					public void changePassword(String password)
					{
						this.Password =Password;
						}
public int getMailboxCapacity()
{return mailboxCapacity;}
public String getAlternateEmail()
{return alternateemail;}
public String getPassword(){return Password;}
public  String showInfo()
{return"DISPLAY NAME:"+firstname+" "+lastname+"\n"+"COMPANY EMAIL:"+email+"\n"+"MAILBOX CAPACITY:"+mailboxCapacity+"mb";	
	}
						
	}

	public class javaproject
	{
		public static void main(String args[])
		{
			
			email r1=new email("Nandish","Shah");
			System.out.println(r1.showInfo());
			}
		
		
		}