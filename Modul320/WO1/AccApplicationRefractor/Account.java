package Modul320.WO1.AccApplicationRefractor;

public class Account {
    private int amount = 0;

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