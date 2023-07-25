package DSA_Assignments;

import java.util.Scanner;

public class CUI_application {
    public static void main(String[] args) {
        String username = "shivani";
        String password = "123";
        boolean isAuthenticated = false;
        int attempts=0;
        Scanner sc = new Scanner(System.in);
        while (attempts<3 && !isAuthenticated) {
            System.out.println("Enter user name");
            String name = sc.next();
            System.out.println("Enter password");
            String pass = sc.next();

            if (username.equals(name) && password.equals(pass)) {
                System.out.println("welcome");
                isAuthenticated = true;
            } else {
                attempts++;
                System.out.println("Invalid credentials");
            }
        }
            if(!isAuthenticated){
                System.out.println("Contact administrator");
            }
        }
    }

