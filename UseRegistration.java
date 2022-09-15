import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UseRegistration {
    public  void  validEmail(String mobile){
        Pattern pattern = Pattern.compile("^?(91)+?\\s+[0-9]{10}+$");
        Matcher check = pattern.matcher(mobile);
        if(check.matches()){
            System.out.println("  mobile is Valid");
        }
        else {
            System.out.println("  mobile  not Valid ! please Enter valid Name");
        }
    }
    public static void main(String[] args) {
        UseRegistration user =new UseRegistration();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter  mobile :");
        String   mobile =sc.nextLine();
        user.validEmail( mobile);
    }
}
