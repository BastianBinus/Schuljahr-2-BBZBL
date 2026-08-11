package Modul320.WO1;

import java.util.ArrayList;
import java.util.Scanner;

public class AccApplication {
    public static void main(String[] args) {
        int amount = 0;
        char operation;
        int amountToAdd;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> transactions = new ArrayList<String>();

        System.out.println("Welcome to the account application");
        System.out.println("Please enter the amount, 0 (zero) to terminate: ");

        amountToAdd = scanner.nextInt();

        while (amountToAdd != 0) {
            System.out.println("To deposit, press +, to withdraw, press -, to see the current amount, press = ");
            operation = scanner.next().charAt(0);

            if (operation == '+') {
                transactions.add("Deposit: " + amountToAdd);
                amount += amountToAdd;

            } else if (operation == '-') {
                transactions.add("Withdrawal: " + amountToAdd);
                amount -= amountToAdd;

            } else if (operation == '=') {

                System.out.println("Current amount: " + amount);
                amountToAdd = 0;

            } else {

                System.out.println("Invalid operation. Please enter +, - or =.");

            }

            System.out.println("Please enter the amount, 0 (zero) to terminate: ");
            amountToAdd = scanner.nextInt();
        }

        System.out.println("Final amount: " + amount);
        System.out.println("Transaction History:");
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
