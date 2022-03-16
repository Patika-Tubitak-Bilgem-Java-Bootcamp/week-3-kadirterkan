package patika.patikastore;

import java.util.Scanner;

public class Main {

    public final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Boolean exitFlag = false;

        System.out.println("Welcome to hell");

        while (!exitFlag) {
            printPanel();

            switch (getInputFromUser()) {
                case 1 ->
            }

        }
    }

    public static void printPanel() {
        System.out.println("1 - Notebook Transactions");
        System.out.println("2 - Mobile Phone Transactions");
        System.out.println("3 - List Brand");
        System.out.println("0 - End this nightmare");
    }

    public static Integer getInputFromUser() {
        System.out.print("Your choice : ");
        return input.nextInt();
    }
}
