package Modul320.WO1.AccApplicationRefractor;

public class Account {
    private int amount = 0;

    public Account(int initialBalance) {
        this.amount = initialBalance;
    }

    public void deposit(int amountExchange) {
        amount += amountExchange;
    }

    public void withdraw(int amountExchange) {
        amount -= amountExchange;
    }

    public int getAmount() {
        return amount;
    }

}