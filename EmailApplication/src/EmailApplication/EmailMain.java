package EmailApplication;
import java.util.Scanner;
/**
 * @author Fredrick Kamau class EmailMain which takes in user entered 
 * credentials and creates email accounts for new hires.  
 */
public class EmailMain
{
  public static void main(String[] arg)
  {
    Scanner input = userInput();    
    
    //Generate new employee email 
    Email newEmployee = new Email(firstName(input), secondName(input));
    System.out.println(newEmployee.showInfo());
    input.close(); 
  }
  
  //Create a new scanner object
  public static Scanner userInput()
  {    
    return new Scanner(System.in);
  }
  
  //Get first name
  public static String firstName(Scanner input)
  {
    System.out.print("Enter First Name: ");
    return input.nextLine();
  }
  
  //Get second name
  public static String secondName(Scanner input)
  {
    System.out.print("Enter Last Name: ");
    return input.nextLine();
  }
}//end class
