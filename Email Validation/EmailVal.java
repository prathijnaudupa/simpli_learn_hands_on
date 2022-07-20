import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class EmailVal {

    public static void main(String[] args) {
        
        ArrayList<String> emailID = new ArrayList<String>();
        
        emailID.add("john1@gmail.com");
        emailID.add("ram@gmail.com");
        emailID.add("gopal@gmail.com");
        emailID.add("ramesh@gmail.com");
        emailID.add("guru@gmail.com");
        String EmailFind;
        System.out.println("E-mail: ");
        Scanner scanner = new Scanner(System.in);
        EmailFind = scanner.nextLine();
        String regex = "^(.+)@(.+)$";
        Matcher matcher = Pattern.compile(regex).matcher(EmailFind);
        if (matcher.matches() && emailID.stream().anyMatch(mail -> mail.equals(EmailFind))) {
            System.out.println(EmailFind + " = is present");
        } else {
            System.out.println("Not a valid or is not present");
        }

   }

}
