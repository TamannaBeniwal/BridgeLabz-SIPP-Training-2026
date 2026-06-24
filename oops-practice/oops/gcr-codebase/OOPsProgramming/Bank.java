class Banka {
    private int accountNumber;
    private String holder;
    private double balance;


    static int totalAccounts = 0;


    public Banka(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holder + " deposited ₹" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(holder + " withdrew ₹" + amount);
        } else {
            System.out.println("Insufficient balance for " + holder);
        }
    }


    public void getStatement() {
        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Holder Name    : " + holder);
        System.out.println("Balance        : ₹" + balance);
    }
}

public class Bank {
    public static void main(String[] args) {

        Banka acc1 = new Banka(101, "Rahul", 10000);
        Banka acc2 = new Banka(102, "Priya", 15000);
        Banka acc3 = new Banka(103, "Aman", 20000);

        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.deposit(500);
        acc1.withdraw(3000);
        acc1.withdraw(15000);

        acc2.deposit(3000);
        acc2.withdraw(2000);
        acc2.deposit(1000);
        acc2.withdraw(5000);
        acc2.withdraw(2000);

        acc3.deposit(5000);
        acc3.withdraw(4000);
        acc3.deposit(2000);
        acc3.withdraw(3000);
        acc3.withdraw(10000);

        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        System.out.println("\nTotal Accounts Created: "
                + BankAccount.totalAccounts);
    }
}