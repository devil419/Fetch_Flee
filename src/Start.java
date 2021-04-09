
import Registration.*;

import java.util.Scanner;

public class Start
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);


        System.out.println("----------------------------------------------------------------");
        System.out.println("|                      WELCOME TO FETCH FLEE                     | ");
        System.out.println("-----------------------------------------------------------------");

        System.out.println("                   Choose Your Option --------->");
        System.out.println("                      1. Registration/Login");
        System.out.println("                      2. Purchase A Ticket");
        System.out.println("                      3. Verify a Ticket");
        System.out.println("                      4. Contact Us");


        Registration userEmptyObj = new User();

         System.out.print("                     Enter Full Name : ");
         String fullName = input.nextLine();
         System.out.print("                     Enter Username : ");
         String username= input.nextLine();
         System.out.print("                     Enter Password : ");
         String password= input.nextLine();
         System.out.print("                      Enter Mail Address : ");
         String mailAddress= input.nextLine();
         System.out.print("                      Enter Mobile : ");
         String mobile= input.nextLine();

        Registration userObj = new User(fullName,username,password,mailAddress,mobile);
        System.out.println(userObj.getFullName());
        System.out.println(userObj.getUsername());
        System.out.println(userObj.getPassword());
        System.out.println(userObj.getMailAddress());
        System.out.println(userObj.getMobile());










    }




}
