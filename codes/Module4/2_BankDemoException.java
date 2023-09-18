/* Write Java Program to Create Account with 1000 Rs Minimum Balance, 
Deposit Amount, Withdraw Amount and Also Throws LessBalanceException. It
has a Class Called LessBalanceException Which returns the Statement that 
Says WithDraw Amount(_Rs) is Not Valid. It has a Class Which Creates 2 Accounts, 
Both Account Deposite Money and One Account Tries to WithDraw more Money,
which Generates a LessBalanceException Take Appropriate Action for the Same.
*/

class LessBalanceException extends Exception {
    public LessBalanceException(double amount) {
        super("Withdraw Amount (" + amount + " Rs) is not valid. Insufficient balance.");
    }
}

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " Rs into Account " + accountNumber);
    }

    public void withdraw(double amount) throws LessBalanceException {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " Rs from Account " + accountNumber);
        } else {
            throw new LessBalanceException(amount);
        }
    }
}

public class BankDemoException {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("A12345", 1000.0);
        BankAccount account2 = new BankAccount("B67890", 2000.0);

        // Deposit money into both accounts
        account1.deposit(500.0);
        account2.deposit(1000.0);

        // Try to withdraw more money than available in account1 (generates LessBalanceException)
        try {
            account1.withdraw(2000.0);
        } catch (LessBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Withdraw money from account2
        try {
            account2.withdraw(1500.0);
        } catch (LessBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Print final balances
        System.out.println("Account 1 Balance: " + account1.getBalance() + " Rs");
        System.out.println("Account 2 Balance: " + account2.getBalance() + " Rs");
    }
}


