import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UseRegistration {
    public  void  valid(String lastName){
        Pattern pattern = Pattern.compile("^[A-Z]{3}");
        Matcher check = pattern.matcher(lastName);
        if(check.matches()){
            System.out.println("last Name  is Valid");
        }
        else {
            System.out.println(" last Name not Valid ! please Enter valid Name");
        }
    }
    public static void main(String[] args) {
        UseRegistration user =new UseRegistration();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter last Name :");
        String lastName =sc.nextLine();
        user.valid(lastName);
    }
}
