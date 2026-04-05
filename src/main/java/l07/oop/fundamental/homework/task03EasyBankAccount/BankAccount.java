package l07.oop.fundamental.homework.task03EasyBankAccount;

public class BankAccount {

    private final String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than 0.");
        }else{
            balance += amount;
            System.out.printf("Deposited: %.2f Balance: %.2f%n", amount, balance );
        }
    }

    public void withdraw(double amount) {
        if(amount <= 0){
            System.out.println("Insufficient funds.");
        }else if(amount > balance){
            System.out.println("Overdraft");
        }else{
            balance -= amount;
            System.out.printf("Withdrawn: %.2f Balance: %.2f%n", amount, balance);
        }
    }

    public void printSummary() {
        System.out.println("Owner : " + owner);
        System.out.println("Balance : " + balance);
    }
}
