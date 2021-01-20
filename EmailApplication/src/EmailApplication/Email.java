package EmailApplication;

import java.util.Scanner;

public class Email
{
  private String firstName;
  private String lastName;
  private String password;
  private String department;
  private int mailboxCapacity = 500;
  private String emailAddress; 
  private String alternateEmail;
  private int defaultPasswordLength = 12; 
  private String companyDomain = "healthyu.com";
  /**
   * @param firstName
   * @param lastName
   */
  //Constructor to receive first and last name 
  public Email(String firstName, String lastName)
  {
    this.firstName = firstName;
    this.lastName = lastName;
        
    //Get the department
    this.department = setDepartment();
        
    //Get the password
    this.password = randomPassword(defaultPasswordLength);
        
    //Generate email
    emailAddress = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@"
        + this.department +"."+ companyDomain.toLowerCase();
   }
    
  //Get the department information
  private String setDepartment()
  {
    System.out.print("\nEnter the department:\n1. IT\n2. HR\n3. Finance\n"
        + "4. Logistics\n5. Operations\nEnter department number: ");
    Scanner input = new Scanner(System.in);
    int deptChoice = Integer.parseInt(input.nextLine());
    input.close();
    if(deptChoice == 1) {return "IT";}
    else if(deptChoice == 2) {return "HR";}
    else if(deptChoice == 3) {return "Finance";}
    else if(deptChoice == 4) {return "Logistics";}
    else if(deptChoice == 5) {return "Operations";}
    else {return "";}
  }
  
  //Generate random password
  private String randomPassword(int length)
  {
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%^&*";
    char[] password = new char[length];
    for(int i = 0; i < length; i++) 
    {
      int random = (int)(Math.random()  * passwordSet.length());
      password[i] = passwordSet.charAt(random);
    }
    return new String(password);
  }
  
  //Set the mailbox capacity
  public void setMailboxCapacity(int capacity)
  {
    this.mailboxCapacity = capacity;
  }
  
  //Set alternate email
  public void setAlternateEmail(String alternateEmail)
  {
    this.alternateEmail = alternateEmail;
  }
  
  //Change password
  public void changePassword(String password)
  {
    this.password = password;
  }
  
  //Get the mailbox capacity
  public int getMailboxCapacity()
  {
    return this.mailboxCapacity; 
  }
  
  //Get the alternate email
  public String getAlternateEmail()
  {
    return this.alternateEmail;
  }
  
  //Get password
  public String getPassword()
  {
    return this.password;
  }
  
  public String showInfo()
  {
    return "\nDepartment name: " + this.department + 
           "\nFull Name: " + this.firstName + " " + this.lastName +
           "\nEmail ID: " + this.emailAddress +
           "\nYour password: " + this.password +
           "\nMailbox capacity: " + this.mailboxCapacity + " Mb"; 
  }
}//end class