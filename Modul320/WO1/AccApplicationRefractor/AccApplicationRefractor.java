package Modul320.WO1.AccApplicationRefractor;

import java.util.*;

public class AccApplicationRefractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amountToAdd;
        Account Sparkonto = new Account();
        char operation;
        System.out.println("Welcome to the account application");
        do {

            System.out.println("Please enter the amount, 0 (zero) to terminate: ");
            amountToAdd = sc.nextInt();
            System.out.println("To deposit, press +, to withdraw, press -, to see the current amount, press = ");
            operation = sc.next().charAt(0);
            if (operation == '+') {
                Sparkonto.deposit(amountToAdd);

            } else if (operation == '-') {
                Sparkonto.withdraw(amountToAdd);

            } else if (operation == '=') {

                System.out.println("Stand: " + Sparkonto.getAmount());
                amountToAdd = 0;

            } else {

                System.out.println("Invalid operation. Please enter +, - or =.");

            }
        } while (amountToAdd != 0);
        System.out.println("Endkontostand: " + Sparkonto.getAmount());

    }

}
