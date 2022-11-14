package stringprogram;

import java.util.Scanner;

public class TrimTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter username");
        String username=sc.nextLine();
        System.out.println("Enter password");
        String password=sc.nextLine();

        System.out.println("length of username:" +username.length());
        System.out.println("length of password:" +password.length());

        if(username.trim().equalsIgnoreCase("dipak")&&password.trim().equalsIgnoreCase("abc1234"))
        {
            System.out.println("welcome");
        }
        else
        {

            System.out.println("invalid user!!! try again.");
        }
        System.out.println("length od username :"+username.trim().length());
        System.out.println("length od password :"+password.trim().length());

    }
}
