import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        IuserValid validFirstName =(firstName)->{
            Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]+$");
            Matcher check  = pattern.matcher(firstName);
            if(check.matches()){
                System.out.println("....FirstName  Valid....");
            }
            else {
                System.out.println("....FirstName  Invalid....");
            }
        };
        validFirstName.checkValidation("Jitendra");

        IuserValid validLastName =(lastName)->{
            Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]+$");
            Matcher check  = pattern.matcher(lastName);
            if(check.matches()){
                System.out.println("....LastName  Valid....");
            }
            else {
                System.out.println("....LastName  Invalid....");
            }
        };
        validLastName .checkValidation("Banshkar");
        IuserValid validEmail =(Email)->{
            Pattern pattern = Pattern.compile("^[a-zA-Z]+[0-9]+?(@gmail.com)+$");
            Matcher check  = pattern.matcher(Email);
            if(check.matches()){
                System.out.println("....Email valid....");
            }
            else {
                System.out.println("....Email Invalid....");
            }
        };
        validEmail .checkValidation("Jitendra1@gmail.com");
        IuserValid validMobile =(Mobile)->{
            Pattern pattern = Pattern.compile("^?(91)+\\s+[0-9]{10}+$");
            Matcher check  = pattern.matcher(Mobile);
            if(check.matches()){
                System.out.println("....Mobile valid....");
            }
            else {
                System.out.println("....Mobile Invalid....");
            }
        };
        validMobile.checkValidation("91 7828568034");
        IuserValid validPassword =(Password)->{
            Pattern pattern = Pattern.compile("^[A-Z]{1}+[a-z]{5,}?(@)+[0-9]+$");
            Matcher check  = pattern.matcher(Password);
            if(check.matches()){
                System.out.println("....Password valid....");
            }
            else {
                System.out.println("....Password Invalid....");
            }
        };
        validPassword.checkValidation("Jitendra@123");
    }
}