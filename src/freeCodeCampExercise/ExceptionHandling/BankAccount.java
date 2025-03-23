package freeCodeCampExercise.ExceptionHandling;

/**
 * Custom exception for insufficient funds.
 */
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

/**
 * Custom exception for invalid deposit amounts.
 */
class InvalidDepositAmountException extends Exception {
    public InvalidDepositAmountException(String message) {
        super(message);
    }
}

/**
 * Custom exception for invalid withdrawal amounts.
 */
class InvalidWithdrawalAmountException extends Exception {
    public InvalidWithdrawalAmountException(String message) {
        super(message);
    }
}

/**
 * Custom exception for a frozen account.
 */
class AccountFrozenException extends Exception {
    public AccountFrozenException(String message) {
        super(message);
    }
}

public class BankAccount {

    private double balance;
    private boolean isFrozen;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.isFrozen = false;
    }

    public void freezeAccount() {
        this.isFrozen = true;
    }

    /**
     * Deposit money into the bank account.
     *
     * @param amount Amount to deposit.
     * @throws InvalidDepositAmountException if the deposit amount is non-positive.
     * @throws AccountFrozenException if the account is frozen.
     */
    public void deposit(double amount) throws InvalidDepositAmountException, AccountFrozenException {
        if (isFrozen) {
            throw new AccountFrozenException("Account is frozen, cannot perform operations.");
        }
        if (amount <= 0) {
            throw new InvalidDepositAmountException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    /**
     * Withdraw money from the bank account.
     *
     * @param amount Amount to withdraw.
     * @throws InsufficientFundsException if there isn't enough balance.
     * @throws InvalidWithdrawalAmountException if the withdrawal amount is non-positive.
     * @throws AccountFrozenException if the account is frozen.
     */
    public void withdraw(double amount) throws InsufficientFundsException, InvalidWithdrawalAmountException, AccountFrozenException {
        if (isFrozen) {
            throw new AccountFrozenException("Account is frozen, cannot perform operations.");
        }
        if (amount <= 0) {
            throw new InvalidWithdrawalAmountException("Withdrawal amount must be positive.");
        }
        if (balance < amount) {
            throw new InsufficientFundsException("Insufficient funds in the account.");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0);

        try {
            account.deposit(-50);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            account.withdraw(600);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            account.freezeAccount();
            account.deposit(50);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Current balance: " + account.getBalance());
    }
}
