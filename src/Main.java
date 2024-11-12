import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String thing;
        thing = scan.nextLine();
        prettyHeader(thing);
    }
    public static void prettyHeader(String msg) {

        for (int i = 0; i < 60; i++) {
        System.out.print("*");
    }
        System.out.println();
        System.out.print("***");
        for (int i = 0; i < (26 - (msg.length()) / 2); i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < 27 - (msg.length()) / 2; i++) {
            System.out.print(" ");
        }
        System.out.print("***");
        System.out.println();
        for (int i = 0; i < 60; i++) {
            System.out.print("*");
        }
    }



}