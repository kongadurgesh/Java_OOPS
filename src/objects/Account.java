package objects;

/*
 * Question 10: Exception Handling
Create a class Account with methods to deposit and withdraw money.
Ensure that the account balance cannot go negative.
Throw custom exceptions InsufficientFundsException and InvalidAmountException where appropriate.
Demonstrate exception handling in the main method.
 */
public class Account {
    private Integer balance = 0;

    public void withdraw(Integer money) {
        try {
            if (balance - money < 0) {
                throw new InsufficientFundsException("Insufficient Funds in the account...");
            }
            balance -= money;
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }
    }

    public void deposit(Integer money) {
        try {
            if (money < 0) {
                throw new InvalidAmountException("Deposit Money cannot be negative...");
            }
            balance += money;
        } catch (InvalidAmountException e) {
            e.printStackTrace();
        }
    }
}
