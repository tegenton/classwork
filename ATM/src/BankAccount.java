public class BankAccount {
    private:
        int balance = 0;
        int accountNumber;
        int pin;
        AccountHolder accountHolder;
    public BankAccount(AccountHolder accountHolder, int pin, int accountNumber) {
        this.accountHolder = accountHolder;
        this.pin = pin;
        this.accountNumber = accountNumber;
    }
    public void deposit(int amount) {
        balance += amount;
    }
    public void withdraw(int amount) {
        balance -= amount;
    }
    public int getBalance() {
        return balance;
    }
}
