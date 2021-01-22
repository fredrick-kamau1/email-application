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
  private int defaultPasswordLength = 12;
  private String companyDomain = "healthyu.com";

  /**
   * @param firstName
   * @param lastName
   */
  // Constructor to receive first and last name
  public Email()
  {
    Scanner in = input();
    System.out.print("Enter First name: ");
    this.firstName = in.nextLine();
    System.out.print("Enter Last name: ");
    this.lastName = in.nextLine();

    // Get the department
    this.department = setDepartment();

    // Get the password
    this.password = randomPassword(defaultPasswordLength);

    // Generate email
    this.emailAddress = firstName.toLowerCase() + "." + lastName.toLowerCase()
        + "@" + this.department + "." + companyDomain.toLowerCase();
  }

  // Create keyboard input
  public Scanner input()
  {
    return new Scanner(System.in);
  }

  // Set and get the department information
  private String setDepartment()
  {
    System.out.print("\nEnter the department:\n1. IT\n2. HR\n3. Finance\n"
        + "4. Logistics\n5. Operations\nEnter department number: ");
    Scanner in = input();
    int deptChoice = Integer.parseInt(in.nextLine());
    in.close();
    if (deptChoice == 1)
    {
      return "IT";
    } else if (deptChoice == 2)
    {
      return "HR";
    } else if (deptChoice == 3)
    {
      return "Finance";
    } else if (deptChoice == 4)
    {
      return "Logistics";
    } else if (deptChoice == 5)
    {
      return "Operations";
    } else
    {
      return "";
    }
  }

  // Generate random password
  private String randomPassword(int length)
  {
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%^&*";
    char[] password = new char[length];
    for (int i = 0; i < length; i++)
    {
      int random = (int) (Math.random() * passwordSet.length());
      password[i] = passwordSet.charAt(random);
    }
    return new String(password);
  }

  public String showInfo()
  {
    return "\nDepartment name: " + this.department + "\nFull Name: "
        + this.firstName + " " + this.lastName + "\nEmail ID: "
        + this.emailAddress + "\nYour password: " + this.password
        + "\nMailbox capacity: " + this.mailboxCapacity + " Mb";

  }
}// end class