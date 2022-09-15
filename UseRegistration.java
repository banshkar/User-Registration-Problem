import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UseRegistration {
    public  void  validEmail(String email){
        Pattern pattern = Pattern.compile("^[ a-zA-Z]+.+[x-z]?(@bi.co.in)+$");
        Matcher check = pattern.matcher( email);
        if(check.matches()){
            System.out.println(" email is Valid");
        }
        else {
            System.out.println(" email  not Valid ! please Enter valid Name");
        }
    }
    public static void main(String[] args) {
        UseRegistration user =new UseRegistration();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter  email :");
        String  email =sc.nextLine();
        user.validEmail(email);
    }
}
