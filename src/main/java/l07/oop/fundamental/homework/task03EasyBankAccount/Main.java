package l07.oop.fundamental.homework.task03EasyBankAccount;

public class Main {
    public static void main(String[] args) {
        //Create BankAccount class with private fields: owner, balance.
        //Add constructor and methods:
        //deposit(double amount)
        //withdraw(double amount)
        //printSummary()
        //Prevent invalid operations (amount <= 0, overdraft).
        //In main, run several operations and print final state.
        BankAccount account = new BankAccount("Eli", 2500);
        account.deposit(500);
        account.deposit(0);
        account.withdraw(0);
        account.withdraw(3600);
        account.withdraw(1000);
        account.printSummary();

    }
}
