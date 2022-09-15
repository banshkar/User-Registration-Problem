import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UseRegistration {
    public  void  valid(String firstName){
        Pattern pattern = Pattern.compile("^[A-Z]{3}");
        Matcher check = pattern.matcher(firstName);
        if(check.matches()){
            System.out.println("first Name is Valid");
        }
        else {
            System.out.println("First name not Valid ! please Enter valid Name");
        }
    }
    public static void main(String[] args) {
        UseRegistration user =new UseRegistration();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first Name :");
        String firstName =sc.nextLine();
        user.valid(firstName);
    }
}
