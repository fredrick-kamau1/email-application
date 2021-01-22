package EmailApplication;

/**
 * @author Fredrick Kamau class EmailMain which takes in user entered 
 * credentials and creates email accounts for new hires.  
 */
public class EmailMain
{
  public static void main(String[] arg)
  {       
    //Generate new employee email 
    Email newEmployee = new Email();
    System.out.println(newEmployee.showInfo());
  }
 
}//end class
