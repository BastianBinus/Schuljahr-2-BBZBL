import java.util.Scanner;

public class BetragW01 {
    public static void main(String[] args) {
        int amount = 0;
        char operation;
        int amountToAdd;
        Scanner scanner = new Scanner(System.in);
        String[] abrechnungen = new String[100];
        int index = 0;

        System.out.println("Welcome to the account application");
        System.out.println("Please enter the amount, 0 (zero) to terminate: ");

        amountToAdd = scanner.nextInt();

        while (amountToAdd != 0) {
            System.out.println("To deposit, press +, to withdraw, press -, to see the current amount, press = ");
            operation = scanner.next().charAt(0);

            if (operation == '+') {
                abrechnungen[index] = "Deposit: " + amountToAdd;
                index++;
                amount += amountToAdd;

            } else if (operation == '-') {
                abrechnungen[index] = "Withdrawal: " + amountToAdd;
                index++;
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
        for (int i = 0; i < index; i++) {
            System.out.println(abrechnungen[i]);
        }
    }
}
