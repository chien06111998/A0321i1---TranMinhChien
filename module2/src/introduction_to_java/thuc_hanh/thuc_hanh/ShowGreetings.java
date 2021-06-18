package introduction_to_java.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class ShowGreetings {
    public static void main(String[] args) {
        System.out.println("-----Show greetings-----");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}
