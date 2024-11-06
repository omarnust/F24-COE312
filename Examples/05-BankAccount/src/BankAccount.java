
class BankAccount {
    private int balance;
    
    public BankAccount(int balance) {
        this.balance = balance;
        
    }
    
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ", balance: " + getBalance());
    }
    
    public synchronized void withdraw(int amount) throws Exception {
        if (balance < amount) {
            System.out.println("Insufficient funds!");
        }
        balance -= amount;
        System.out.println("Withdrawn " + amount + ", balance: " + getBalance());
    }
    
    public synchronized int getBalance() {
        return balance;
    }
}

