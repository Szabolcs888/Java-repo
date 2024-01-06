package JavaCore.task05T;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner
        Scanner sc = new Scanner(System.in);
        // scanning parameters
        System.out.println("Please enter your email address");
        String email = sc.nextLine();
        System.out.println("Please enter your name");
        String name = sc.nextLine();
        System.out.println("Please enter your date of birth");
        String birthday = sc.nextLine();


        System.out.println("Please enter your phone number");
        String phone = sc.nextLine();
        System.out.println("Please enter your employer");
        String company = sc.nextLine();
        // validating parameters

        LocalDate birthdayAsDate = null;
        try {
            birthdayAsDate = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        } catch (Exception e) {
            System.out.println("Date is not valid");
            System.exit(1);
        }

        if (email.isEmpty() || name.isEmpty()) {
            System.out.println("Email and name are mandatory parameters");
            System.exit(1);
        }

        // user creation (saving mandatory parameters)

        User u = new User(email, name, birthday);

        // saving optional parameters
        if (!phone.isEmpty()) {
            u.setPhone(phone);
        }

        if (!company.isEmpty()) {
            u.setCompany(company);
        }

        System.out.println(u);
    }
}
